package com.itacademy.lesson11.hw.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Schedule {
    private List<Train> schedule;


    public Schedule() {
        List<Train> schedule = new ArrayList<>();
        Train t1 = new Train();
        schedule.add(t1);
        this.schedule = schedule;
    }

    public Schedule(int n) {
        List<Train> schedule = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            Train t1 = new Train();
            schedule.add(t1);
        }
        this.schedule = schedule;
    }

    public Schedule(List<Train> schedule) {
        this.schedule = schedule;
    }

    public List<Train> getSchedule() {
        return schedule;
    }

    public List<Train> getTrainByNumber(int n) {
        List<Train> TrainDemand = new ArrayList<>();

        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getNumber() == n) {
                TrainDemand.add(schedule.get(i));
            }
        }
        if (TrainDemand.size() > 0) {
            return TrainDemand;
        } else {
            throw new RuntimeException("No trains found");
        }
    }

    public List<Train> sortSchedule() {


        int min;
        Train temp;
        for (int i = 0; i < schedule.size() - 1; i++) {

            min = i;
            for (int j = i + 1; j < schedule.size(); j++) {
                if (schedule.get(j).getDestination().compareTo(schedule.get(min).getDestination()) < 0) {
                    min = j;
                } else if (schedule.get(j).getDestination().compareTo(schedule.get(min).getDestination()) == 0) {
                    if (schedule.get(j).getDeparture_time().CompareTime(schedule.get(j).getDeparture_time(),
                            schedule.get(min).getDeparture_time())) {
                        min = j;
                    }
                }
            }
            temp = schedule.get(i);
            schedule.set(i, schedule.get(min));
            schedule.set(min, temp);


        }

        return schedule;
    }


}
