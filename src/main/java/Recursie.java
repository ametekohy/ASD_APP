/**
 *
 */
public class Recursie {
    /*
        - Het begrip "recursie" kunnen uitleggen.
            Een recursieve functie roept zichzelf aan!
         - Een recursive functie kunnen schrijven.
            Base case: zorg dat er altijd een geval is waarbij de recursie stopt
            Make Progress: werk naar de base case toe
            You gotta believe! Geloof dat het werkt!
      - De beperkingen van recursie kennen.
            Voor elke recursieve functieaanroep is een aantal klokcycli nodig en ook moet elke keer een aantal
            registers op de call stack geplaatst worden. Een eenvoudige for-loop werkt dan sneller en kost
            minder geheugen.
    */

    //    1. Programmeer de faculteitsfunctie recursief en niet-recursief uit (5! = 5x4x3x2x1)
    public int faculteit_recursief(int n) {
        if(n==1) {
            return 1;                                   // Base case
        } else {
            return faculteit_recursief(n-1) * n;    // Make progress
        }
    }

    public int faculteit_niet_recursief(int n) {
        if(n==1) {
            return 1;
        }

        int result = 1;
        int prev ;

        for (int i=0;i<n;i++){
            prev = (n-i);
            result = result*prev;
        }

        return result;
    }

    //    2. Programmeer de somfunctie recursief en niet-recursief uit (som(5) = 5+4+3+2+1)
    public int som_recursief(int n){
        if(n==1) {
            return 1;                                   // Base case
        } else {
            return som_recursief(n-1) + n;          // Make progress
        }
    }

    public int som_niet_recursief(int n){
        if(n==1) {
            return 1;
        }

        int result = 0;

        for(int i = 0; i<n; i++) {
            result+=(n-i);
        }

        return result;
    }

    //    3. Maak opdracht 7.23[In oud boek: 7.26]uit het boek

    //    4. Maak opdracht 7.49[In oud boek: 7.44]uit het boek

    //    5. (W)Maak een fractal genaamd de H-Tree: http://en.wikipedia.org/wiki/H_tree

}
