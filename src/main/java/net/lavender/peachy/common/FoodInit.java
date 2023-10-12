package net.lavender.peachy.common;

import net.lavender.peachy.Peachy;
import net.lavender.peachy.advanced.effect.items.*;
import net.lavender.peachy.common.item.common.*;
import net.lavender.peachy.common.item.custom.*;
import net.lavender.peachy.advanced.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class FoodInit {
    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, Peachy.MOD_ID);

    // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

    //mushrooms
    public static final RegistryObject<Item> FLY_AMANITA_SHROOM = FOODS.register("fly_amanita_shroom", () -> new PoisonousShroom(props().food(Foods.FLY_AMANITA_SHROOM)));
    public static final RegistryObject<Item> CHANTERELLE_SHROOM = FOODS.register("chanterelle", () -> new EdibleShroom(props().food(Foods.CHANTERELLE_SHROOM)));
    public static final RegistryObject<Item> MUSHROOM_RISOTTO = FOODS.register("mushroom_risotto", () -> new Item(props().food(Foods.MUSHROOM_RISOTTO)));

    //cheese
    public static final RegistryObject<Item> CHEESE_WEDGE = FOODS.register("cheese", () -> new Item(props().food(Foods.CHEESE_WEDGE)));
    public static final RegistryObject<Item> CHEESE_N_FRUITS = FOODS.register("cheese_n_fruits", () -> new Item(props().food(Foods.CHEESE_N_FRUITS)));
    public static final RegistryObject<Item> CHEESEBURGER = FOODS.register("cheeseburger", () -> new CheeseburgerItem(props().food(Foods.CHEESEBURGER)));
    public static final RegistryObject<Item> MAC_N_CHEESE = FOODS.register("mac_n_cheese", () -> new StrongEffectRadiantSnack(props().food(Foods.MAC_N_CHEESE)));
    public static final RegistryObject<Item> GRILLED_CHEESE = FOODS.register("grilled_cheese", () -> new MediumEffectRadiantSnack(props().food(Foods.GRILLED_CHEESE)));

    //cherry
    public static final RegistryObject<Item> CHERRY = FOODS.register("cherry", () -> new Item(props().food(Foods.CHERRY)));
    public static final RegistryObject<Item> CHERRY_STAR_CANDY = FOODS.register("cherry_star_candy", () -> new CandyItem(props().food(Foods.CHERRY_STAR_CANDY)));
    public static final RegistryObject<Item> CHERRY_SUNSET = FOODS.register("cherry_sunset", () -> new MediumEffectRadiantDrink(props().food(Foods.CHERRY_SUNSET)));
    public static final RegistryObject<Item> CHERRY_SYRUP = FOODS.register("cherry_syrup", () -> new SyrupItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.CHERRY_SYRUP)));
    public static final RegistryObject<Item> CHERRY_ROLL = FOODS.register("cherry_roll", () -> new SmallEffectRadiantSnack(props().food(Foods.CHERRY_ROLL)));


    //lemon
    public static final RegistryObject<Item> LEMON = FOODS.register("lemon", () -> new Item(props().food(Foods.LEMON)));
    public static final RegistryObject<Item> LEMON_BAR = FOODS.register("lemon_bar", () -> new Item(props().food(Foods.LEMON_BAR)));
    public static final RegistryObject<Item> LEMON_TART_SLICE = FOODS.register("lemon_tart_slice", () -> new StrongEffectRadiantSnack(props().food(Foods.LEMON_TART_SLICE)));
    public static final RegistryObject<Item> LEMON_TEA = FOODS.register("lemon_tea", () -> new MediumEffectRadiantDrink(props().food(Foods.LEMON_TEA)));
    public static final RegistryObject<Item> LEMONADE = FOODS.register("lemonade", () -> new MediumEffectRadiantDrink(props().food(Foods.LEMONADE)));
    public static final RegistryObject<Item> LEMON_CANDY = FOODS.register("lemon_candy", () -> new CandyItem(props().food(Foods.LEMON_CANDY)));
    public static final RegistryObject<Item> LEMON_POP = FOODS.register("lemon_pop", () -> new SodaItem(props().food(Foods.LEMON_POP)));
    public static final RegistryObject<Item> LEMON_JUICE = FOODS.register("lemon_juice", () -> new DrinkItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.LEMON_JUICE)));
    public static final RegistryObject<Item> LEMON_SLICE = FOODS.register("lemon_slice", () -> new Item(props().food(Foods.LEMON_SLICE)));


    //mint
    public static final RegistryObject<Item> MINT = FOODS.register("mint", () -> new Item(props().food(Foods.MINT)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_MOCHI = FOODS.register("mint_chocolate_mochi", () -> new Item(props().food(Foods.MINT_CHOCOLATE_MOCHI)));
    public static final RegistryObject<Item> MINT_EXTRACT = FOODS.register("mint_extract", () -> new MintExtractItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.MINT_EXTRACT)));
    public static final RegistryObject<Item> MINT_ICE_CREAM = FOODS.register("mint_ice_cream", () -> new StrongEffectStimulatedSnack(props().food(Foods.MINT_ICE_CREAM)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_MILKSHAKE = FOODS.register("mint_ice_cream", () -> new StrongEffectStimulatedSnack(props().food(Foods.MINT_ICE_CREAM)));
    public static final RegistryObject<Item> MINT_TEA = FOODS.register("mint_tea", () -> new StrongEffectStimulatedDrink(props().food(Foods.MINT_TEA)));
    public static final RegistryObject<Item> PEPPERMINT_PATTIE = FOODS.register("peppermint_pattie", () -> new Item(props().food(Foods.PEPPERMINT_PATTIE)));


    //peaches
    public static final RegistryObject<Item> PEACH = FOODS.register("peach", () -> new Item(props().food(Foods.PEACH)));
    public static final RegistryObject<Item> PEACH_CANDY = FOODS.register("peach_candy", () -> new CandyItem(props().food(Foods.PEACH_CANDY)));
    public static final RegistryObject<Item> PEACH_COOKIE_CRUMBLE = FOODS.register("peach_cookie_crumble", () -> new MediumEffectRadiantSnack(props().food(Foods.PEACH_COOKIE_CRUMBLE)));
    public static final RegistryObject<Item> PEACH_ICE_CREAM = FOODS.register("peach_ice_cream", () -> new StrongEffectRadiantSnack(props().food(Foods.PEACH_ICE_CREAM)));
    public static final RegistryObject<Item> PEACH_JUICE = FOODS.register("peach_juice", () -> new MediumEffectRadiantDrink(props().food(Foods.PEACH_JUICE)));
    public static final RegistryObject<Item> PEACHES_N_CREAM = FOODS.register("peaches_n_cream", () -> new Item(props().food(Foods.PEACHES_N_CREAM)));
    public static final RegistryObject<Item> PEACH_SLICE = FOODS.register("peach_slice", () -> new Item(props().food(Foods.PEACH_SLICE)));
    public static final RegistryObject<Item> PEACH_SYRUP = FOODS.register("peach_syrup", () -> new SyrupItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.PEACH_SYRUP)));
    public static final RegistryObject<Item> PEACH_SODA = FOODS.register("peach_soda", () -> new SodaItem(props().food(Foods.PEACH_SODA)));
    public static final RegistryObject<Item> PEACH_TEA = FOODS.register("peach_tea", () -> new MediumEffectRadiantDrink(props().food(Foods.PEACH_TEA)));
    public static final RegistryObject<Item> PEACH_TOAST = FOODS.register("peach_toast", () -> new Item(props().food(Foods.PEACH_TOAST)));
    public static final RegistryObject<Item> BAKED_PEACH = FOODS.register("baked_peach", () -> new SmallEffectRadiantSnack(props().food(Foods.BAKED_PEACH)));
    public static final RegistryObject<Item> CANDIED_PEACH = FOODS.register("candied_peach", () -> new CandiedItem(props().food(Foods.CANDIED_PEACH)));

    //extra foods
    public static final RegistryObject<Item> BEEF_JERKY = FOODS.register("beef_jerky", () -> new Item(props().food(Foods.BEEF_JERKY)));
    public static final RegistryObject<Item> BREAD_SLICE = FOODS.register("bread_slice", () -> new Item(props().food(Foods.BREAD_SLICE)));
    public static final RegistryObject<Item> POPPY_SEEDS = FOODS.register("poppy_seeds", () -> new Item(props().food(Foods.POPPY_SEEDS)));
    public static final RegistryObject<Item> ROSE_TEA = FOODS.register("rose_tea", () -> new MediumEffectRadiantDrink(props().food(Foods.ROSE_TEA)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = FOODS.register("sweet_berry_juice", () -> new MediumEffectRadiantDrink(props().food(Foods.SWEET_BERRY_JUICE)));
    public static final RegistryObject<Item> MELON_TANGHULU = FOODS.register("melon_tanghulu", () -> new Item(props().food(Foods.MELON_TANGHULU)));
    public static final RegistryObject<Item> MILK_CHOCOLATE = FOODS.register("milk_chocolate", () -> new Item(props().food(Foods.MILK_CHOCOLATE)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = FOODS.register("chocolate_ice_cream", () -> new StrongEffectRadiantSnack(props().food(Foods.CHOCOLATE_ICE_CREAM)));
    public static final RegistryObject<Item> GLOWBERRY_JUICE = FOODS.register("glowberry_juice", () -> new GlowberryJuiceItem(props().food(Foods.GLOWBERRY_JUICE)));
    public static final RegistryObject<Item> HONEY_MINT_TEA = FOODS.register("honey_mint_tea", () -> new SmallEffectRadiantDrink(props().food(Foods.HONEY_MINT_TEA)));
    public static final RegistryObject<Item> CARBONATED_WATER = FOODS.register("carbonated_water", () -> new DrinkItem(props().food(Foods.CARBONATED_WATER)));


    private static Item.Properties props() {
        return new Item.Properties();
    }
    public static class Foods {

        //1200 ticks = 1 minute effect
        //600 ticks = 30 second effect
        //300 ticks = 15 second effect

        //300 tick effect = light snack
        //3000 tick effect = medium snack
        //6000 tick effect = strong snack

        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

        //cheese
        public static final FoodProperties CHEESE_WEDGE = new FoodProperties.Builder().nutrition(5).saturationMod(5f).build();
        public static final FoodProperties CHEESE_N_FRUITS = new FoodProperties.Builder().nutrition(7).saturationMod(1.2f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties CHEESEBURGER = new FoodProperties.Builder().nutrition(13).saturationMod(2f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties MAC_N_CHEESE = new FoodProperties.Builder().nutrition(8).saturationMod(2f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties GRILLED_CHEESE = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();

        //base items
        public static final FoodProperties CARBONATED_WATER = new FoodProperties.Builder().nutrition(0).alwaysEat().saturationMod(1f).build();

        //cherry
        public static final FoodProperties CHERRY = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.8f).build();
        public static final FoodProperties CHERRY_SUNSET = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties CHERRY_STAR_CANDY = new FoodProperties.Builder().nutrition(1).saturationMod(0.50f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0f).fast().build();
        public static final FoodProperties CHERRY_COLA = new FoodProperties.Builder().nutrition(5).alwaysEat().saturationMod(4f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0f).build();
        public static final FoodProperties CHERRY_SYRUP = new FoodProperties.Builder().nutrition(5).saturationMod(5f).build();
        public static final FoodProperties CHERRY_ROLL = new FoodProperties.Builder().nutrition(5).saturationMod(0.95f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 0), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).build();

        //mushrooms
        public static final FoodProperties FLY_AMANITA_SHROOM = new FoodProperties.Builder().nutrition(3).saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 0), 0.75F).build();
        public static final FoodProperties CHANTERELLE_SHROOM = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 0.75F).build();
        public static final FoodProperties MUSHROOM_RISOTTO = new FoodProperties.Builder().nutrition(7).saturationMod(5.4f).build();

        //lemon
        public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.8f).build();
        public static final FoodProperties LEMONADE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties LEMON_BAR = new FoodProperties.Builder().nutrition(5).saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).build();
        public static final FoodProperties LEMON_CANDY = new FoodProperties.Builder().nutrition(1).saturationMod(0.50f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0f).fast().build();
        public static final FoodProperties LEMON_JUICE = new FoodProperties.Builder().nutrition(2).alwaysEat().saturationMod(2f).build();
        public static final FoodProperties LEMON_POP = new FoodProperties.Builder().nutrition(5).alwaysEat().saturationMod(4f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0f).build();
        public static final FoodProperties LEMON_SLICE = new FoodProperties.Builder().nutrition(1).saturationMod(0.8f).build();
        public static final FoodProperties LEMON_TART_SLICE = new FoodProperties.Builder().nutrition(4).saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).build();
        public static final FoodProperties LEMON_TEA = new FoodProperties.Builder().nutrition(4).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();

        //mint
        public static final FoodProperties MINT = new FoodProperties.Builder().nutrition(1).saturationMod(0.4f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).fast().build();
        public static final FoodProperties MINT_CHOCOLATE_MOCHI = new FoodProperties.Builder().nutrition(6).saturationMod(2.0f).build();
        public static final FoodProperties MINT_EXTRACT = new FoodProperties.Builder().nutrition(1).saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 1.0F).build();
        public static final FoodProperties MINT_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(6f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties MINT_TEA = new FoodProperties.Builder().nutrition(4).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties PEPPERMINT_PATTIE = new FoodProperties.Builder().nutrition(4).saturationMod(3.2f).build();

        //peaches
        public static final FoodProperties PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.8f).build();
        public static final FoodProperties PEACH_CANDY = new FoodProperties.Builder().nutrition(1).saturationMod(0.50f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0f).fast().build();
        public static final FoodProperties PEACH_COOKIE_CRUMBLE = new FoodProperties.Builder().nutrition(5).saturationMod(1.2f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties PEACH_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(2f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties PEACH_JUICE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties PEACHES_N_CREAM = new FoodProperties.Builder().nutrition(5).saturationMod(3.2f).build();
        public static final FoodProperties PEACH_SLICE = new FoodProperties.Builder().nutrition(2).fast().saturationMod(1.2f).build();
        public static final FoodProperties PEACH_SYRUP = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f).build();
        public static final FoodProperties PEACH_SODA = new FoodProperties.Builder().nutrition(5).alwaysEat().saturationMod(4f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0f).build();
        public static final FoodProperties PEACH_TEA = new FoodProperties.Builder().nutrition(4).alwaysEat().saturationMod(1.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties PEACH_TOAST = new FoodProperties.Builder().nutrition(4).saturationMod(3.2f).build();
        public static final FoodProperties BAKED_PEACH = new FoodProperties.Builder().nutrition(5).saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).build();
        public static final FoodProperties CANDIED_PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(2.8f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 1.0f).build();

        //extra foods
        public static final FoodProperties POPPY_SEEDS = new FoodProperties.Builder().nutrition(0).fast().saturationMod(0.2f)
                .effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 300, 0), 1.0f).build();
        public static final FoodProperties ROSE_TEA = new FoodProperties.Builder().nutrition(4).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties SWEET_BERRY_JUICE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties MELON_TANGHULU = new FoodProperties.Builder().nutrition(3).saturationMod(2f).build();
        public static final FoodProperties MILK_CHOCOLATE = new FoodProperties.Builder().nutrition(4).saturationMod(1.8f).build();
        public static final FoodProperties GLOWBERRY_JUICE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(4.5f)
                .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1.0f).build();
        public static final FoodProperties HONEY_MINT_TEA = new FoodProperties.Builder().nutrition(4).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f)
                .effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 600, 0), 1.0f).build();
        public static final FoodProperties BEEF_JERKY = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).build();
        public static final FoodProperties BREAD_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(1.8f).build();
        public static final FoodProperties CHOCOLATE_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(2f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0),1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 0),1.0f).build();


    }

}