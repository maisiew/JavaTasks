public class Main {
    public static int findMaxMobile(int[] perm, int[] dir, int N) {
        int index = -1;
        for(int i = 0; i < N; i++) {
            int nextElemIndex = i + dir[i];
            if(nextElemIndex >= 0 && nextElemIndex < N) {
                if(perm[i] > perm[nextElemIndex]) {
                    if(index == -1)
                        index = i;
                    else {
                        if(perm[i] > perm[index])
                            index = i;
                    }
                }
            }
        }
        return index;
    }

    public static void change(int[] perm, int[] dir, int mElem, int N) {
        for (int i = 0; i < N; i++) {
            if (perm[i] > mElem)
                dir[i] = -1 * dir[i];
        }
    }

    public static void swap(int[] perm, int[] dir, int i, int j) {
       int helper1 = perm[i];
       int helper2 = dir[i];
       perm[i] = perm[j];
       perm[j] = helper1;
       dir[i] = dir[j];
       dir[j] = helper2;
    }

    public static void permutation_generator(int N) {
        int perm[] = new int[N];
        int dir[] = new int[N];
        for(int i = 0; i < N; i++) {
            perm[i] = i + 1;
            dir[i] = -1;
        }
        for(int j = 0; j < N; j++) {
            System.out.print(perm[j] + " ");
        }
        System.out.println();
        int mElemInd = findMaxMobile(perm, dir, N);
        while(mElemInd != -1) {
            int mElem = perm[mElemInd];
            int nextInd = mElemInd + dir[mElemInd];
            swap(perm, dir, mElemInd, nextInd);
            change(perm, dir, mElem, N);
            for(int j = 0; j < N; j++) {
                System.out.print(perm[j] + " ");
            }
            System.out.println();
            mElemInd = findMaxMobile(perm, dir, N);
        }
    }


    public static void main(String[] args) {
        int N = 3;
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println("Количество перестановок: " + fact + ";\nЭти перестановки: ");
        permutation_generator(N);
    }
}
