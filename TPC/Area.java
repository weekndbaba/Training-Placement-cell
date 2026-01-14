package TPC;

class Shape{
    void area(float a,float b){

    }
}

class Circle extends Shape{
    float r = 0;
    Circle(float a){
        r=a;
    }
    @Override
    void area(int r){
        System.out.println(3.149*r*r);
    }
}

class Rectangle extends Shape{
    @Override
    float l=0,b=0;
    void area(){

    }
}

public class Area {
    
}
