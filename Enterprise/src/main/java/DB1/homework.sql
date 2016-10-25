create database restorant;

CREATE TABLE employees (
  id integer NOT NULL,
  first_name character(50) NOT NULL,
  last_name character(50) NOT NULL,
  date_of_birth date NOT NULL,
  phone_number character(50),
  position_id integer,
  salary real,
  CONSTRAINT "PK_employees" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_employees" UNIQUE (id)
  );

CREATE TABLE positions (
  id integer NOT NULL,
  positions character(50) NOT NULL,
  CONSTRAINT "PK_positions" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_positions" UNIQUE (id)
  );

CREATE TABLE cooked_dishes (
  id integer NOT NULL,
  dish_id integer NOT NULL,
  employee_id integer NOT NULL,
  order_id integer NOT NULL,
  date date NOT NULL,
  CONSTRAINT "PK_cooked_dishes" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_cooked_dishes" UNIQUE (id)
  );

CREATE TABLE category_of_dishes (
  id integer NOT NULL,
  name character(50) NOT NULL,
  CONSTRAINT "PK_category_of_dishes" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_category_of_dishes" UNIQUE (id),
  CONSTRAINT "UNIQUE_name_category_of_dishes" UNIQUE (name)
  );

CREATE TABLE orders (
  id integer NOT NULL,
  order_of_number integer,
  employee_id integer NOT NULL,
  list_of_dishes_id integer NOT NULL,
  table_number integer,
  date date,
  CONSTRAINT "PK_orders" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_orders" UNIQUE (id)
);

CREATE TABLE storage (
  id integer NOT NULL,
  ingredient_id integer NOT NULL,
  amount integer,
  CONSTRAINT "PK_storage" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_storage" UNIQUE (id)
);

CREATE TABLE ingredients (
  id integer NOT NULL,
  name character(50) NOT NULL,
  CONSTRAINT "PK_ingredients" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_ingredients" UNIQUE (id),
  CONSTRAINT "UNIQUE_id_ingredients_name" UNIQUE (name)
);

CREATE TABLE list_of_ingredients (
  id integer NOT NULL,
  ingredient_id_n1 integer,
  ingredient_id_n2 integer,
  ingredient_id_n3 integer,
  ingredient_id_n4 integer,
  ingredient_id_n5 integer,
  ingredient_id_n6 integer,
  ingredient_id_n7 integer,
  ingredient_id_n8 integer,
  ingredient_id_n9 integer,
  ingredient_id_n10 integer,
  CONSTRAINT "PK_list_of_ingridients" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_list_of_ingridients" UNIQUE (id)
);

CREATE TABLE dishes (
  id integer NOT NULL,
  name character(50) NOT NULL,
  list_of_ingredients_id integer NOT NULL,
  price real NOT NULL,
  weight integer,
  category_of_dishes_id integer,
  CONSTRAINT "PK_dishes" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_dishes" UNIQUE (id),
  CONSTRAINT "UNIQUE_id_name" UNIQUE (name)
);

CREATE TABLE list_of_dishes (
  id integer NOT NULL,
  dish_id_n1 integer,
  dish_id_n2 integer,
  dish_id_n3 integer,
  dish_id_n4 integer,
  dish_id_n5 integer,
  dish_id_n6 integer,
  dish_id_n7 integer,
  dish_id_n8 integer,
  dish_id_n9 integer,
  dish_id_n10 integer,
  CONSTRAINT "PK_list_of_dishes" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_list_of_dishes" UNIQUE (id)
 );

CREATE TABLE menu (
  id integer NOT NULL,
  name character(50) NOT NULL,
  list_of_dishes_id integer NOT NULL,
  CONSTRAINT "PK_menu" PRIMARY KEY (id),
  CONSTRAINT "UNIQUE_id_menu" UNIQUE (id)
);

INSERT INTO employees VALUES (1, 'Александр', 'Петров', '01.18.1990', '0965482019', 1, 15000 );
INSERT INTO employees VALUES (2, 'Дмитрий', 'Валинов', '04.17.1984', '0508469576', 2, 10000 );
INSERT INTO employees VALUES (3, 'Алексей', 'Буков', '09.25.1989', '0735224613', 1, 15000 );
INSERT INTO employees VALUES (4, 'Ирина', 'Ларина', '02.14.1994', '0996281419', 2, 8000 );
INSERT INTO employees VALUES (5, 'Евгений', 'Ищенко', '11.09.1989', '0669102610', 2, 10000 );
INSERT INTO employees VALUES (6, 'Владислав', 'Сергеенко', '04.15.1985', '0961445065', 3, 22000 );
INSERT INTO employees VALUES (7, 'Андрей', 'Москаленко', '05.28.1994', '0732560420', 4, 6000 );
INSERT INTO employees VALUES (8, 'Светлана', 'Фащенко', '08.11.1990', '0663885290', 4, 6000 );

INSERT INTO cooked_dishes VALUES (1, 1, 3, 1, '10.21.20016');
INSERT INTO cooked_dishes VALUES (2, 2, 3, 1, '10.21.20016');
INSERT INTO cooked_dishes VALUES (3, 3, 3, 1, '10.21.20016');
INSERT INTO cooked_dishes VALUES (4, 4, 5, 2, '10.21.20016');
INSERT INTO cooked_dishes VALUES (5, 5, 6, 3, '10.21.20016');
INSERT INTO cooked_dishes VALUES (6, 6, 5, 4, '10.21.20016');
INSERT INTO cooked_dishes VALUES (7, 5, 5, 5, '10.21.20016');

