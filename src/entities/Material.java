package entities;

import java.util.ArrayList;
import java.util.List;

public class Material {
    private String name;
     protected  List<Double>  notes = new ArrayList<>();


    public Material(String name) {
        this.name = name;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  addNote(double note){
            notes .add(note);
        }

        public  Double   averege(){
            double  sum = 0;
            for (int i = 1; i <= notes.size(); i++) {
                    sum += notes.get(i );
            }
            return  sum / notes.size();
        }
    }


