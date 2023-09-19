package index;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertThat;


class IndexTest {

    @Test
    void whenIntArray() {
        int[] inArray = {-20, -17, -15, -10, -3, 0, 1, 3, 5, 7};
        int[] result = Index.index(inArray);
        int[] expected = {0, 1, 9, 9, 25, 49, 100, 225, 289, 400};
        assertThat(Arrays.equals(result, expected)).isTrue();

    }
}