package tareas.homework20;

public class Programa5_v1 {
  public static void main(String[] args) {
    int[] nums = {2, 7, 3, 5, 5, 6, 7};
    
    System.out.println("numero 5");
    fakeIndexOf(nums, 5);

  }

  public static void fakeIndexOf(int[] arr, int num) {
    for(int i = 0; i < arr.length; i += 1) {
      if(arr[i] == num) {
        System.out.println("La coincidencia esta en la posicion: " + i);
      };
    }
  }
}
