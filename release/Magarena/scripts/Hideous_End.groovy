[
    new MagicSpellCardEvent() {
        @Override
        public MagicEvent getEvent(final MagicCardOnStack cardOnStack,final MagicPayedCost payedCost) {
            return new MagicEvent(
                cardOnStack,
                MagicTargetChoice.NEG_TARGET_NONBLACK_CREATURE,
                MagicDestroyTargetPicker.Destroy,
                this,
                "Destroy target nonblack creature\$. Its controller loses 2 life."
            );
        }
        @Override
        public void executeEvent(final MagicGame game, final MagicEvent event) {
            event.processTargetPermanent(game, {
                final MagicPlayer controller=it.getController();
                game.doAction(new MagicDestroyAction(it));
                game.doAction(new MagicChangeLifeAction(controller,-2));
            });
        }
    }
]
