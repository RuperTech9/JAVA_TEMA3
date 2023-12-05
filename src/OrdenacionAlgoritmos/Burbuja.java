
package OrdenacionAlgoritmos;

/**
 *
 * @author Ruper
 */
public class Burbuja {
    
    public static int [] burbujaSimple(int [] numerosArray){
        boolean intercambio=true;
        int temp;
        for(int i=numerosArray.length-1;i>0&&intercambio;i--){
            intercambio=false;
            for(int j=0;j<i;j++){
                if(numerosArray[j]>numerosArray[j+1]){
                    temp=numerosArray[j];
                    numerosArray[j]=numerosArray[j+1];
                    numerosArray[j+1]=temp;
                    intercambio = true;
                }
            }         
        }
        return numerosArray;
    }
    
    public static int [] burbujaSimpleDesc(int [] numerosArray){
        boolean intercambio=true;
        int temp;
        for(int i=numerosArray.length-1;i>0&&intercambio;i--){
            intercambio=false;
            for(int j=0;j<i;j++){
                if(numerosArray[j]<numerosArray[j+1]){
                    temp=numerosArray[j];
                    numerosArray[j]=numerosArray[j+1];
                    numerosArray[j+1]=temp;
                    intercambio = true;
                }
            }         
        }
        return numerosArray;
    }
    
    public static void imprimirArray(int[] array, int longitud){
        System.out.println("El resultado del array es: ");
        for(int i=0;i<longitud;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
    public static void main(String [] args){
        int [] array = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};
        int [] array2 = {10, 1, 5, 40, 12, 34, 48, 12, 11, 9};
        int longitud=array.length;
        int longitud2=array2.length;
        
        burbujaSimple(array);
        imprimirArray(array, longitud);
        System.out.println("");
        burbujaSimpleDesc(array2);
        imprimirArray(array2, longitud);
    }
}
