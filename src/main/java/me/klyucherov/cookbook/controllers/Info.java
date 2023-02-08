package me.klyucherov.cookbook.controllers;

import java.time.LocalDate;

public class Info {




    private final String fio;
    private final String projectName;
    private final LocalDate time;
    private final String projectDescription;

    public Info(String fio, String projectName, LocalDate time, String projectDescription) {
        this.fio = "Ключеров Витор Викторович";
        this.projectName = "Кулинарные рецепты";
        this.time = LocalDate.now();
        this.projectDescription = "Поделиться своими кулинарными шедеврами";
    }

    public String getFio() {
        return fio;
    }

    public String getProjectName() {
        return projectName;
    }

    public LocalDate getTime() {
        return time;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    @Override
    public String toString() {
        return "Автор: "  + fio + "; " +
                "Название проекта: " + projectName + "; " +
                "Дата создания: " + time + "; " +
                "Описание проекта: " + projectDescription;
    }


}
