public class Samochód {

    int predkosc =0;
    int maxPredksoc=200;

    public int przyspiesz (int speed)   throws MyException{
        predkosc += speed;

        if (predkosc <0 || predkosc>maxPredksoc){
            throw new MyException();
        }

     return predkosc;
    }






}
