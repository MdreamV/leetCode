package a_DTS.a_SparseArray;

/**
 * @author smn
 * @Description:稀疏数组
 * @date 2021/6/26 0026 11:12
 */
public class SparseArray {

    private static int[][] chessArr;

    public static void main(String[] args) {
        newChessArr();
        System.out.println();
        toSparseArr();
    }

    public static void newChessArr() {
        //创建一个原始的二维数组11*11
        //0：没有棋子 1：黑棋 2：蓝棋
        chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        //输出
        print(chessArr);
    }

    public static void toSparseArr() {
        //先遍历，得到非0数据的个数
        int sum = 0;
        for (int[] rows : chessArr) {
            for (int data : rows) {
                if (data != 0) {
                    sum++;
                }
            }
        }
        //创建对应的稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        //赋值 第一行
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组，非0的值存到稀疏数组
        int index = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    sparseArr[index][0] = i;
                    sparseArr[index][1] = j;
                    sparseArr[index][2] = chessArr[i][j];
                    index++;
                }
            }
        }
        //输出
        print(sparseArr);
        toChessArr(sparseArr);
    }

    public static void toChessArr(int[][] sparseArr) {
        //创建二维数组
        int newChess[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        //添加有值的数据
        for (int index = 1; index <= sparseArr[0][2]; index++) {
            newChess[sparseArr[index][0]][sparseArr[index][1]] = sparseArr[index][2];
        }
        print(newChess);

    }

    public static void print(int[][] arr) {
        for (int[] rows : arr) {
            for (int data : rows) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
