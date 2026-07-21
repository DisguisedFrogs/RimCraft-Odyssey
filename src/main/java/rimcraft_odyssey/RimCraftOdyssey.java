package rimcraft_odyssey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.neoforged.fml.common.Mod;

@Mod(RimCraftOdyssey.MOD_ID)
public final class RimCraftOdyssey {
    public static final String MOD_ID = "rimcraft_odyssey";
    private static final Logger LOGGER = LoggerFactory.getLogger(RimCraftOdyssey.class);

    public RimCraftOdyssey() {
        LOGGER.info("RimCraft Odyssey initialized");
    }
}
