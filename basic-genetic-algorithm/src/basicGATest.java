import basicGA.*;

public class basicGATest {

    static final int POPULATION_SIZE = 20;
    static final int STEPS = 400;
    static final int CROMOSOME_LENGTH = 50;
    static final double MUTATION_PROBABILITY = 0.02;

    public static void main(String[] args) {

        // Select cost function:
        cost function = new transitionMax();
        // cost function = new oneMax();
        // cost function = new zeroMax();

        // Test with basic Uniform GA approach
        GA ga1 = new pointGA(POPULATION_SIZE, CROMOSOME_LENGTH,
                STEPS, MUTATION_PROBABILITY, function);
        individual solution1 = ga1.execute();
        System.out.println("Solution Test 1 (Uniform):" + solution1);

        // Test with basic One Point GA approach
        GA ga2 = new uniformGA(POPULATION_SIZE, CROMOSOME_LENGTH,
                STEPS, MUTATION_PROBABILITY, function);
        individual solution2 = ga2.execute();
        System.out.println("Solution Test 2 (One point):" + solution2);
    }
}
