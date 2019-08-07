class Temperature
{
 public static void main(String[]args)
 {
  double cel,fah;
  cel=10.6;
  fah=(9*cel/5)+32;
  cel=(fah-32)*5/9;
  System.out.print("Celsius="+cel);
  System.out.print("Fahrenheit="+fah);
 }
}