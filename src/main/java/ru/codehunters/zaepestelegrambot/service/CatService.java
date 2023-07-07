package ru.codehunters.zaepestelegrambot.service;

import ru.codehunters.zaepestelegrambot.exception.NotFoundException;
import ru.codehunters.zaepestelegrambot.model.animals.Cat;

import java.util.List;

public interface CatService {

    /**
     * Возвращает объект кота по его идентификатору.
     *
     * @param id идентификатор кота в базе данных
     * @return объект кота с указанным идентификатором
     * @throws NotFoundException если кот с указанным идентификатором не найден в базе данных
     */
    Cat getById(Long id);

    /**
     * Возвращает объект кота, принадлежащего хозяину с указанным идентификатором.
     *
     * @param id идентификатор хозяина кота в базе данных
     * @return список котов указанного хозяина
     * @throws NotFoundException если кот с хозяином, имеющим указанный идентификатор, не найден в базе данных
     */
    List<Cat> getAllByUserId(Long id);

    /**
     * Создает новую запись о коте в базе данных, используя переданный объект кота.
     *
     * @param cat объект кота, содержащий информацию о создаваемой записи
     * @return созданный объект кота с присвоенным идентификатором, сохраненный в базе данных
     */
    Cat create(Cat cat);

    /**
     * Обновляет информацию о коте, используя переданный объект кота.
     *
     * @param cat объект кота, содержащий обновленную информацию
     * @return объект кота с обновленной информацией, сохраненный в базе данных
     * @throws NotFoundException если переданный объект кота не найден в базе данных
     */
    Cat update(Cat cat);

    /**
     * Возвращает коллекцию всех объектов кота, находящихся в базе данных.
     *
     * @return коллекция всех объектов кота, находящихся в базе данных
     */
    List<Cat> getAll();

    /**
     * Удаляет запись о коте с указанным идентификатором из базы данных.
     *
     * @param id идентификатор кота, который должен быть удален
     */
    void remove(Long id);
}