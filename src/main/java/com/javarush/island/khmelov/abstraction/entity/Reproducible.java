package com.javarush.island.khmelov.abstraction.entity;

import com.javarush.island.khmelov.entity.map.Cell;
import com.javarush.island.khmelov.entity.tasks.Task;

@FunctionalInterface
public interface Reproducible {

    Task spawn(Cell currentCell);

}