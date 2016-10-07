package Enterprise.Generics;

import java.util.List;

public interface Executor<T> {

    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task<? extends T> task) throws ExecuteCalledException;

    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task<? extends T> task, Validator<? super T> validator) throws ExecuteCalledException;

    // Выполнить все добавленые таски
    void execute();

    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<? extends T> getValidResults() throws ExecuteNotCalledException;

    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<? extends T> getInvalidResults() throws ExecuteNotCalledException;
}
