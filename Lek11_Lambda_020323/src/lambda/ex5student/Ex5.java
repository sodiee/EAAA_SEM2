package lambda.ex5student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Ex5 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        // OBS: Throws exception. Opgave A
        //det er fordi man gennemløber dem og ændrer i listen samtidig (remover)
		/*for (Runner runner : runners) {
			if (runner.getLapTime() > 40)
				runners.remove(runner);
		} */
        //b
       ListIterator<Runner> listIterator = runners.listIterator();
        while (listIterator.hasNext()) {
            Runner nextRunner = listIterator.next();
            if (nextRunner.getLapTime() >= 40) {
                listIterator.remove();
            }
        }
        System.out.println(runners);
        System.out.println();
        //d
        removeIf(runners, runner -> runner.getLapTime() >= 40);
        System.out.println(runners);
        //e
        runners.removeIf(runner -> runner.getLapTime() >= 40);
        System.out.println(runners);
    }
        //c
        /**
         * Removes runners that satisfies the given filter.
         * Returns true, if any runner is removed.
         */
        public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter) {
            ListIterator<Runner> runnerListIterator = runners.listIterator();
            boolean result = false;
            while (runnerListIterator.hasNext()) {
                Runner nextRunner = runnerListIterator.next();
                if (filter.test(nextRunner)) {
                    runnerListIterator.remove();
                    result = true;
                }
            }
            return result;
        }
}