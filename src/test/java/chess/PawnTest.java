package chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {

    @Test
    @DisplayName("흰색 폰이 생성되어야 한다")
    public void create() {
        Pawn whitePawn = new Pawn("white");
        assertThat(whitePawn.getColor()).isEqualTo("white");

        Pawn blackPawn = new Pawn("black");
        assertThat(blackPawn.getColor()).isEqualTo("black");
    }

}
