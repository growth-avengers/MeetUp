package meetup;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class solution1 {
    public String solution(int x) {
        String answer = "";

        if (x >= 1) {
            answer = x % 2 + answer;
            return solution(x / 2) + answer;
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(1)).isEqualTo("1");
        assertThat(solution(2)).isEqualTo("10");
        assertThat(solution(3)).isEqualTo("11");
        assertThat(solution(4)).isEqualTo("100");
        assertThat(solution(5)).isEqualTo("101");
        assertThat(solution(6)).isEqualTo("110");
        assertThat(solution(7)).isEqualTo("111");
        assertThat(solution(10)).isEqualTo("1010");
    }
}
