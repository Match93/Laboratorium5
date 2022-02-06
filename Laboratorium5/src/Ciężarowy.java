public class Ciężarowy extends Samochód{
    @Override
    public int przyspiesz(int speed) throws MyException {
        if(speed%2==0){
            try{
                predkosc=maxPredksoc/speed;
            } catch (ArithmeticException e){
                System.out.println("ArithmeticException");
            }
        } else{
            super.przyspiesz(speed);
        };
        return predkosc;

    }
}
