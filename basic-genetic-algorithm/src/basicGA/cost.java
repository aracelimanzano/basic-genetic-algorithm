package basicGA;

public interface cost {

    /**
     * Returns fitness value for a cromosome according to the cost function.
     *
     * @param c
     *         Get fitness value of cromosome c.
     * @return Fitness to maximize a defined function.
     */

    double evaluate(cromosome c);
}
