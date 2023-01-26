public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    /**
     *  Function name - celciusToFahrenheit
     *  @param celsius (double[])
     *  @return fahrenheit (double[])
     * 
     *  inside the function:
     *      1. creates a double[] array called fahrenheit
     *      2. Copies all values from celsius to fahrenheit
     *      3. Updates the fahrenheit values (F = (C/5 *9) + 32)
     *      4. Return fahrenheit
     */
    public static double[] celsiusToFahrenheit(double[] celsius) {
        
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++){
            fahrenheit[i] = ((celsius[i]/5 * 9) + 32);
        }
        return fahrenheit;
    }

    /**
     *  Function name - printTemperatures
     *  @param temp (double[])
     *  @param tempType (string) can be: celsius or fahrenheit
     *  
     *  inside the function:
     *      1. System.out.print(tempType + ": ")
     *      2. A loop prints the temperatures in ONE line
     *      3. Prints a new line after the loop
     */
    public static void printTemperatures(double[] temp, String tempType){

        System.out.print(tempType + ": ");
        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.print("\n");
    }

}
