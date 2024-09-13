class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<Car> cars = new ArrayList();
        for(int i=0; i< speed.length; i++){
            cars.add(new Car(position[i], speed[i]));
        }

        cars.sort(Comparator.comparingInt(Car::getPosition).reversed());

        Stack<Double> stack = new Stack();
        for(Car car : cars){
            double timetaken = (double)(target - car.position)/car.speed;
            if(!stack.isEmpty() && timetaken <= stack.peek())
                continue;
            stack.push(timetaken);
        }
        return stack.size();
    }
}



public class Car {
    int position;
    int speed;

    public Car(int position, int speed){
        this.position = position;
        this.speed = speed;
    }

    public int getPosition(){
        return position;
    }
}