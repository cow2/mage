/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.magic2013;

import java.util.Set;
import java.util.UUID;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Rarity;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetPlayer;

/**
 *
 * @author North
 */
public class WitsEnd extends CardImpl {

    public WitsEnd(UUID ownerId) {
        super(ownerId, 117, "Wit's End", Rarity.RARE, new CardType[]{CardType.SORCERY}, "{5}{B}{B}");
        this.expansionSetCode = "M13";

        this.color.setBlack(true);

        // Target player discards his or her hand.
        this.getSpellAbility().addEffect(new WitsEndEffect());
        this.getSpellAbility().addTarget(new TargetPlayer());
    }

    public WitsEnd(final WitsEnd card) {
        super(card);
    }

    @Override
    public WitsEnd copy() {
        return new WitsEnd(this);
    }
}

class WitsEndEffect extends OneShotEffect {

    public WitsEndEffect() {
        super(Outcome.Benefit);
        this.staticText = "Target player discards his or her hand";
    }

    public WitsEndEffect(final WitsEndEffect effect) {
        super(effect);
    }

    @Override
    public WitsEndEffect copy() {
        return new WitsEndEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getFirstTarget());
        if (player != null) {
            Set<Card> cards = player.getHand().getCards(game);
            for (Card card : cards) {
                player.discard(card, source, game);
            }
            return true;
        }
        return false;
    }
}
