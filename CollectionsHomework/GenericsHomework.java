public class GenericsHomework {
    public static void main(String[] args) {

        Integer[] arr = {1,3,6,7,13};
        System.out.println(getNumberOfPrimes(arr));
    }

    public static <T> void exchangePositions(T[] array){

        for(int i=1; i< array.length; i++){
            if(!array[i].equals(array[i-1])){
                array[i]=array[i-1];
            }
        }
    }

    public static <T> boolean isPrime(T number){
        if(Integer.parseInt(number.toString()) <= 1)
            return false;
        else
        {
            for(int i=2; i<=Math.sqrt(Integer.parseInt(number.toString())); i++){
                if(Integer.parseInt(number.toString()) % 2 == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static <T> int getNumberOfPrimes(T[] array) {
        int count = 0;
        for (T elem : array) {
            if (isPrime(elem))
                count++;
        }
    return count;
    }

}
