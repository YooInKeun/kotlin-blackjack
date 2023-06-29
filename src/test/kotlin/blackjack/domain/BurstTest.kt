package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.math.BigDecimal

class BurstTest : FunSpec({

    test("Burst 상태의 수익배수를 반환한다") {
        val cards = Cards(
            Card.of(Denomination.TWO, Suit.SPADES),
            Card.of(Denomination.JACK, Suit.SPADES),
            Card.of(Denomination.QUEEN, Suit.SPADES),
        )
        Burst(cards).profitMultiple() shouldBe BigDecimal(-1)
    }
})