INSERT INTO positions VALUES (1, 'waiter');
INSERT INTO positions VALUES (2, 'cook');
INSERT INTO positions VALUES (3, 'manager');
INSERT INTO positions VALUES (4, 'cleaner');

INSERT INTO category_of_dishes VALUES (1, 'Первое');
INSERT INTO category_of_dishes VALUES (2, 'Гарнир');
INSERT INTO category_of_dishes VALUES (3, 'Основные блюда');
INSERT INTO category_of_dishes VALUES (4, 'Салаты');
INSERT INTO category_of_dishes VALUES (5, 'Напитки');

INSERT INTO orders VALUES (1, 1, 1, 1, 1, '10.21.2016');
INSERT INTO orders VALUES (2, 2, 1, 1, 1, '10.21.2016');
INSERT INTO orders VALUES (3, 4, 3, 2, 2, '10.21.2016');
INSERT INTO orders VALUES (4, 4, 2, 3, 3, '10.21.2016');
INSERT INTO orders VALUES (5, 4, 1, 3, 3, '10.21.2006');

INSERT INTO storage VALUES (1, 1, 10);
INSERT INTO storage VALUES (2, 2, 8);
INSERT INTO storage VALUES (3, 3, 34);
INSERT INTO storage VALUES (4, 4, 89);
INSERT INTO storage VALUES (5, 5, 17);
INSERT INTO storage VALUES (6, 6, 13);
INSERT INTO storage VALUES (7, 7, 7);
INSERT INTO storage VALUES (8, 8, 4);
INSERT INTO storage VALUES (9, 9, 0);

INSERT INTO ingredients VALUES (1, 'Картофель');
INSERT INTO ingredients VALUES (2, 'Свекла');
INSERT INTO ingredients VALUES (3, 'Мясо');
INSERT INTO ingredients VALUES (4, 'Капуста');
INSERT INTO ingredients VALUES (5, 'Рис');
INSERT INTO ingredients VALUES (6, 'Помидоры');
INSERT INTO ingredients VALUES (7, 'Огурцы');
INSERT INTO ingredients VALUES (8, 'Кофе');
INSERT INTO ingredients VALUES (9, 'Яйца');

INSERT INTO list_of_ingredients VALUES (1, 1, 2, 3, 4, 6);
INSERT INTO list_of_ingredients VALUES (2, 3, 5);
INSERT INTO list_of_ingredients VALUES (3, 3);
INSERT INTO list_of_ingredients VALUES (4, 1, 3);
INSERT INTO list_of_ingredients VALUES (5, 3, 5, 4);
INSERT INTO list_of_ingredients VALUES (6, 3, 6, 4, 7);
INSERT INTO list_of_ingredients VALUES (7, 9, 6, 3);
INSERT INTO list_of_ingredients VALUES (8, 1);
INSERT INTO list_of_ingredients VALUES (9, 8);

INSERT INTO dishes VALUES (1, 'Борщ', 1, 30, 300, 1);
INSERT INTO dishes VALUES (2, 'Плов', 2, 30, 200, 3 );
INSERT INTO dishes VALUES (3, 'Стейк', 3, 3, 200, 3);
INSERT INTO dishes VALUES (4, 'Драники с мясом', 3, 25, 400, 3);
INSERT INTO dishes VALUES (5, 'Голубцы', 3, 35, 300, 3);
INSERT INTO dishes VALUES (6, 'Салат мясной', 4, 35, 300, 4);
INSERT INTO dishes VALUES (7, 'Омлет', 3, 35, 300, 3);
INSERT INTO dishes VALUES (8, 'Пюре', 2, 15, 300, 2);

INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3) VALUES (1, 1, 5, 9);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3) VALUES (2, 3, 7, 10);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3, dish_id_n4, dish_id_n5) VALUES (3, 2, 6, 7, 9, 11);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2) VALUES (4, 2, 8);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3, dish_id_n4, dish_id_n5, dish_id_n6) VALUES (5, 1, 3, 4, 7, 5, 9);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3, dish_id_n4) VALUES (6, 1, 4, 6, 10);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3, dish_id_n4, dish_id_n5, dish_id_n6, dish_id_n7, dish_id_n8, dish_id_n9, dish_id_n10) VALUES (8, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11);
INSERT INTO list_of_dishes (id, dish_id_n1, dish_id_n2, dish_id_n3, dish_id_n4, dish_id_n5, dish_id_n6) VALUES (9, 1, 2, 5, 7, 8, 9);

ALTER TABLE employees ADD FOREIGN KEY (position_id) REFERENCES positions;
ALTER TABLE cooked_dishes ADD FOREIGN KEY (dish_id) REFERENCES dishes;
ALTER TABLE cooked_dishes ADD FOREIGN KEY (dish_id) REFERENCES employees;
ALTER TABLE cooked_dishes ADD FOREIGN KEY (order_id) REFERENCES orders;
ALTER TABLE orders ADD FOREIGN KEY (employee_id) REFERENCES employees;
ALTER TABLE orders ADD FOREIGN KEY (list_of_dishes_id) REFERENCES list_of_dishes;
ALTER TABLE storage ADD FOREIGN KEY (ingredient_id) REFERENCES ingredients;
ALTER TABLE dishes ADD FOREIGN KEY (category_of_dishes_id) REFERENCES category_of_dishes;
ALTER TABLE dishes ADD FOREIGN KEY (list_of_ingredients_id) REFERENCES list_of_ingredients;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES list_of_dishes;

ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES dishes;
ALTER TABLE menu ADD FOREIGN KEY (list_of_dishes_id) REFERENCES list_of_dishes;
