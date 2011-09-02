package magic.model.trigger;

import magic.model.MagicGame;
import magic.model.MagicPermanent;
import magic.model.MagicDamage;
import magic.model.event.MagicEvent;

public abstract class MagicWhenDamageIsDealtTrigger extends MagicTrigger<MagicDamage> {
    public MagicWhenDamageIsDealtTrigger(final int priority) {
        super(priority); 
	}
	
	public MagicWhenDamageIsDealtTrigger() {}
    
    public MagicTriggerType getType() {
        return MagicTriggerType.WhenDamageIsDealt;
    }
}
