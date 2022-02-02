package mypackage;
import mypackage.Personne;

class Montre {
    int heure, min;
    Personne p;

    Montre(int h, int m) {
        this.heure = h;
        this.min = m;
    }

    Montre(Montre m) {
        this.heure = m.heure;
        this.min = m.min;
    }

    void avance() {
        if ((this.min+1 )>59 && (this.heure+1 )>23 ) {
                this.heure = 0;
                this.min = 0;
        }
        else if((this.min+1 )>59){
            this.min = 0;
            this.heure++;
        }
        else{
            this.min++;
        }

    }
}