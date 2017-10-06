## basic-genetic-algorithm
A basic genetic algorithm approach to optimization written in Java.

## Synopsis
Genetic algorithms (GA) are an heuristic search approach to solve optimization problems, based on the evolutionary ideas of natural selection and genetics, when a standard or classical derivative-based algorithm can't be used to that purpose. An initialized population of individual solutions is modified repeatedly during a finite number of steps (generations) during the GA's execution, according to a defined fitness function. At each step, the GA selects random individuals from the current population to be parents and uses their cromosomes to produce the children for the next generation by crossover rules. Then, mutation rules are applied to the children's cromosome. Finally, the population's worse individual (lower fitness) is replaced by the formed children in case that children's fitness value is better than its. Over successive generations, the population evolves toward an optimal solution.

## Tests
GA is tested with two crossover rules: uniform and one point.
