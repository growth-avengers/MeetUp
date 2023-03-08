package meetup;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class solution2 {
    public int solution(int n) {
        Integer x = getInteger(n);
        if (x != null) return x;

        Integer x1 = getInteger1(n);
        if (x1 != null) return x1;

        return solution(n - 2) + solution(n - 1); // 재귀함수
    }

    private static Integer getInteger1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return null;
    }

    private static Integer getInteger(int n) {
        if (n == 0) {
            return 0;
        }
        return null;
    }

    @Test
    void result() {
        assertThat(solution(0)).isEqualTo(0);
        assertThat(solution(1)).isEqualTo(1);
        assertThat(solution(2)).isEqualTo(1);
        assertThat(solution(3)).isEqualTo(2);
        assertThat(solution(4)).isEqualTo(3);
        assertThat(solution(5)).isEqualTo(5);
        assertThat(solution(6)).isEqualTo(8);
        assertThat(solution(7)).isEqualTo(13);
        assertThat(solution(8)).isEqualTo(21);
        assertThat(solution(10)).isEqualTo(55);
    }

    @Test
    void result2() {
        assertThat(getInteger1(1)).isEqualTo(1);
        assertThat(getInteger1(2)).isEqualTo(1);
        assertThat(getInteger1(3)).isNull();
    }

    @Test
    void result3() {
        assertThat(getInteger(0)).isEqualTo(0);
        assertThat(getInteger(1)).isNull();
    }
}
