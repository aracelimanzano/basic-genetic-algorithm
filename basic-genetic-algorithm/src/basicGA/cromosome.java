package basicGA;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class cromosome {

    protected List<Integer> cromosomeData;
    protected static Random rv = new Random();
    protected static int DEFAULT_GEN = 0;

    /** Builder
     * @param length
     * @param r
     *            If r, set the cromosome value randomly.
     *            Else, set default value.
     * @throws RuntimeException
     *            If length is not valid.
     */

    public cromosome(int length, boolean r){
        if (length > 0) {

            cromosomeData = new LinkedList<>();

            if (r) {
                for (int i = 0; i < length; i++) {
                    cromosomeData.add(i,rv.nextInt(2));
                }

            } else {
                for (int i = 0; i < length; i++) {
                    cromosomeData.add(i,DEFAULT_GEN);
                }
            }

        }

        else {
            throw new RuntimeException ("Length value is not valid.");
        }
    }

    public int getGen(int i) {
        int gen;

        if (i < cromosomeData.size() && i >= 0) {
            gen = cromosomeData.get(i);
        }

        else {
            throw new RuntimeException ("Index value is not valid");
        }

        return gen;
    }

    public int getSize() {
        return cromosomeData.size();
    }

    public void changeGen(int i, int value) {

        if (i < cromosomeData.size() && i >= 0) {
            cromosomeData.set(i,value);
        }

        else {
            throw new RuntimeException ("Index value is not valid");
        }
    }

    public void mutate(double mutationProbability) {
        if (mutationProbability > 0 && mutationProbability < 1){

            for (int i = 0; i < cromosomeData.size(); i++) {
                if (rv.nextDouble() < mutationProbability) {
                    if (cromosomeData.get(i) == 0){ cromosomeData.set(i, 1);}
                    else { cromosomeData.set(i, 0); }
                }
            }
        }

        else {
            throw new RuntimeException ("Mutation probability value is not valid.");
        }
    }

    public cromosome copy() {
        cromosome cromosomeCopy = new cromosome(this.cromosomeData.size(), false);
        for (int i = 0; i < this.cromosomeData.size(); i++){
            cromosomeCopy.cromosomeData.set(i, this.cromosomeData.get(i));
        }

        return cromosomeCopy;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < this.cromosomeData.size(); i++) {
            s.append(this.cromosomeData.get(i)).append(", ");
        }
        return "Cromosome(" + s + ")";
    }


}
