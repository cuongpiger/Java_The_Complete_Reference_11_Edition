import java.util.Random;

interface SharedConstants {
    final int NO = 0;
    final int YES = 1;
    final int MAYBE = 2;
    final int LATER = 3;
    final int SOON = 4;
    final int NEVER = 5;
}

class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int)(100 * rand.nextDouble());

        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        }

        return NEVER;
    }
}

class AskMe implements SharedConstants {
    static void answer(int res) {
        switch (res) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }

    public static void main(String args[]) {
        Question q = new Question();

        for (int i = 0; i < 4; ++i) {
            answer(q.ask());
        }
    }
}
