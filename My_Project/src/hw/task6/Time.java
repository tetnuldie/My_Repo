package com.itacademy.lesson11.hw.task6;

public class Time {
    private int hour;
    private int minuite;
    private int second;

    public Time() {
        hour = 0;
        minuite = 0;
        second = 0;
    }

    public Time(int hour, int minuite, int second) {
        if (hour < 0 || minuite < 0 || second < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        if (hour > 23) {
            this.hour = hour % 24;
        } else {
            this.hour = hour;
        }
        if (minuite > 59) {
            this.minuite = minuite % 60;
        } else {
            this.minuite = minuite;
        }
        if (second > 59) {
            this.second = second % 60;
        } else {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinuite() {
        return minuite;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int _hour) {
        if (_hour < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        if (_hour > 23) {
            hour = _hour % 24;
        } else {
            hour = _hour;
        }
    }

    public void setMinuite(int _minuite) {
        if (_minuite < 0) {
            throw new RuntimeException("Value can't be negative");
        }

        if (_minuite > 59) {
            minuite = _minuite % 60;
        } else {
            minuite = _minuite;
        }
    }

    public void setSecond(int _second) {
        if (_second < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        if (_second > 59) {
            second = _second % 60;
        } else {
            second = _second;
        }
    }

    public Time set(Time t) {
        if (t.hour < 0 || t.minuite < 0 || t.second < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        int hour, minuite, second;

        hour = t.hour;
        minuite = t.minuite;
        second = t.second;

        if (hour > 23) {
            hour = hour % 24;
        }
        if (minuite > 59) {
            minuite = minuite % 60;
        }
        if (second > 59) {
            second = second % 60;
        }
        Time newtime = new Time(hour, minuite, second);
        return newtime;
    }

    public void increaseByValue(int value, boolean ishour, boolean isminuite, boolean issecond) {
        if (value < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        if (ishour && isminuite || ishour && issecond || isminuite && issecond) {
            throw new RuntimeException("Only one param allowed");
        }
        if (!ishour && !isminuite && !issecond) {
            throw new RuntimeException("Param not entered");
        }

        int thissecond, newsecond;

        thissecond = this.hour * 3600 + this.minuite * 60 + this.second;

        if (ishour) {
            value = value * 3600;
        } else if (isminuite) {
            value = value * 60;
        }

        newsecond = thissecond + value;

        this.hour = newsecond / 60 / 60 % 24;
        this.minuite = newsecond / 60 % 60;
        this.second = newsecond % 60;
    }

    public void decreaseByValue(int value, boolean ishour, boolean isminuite, boolean issecond) {
        if (value < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        if (ishour && isminuite || ishour && issecond || isminuite && issecond) {
            throw new RuntimeException("Only one param allowed");
        }
        if (!ishour && !isminuite && !issecond) {
            throw new RuntimeException("Param not entered");
        }

        int thissecond, newsecond;

        thissecond = this.hour * 3600 + this.minuite * 60 + this.second;

        if (ishour) {
            value = value * 3600;
        } else if (isminuite) {
            value = value * 60;
        }

        newsecond = thissecond - value;
        if (newsecond < 0) {
            do {
                newsecond += 86400;
            } while (newsecond < 0);
        }
        this.hour = newsecond / 60 / 60 % 24;
        this.minuite = newsecond / 60 % 60;
        this.second = newsecond % 60;
    }


    public String getTimeFormatted() {
        String ftime;
        String fhour = String.valueOf(hour);
        String fminuite = String.valueOf(minuite);
        String fsecond = String.valueOf(second);

        if (hour <= 9) {
            fhour = "0" + hour;
        }
        if (minuite <= 9) {
            fminuite = "0" + minuite;
        }
        if (second <= 9) {
            fsecond = "0" + second;
        }
        ftime = fhour + ":" + fminuite + ":" + fsecond;
        return ftime;
    }
}
