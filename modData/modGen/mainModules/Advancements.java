package %s.advancement;

import net.minheur.techno_lib.datagen.advancement.AdvancementBuilder;
import net.minheur.techno_lib.datagen.advancement.CriterionBuilder;
%s

public class ModAdvancements {



    // --- methods ---
    protected static AdvancementBuilder addRoot(String id, String group) {
        if (id == null) throw new IllegalStateException("Can't have a null advancement id !");
        if (group == null) throw new IllegalStateException("Can't have a null advancement group !");
        return new AdvancementBuilder(id + "-root", group, true, %s.MOD_ID);
    }
    protected static AdvancementBuilder addWithParent(String id, String group) {
        if (id == null) throw new IllegalStateException("Can't have a null advancement id !");
        if (group == null) throw new IllegalStateException("Can't have a null advancement group !");
        return new AdvancementBuilder(id, group, false, %s.MOD_ID);
    }
    protected static CriterionBuilder simpleCriterion(ResourceLocation trigger) {
        return new CriterionBuilder(trigger);
    }
}