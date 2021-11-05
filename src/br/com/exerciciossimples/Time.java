package br.com.exerciciossimples;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void timer(){
            second = 0;
            if(second < 60){
                second++;
            }else{
                second = 0; 
                minute++;
        }
            System.out.println(hour + ":" + minute + ":"+ second);
        
    }
    

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
