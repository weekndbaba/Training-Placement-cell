package TPC13;

import java.util.*;
class Activity{
    int start,end;

    public Activity(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class ActivitySelection {
    public static void selectActivities(List<Activity> activities){
        activities.sort(Comparator.comparingInt(a -> a.end));
        System.out.println("selected actiities");

        int lastEnd = activities.get(0).end;
        System.out.println("("+activities.get(0).start+", "+activities.get(0).end+")");
        
        for(int i=1;i<activities.size();i++){
            if(activities.get(i).start >= lastEnd){
                System.out.println("("+activities.get(i).start+", "+activities.get(i).end+")");
                lastEnd = activities.get(i).end;
            }
        }
    }

    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity(1, 2));
        activities.add(new Activity(2, 4));
        activities.add(new Activity(4, 5));
        activities.add(new Activity(5, 6));
        activities.add(new Activity(5, 10));
        activities.add(new Activity(8, 9));
        activities.add(new Activity(9, 10));

        selectActivities(activities);
    }
}
