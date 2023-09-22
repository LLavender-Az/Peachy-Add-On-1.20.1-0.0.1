package net.lavender.peachy.common;

import net.lavender.peachy.Peachy;
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

//import java.util.function.Supplier;

public class FoodInit {
    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, Peachy.MOD_ID);

    // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    public static final RegistryObject<Item> BAKED_PEACH = FOODS.register("baked_peach", () -> new SmallEffectRadiantSnack(props().food(Foods.BAKED_PEACH)));
    public static final RegistryObject<Item> BREAD_SLICE = FOODS.register("bread_slice", () -> new Item(props().food(Foods.BREAD_SLICE)));
    public static final RegistryObject<Item> CANDIED_PEACH = FOODS.register("candied_peach", () -> new CandiedItem(props().food(Foods.CANDIED_PEACH)));
    public static final RegistryObject<Item> CARBONATED_WATER = FOODS.register("carbonated_water", () -> new DrinkItem(props().food(Foods.CARBONATED_WATER)));
    public static final RegistryObject<Item> CHEESE_WEDGE = FOODS.register("cheese", () -> new Item(props().food(Foods.CHEESE_WEDGE)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = FOODS.register("chocolate_ice_cream", () -> new StrongEffectRadiantSnack(props().food(Foods.CHOCOLATE_ICE_CREAM)));
    public static final RegistryObject<Item> GLOWBERRY_JUICE = FOODS.register("glowberry_juice", () -> new GlowberryJuiceItem(props().food(Foods.GLOWBERRY_JUICE)));
    public static final RegistryObject<Item> GRILLED_CHEESE = FOODS.register("grilled_cheese", () -> new MediumEffectRadiantSnack(props().food(Foods.GRILLED_CHEESE)));
    public static final RegistryObject<Item> FRUIT_PUNCH = FOODS.register("fruit_punch", () -> new MediumEffectRadiantSnack(props().food(Foods.FRUIT_PUNCH)));
    public static final RegistryObject<Item> HONEY_MINT_TEA = FOODS.register("honey_mint_tea", () -> new SmallEffectRadiantDrink(props().food(Foods.HONEY_MINT_TEA)));
    public static final RegistryObject<Item> LEMON = FOODS.register("lemon", () -> new Item(props().food(Foods.LEMON)));
    public static final RegistryObject<Item> LEMONADE = FOODS.register("lemonade", () -> new MediumEffectRadiantDrink(props().food(Foods.LEMONADE)));
    public static final RegistryObject<Item> LEMON_CANDY = FOODS.register("lemon_candy", () -> new CandyItem(props().food(Foods.LEMON_CANDY)));
    public static final RegistryObject<Item> LEMON_JUICE = FOODS.register("lemon_juice", () -> new DrinkItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.LEMON_JUICE)));
    public static final RegistryObject<Item> LEMON_SLICE = FOODS.register("lemon_slice", () -> new Item(props().food(Foods.LEMON_SLICE)));
    public static final RegistryObject<Item> MELON_TANGHULU = FOODS.register("melon_tanghulu", () -> new Item(props().food(Foods.MELON_TANGHULU)));
    public static final RegistryObject<Item> MILK_CHOCOLATE = FOODS.register("milk_chocolate", () -> new Item(props().food(Foods.MILK_CHOCOLATE)));
    public static final RegistryObject<Item> MINT = FOODS.register("mint", () -> new Item(props().food(Foods.MINT)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_COOKIE = FOODS.register("mint_chocolate_cookie", () -> new Item(props().food(Foods.MINT_CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_MOCHI = FOODS.register("mint_chocolate_mochi", () -> new Item(props().food(Foods.MINT_CHOCOLATE_MOCHI)));
    public static final RegistryObject<Item> MINT_EXTRACT = FOODS.register("mint_extract", () -> new MintExtractItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.MINT_EXTRACT)));
    public static final RegistryObject<Item> MINT_ICE_CREAM = FOODS.register("mint_ice_cream", () -> new StrongEffectStimulatedSnack(props().food(Foods.MINT_ICE_CREAM)));
    public static final RegistryObject<Item> MINT_TEA = FOODS.register("mint_tea", () -> new StrongEffectStimulatedDrink(props().food(Foods.MINT_TEA)));
    public static final RegistryObject<Item> PEACH = FOODS.register("peach", () -> new Item(props().food(Foods.PEACH)));
    public static final RegistryObject<Item> PEACH_CANDY = FOODS.register("peach_candy", () -> new CandyItem(props().food(Foods.PEACH_CANDY)));
    public static final RegistryObject<Item> PEACH_COOKIE_CRUMBLE = FOODS.register("peach_cookie_crumble", () -> new MediumEffectRadiantSnack(props().food(Foods.PEACH_COOKIE_CRUMBLE)));
    public static final RegistryObject<Item> PEACH_ICE_CREAM = FOODS.register("peach_ice_cream", () -> new StrongEffectRadiantSnack(props().food(Foods.PEACH_ICE_CREAM)));
    public static final RegistryObject<Item> PEACH_JUICE = FOODS.register("peach_juice", () -> new MediumEffectRadiantDrink(props().food(Foods.PEACH_JUICE)));
    public static final RegistryObject<Item> PEACH_MOCHI = FOODS.register("peach_mochi", () -> new Item(props().food(Foods.PEACH_MOCHI)));
    public static final RegistryObject<Item> PEACHES_N_CREAM = FOODS.register("peaches_n_cream", () -> new Item(props().food(Foods.PEACHES_N_CREAM)));
    public static final RegistryObject<Item> PEACH_SLICE = FOODS.register("peach_slice", () -> new Item(props().food(Foods.PEACH_SLICE)));
    public static final RegistryObject<Item> PEACH_SYRUP = FOODS.register("peach_syrup", () -> new SyrupItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.PEACH_SYRUP)));
    public static final RegistryObject<Item> PEACH_SODA = FOODS.register("peach_soda", () -> new SodaItem(props().food(Foods.PEACH_SODA)));
    public static final RegistryObject<Item> PEACH_TEA = FOODS.register("peach_tea", () -> new MediumEffectRadiantDrink(props().food(Foods.PEACH_TEA)));
    public static final RegistryObject<Item> PEACH_TOAST = FOODS.register("peach_toast", () -> new Item(props().food(Foods.PEACH_TOAST)));
    public static final RegistryObject<Item> PEPPERMINT_PATTIE = FOODS.register("peppermint_pattie", () -> new Item(props().food(Foods.PEPPERMINT_PATTIE)));
    public static final RegistryObject<Item> POPPY_SEEDS = FOODS.register("poppy_seeds", () -> new Item(props().food(Foods.POPPY_SEEDS)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = FOODS.register("sweet_berry_juice", () -> new MediumEffectRadiantDrink(props().food(Foods.SWEET_BERRY_JUICE)));




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
        public static final FoodProperties BAKED_PEACH = new FoodProperties.Builder().nutrition(5).saturationMod(2.8f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).build();
        public static final FoodProperties BREAD_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(2f).build();
        public static final FoodProperties CANDIED_PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(2.8f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 1.0f).build();
        public static final FoodProperties CARBONATED_WATER = new FoodProperties.Builder().nutrition(0).saturationMod(1f).build();
        public static final FoodProperties CHEESE_N_FRUITS = new FoodProperties.Builder().nutrition(8).saturationMod(10f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties CHEESE_WEDGE = new FoodProperties.Builder().nutrition(5).saturationMod(5f).build();
        public static final FoodProperties CHOCOLATE_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(6f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0),1.0f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 0),1.0f).build();
        public static final FoodProperties GLOWBERRY_JUICE = new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1.0f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1.0f).build();
        public static final FoodProperties GRILLED_CHEESE = new FoodProperties.Builder().nutrition(8).saturationMod(8f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties FRUIT_PUNCH = new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties HONEY_MINT_TEA = new FoodProperties.Builder().nutrition(4).saturationMod(3.5f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f).effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 600, 0), 1.0f).build();
        public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).build();
        public static final FoodProperties LEMONADE = new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties LEMON_CANDY = new FoodProperties.Builder().nutrition(1).saturationMod(0.50f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0f).fast().build();
        public static final FoodProperties LEMON_JUICE = new FoodProperties.Builder().nutrition(2).saturationMod(2f).build();
        public static final FoodProperties LEMON_SLICE = new FoodProperties.Builder().nutrition(1).saturationMod(0.8f).build();
        public static final FoodProperties MELON_TANGHULU = new FoodProperties.Builder().nutrition(3).saturationMod(2f).build();
        public static final FoodProperties MILK_CHOCOLATE = new FoodProperties.Builder().nutrition(4).saturationMod(2.8f).build();
        public static final FoodProperties MINT = new FoodProperties.Builder().nutrition(1).saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).fast().build();
        public static final FoodProperties MINT_CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(1).saturationMod(0.8f).build();
        public static final FoodProperties MINT_CHOCOLATE_MOCHI = new FoodProperties.Builder().nutrition(6).saturationMod(2.0f).build();
        public static final FoodProperties MINT_EXTRACT = new FoodProperties.Builder().nutrition(1).saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 1.0F).build();
        public static final FoodProperties MINT_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(6f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1), 1.0F).effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties MINT_TEA = new FoodProperties.Builder().nutrition(4).alwaysEat().saturationMod(3.5f).effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.8f).build();
        public static final FoodProperties PEACH_CANDY = new FoodProperties.Builder().nutrition(1).saturationMod(0.50f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0f).fast().build();
        public static final FoodProperties PEACH_COOKIE_CRUMBLE = new FoodProperties.Builder().nutrition(5).saturationMod(3.2f).effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 2), 1.0F).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties PEACH_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(6f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1), 1.0F).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties PEACH_JUICE = new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties PEACH_MOCHI = new FoodProperties.Builder().nutrition(4).saturationMod(1.8f).build();
        public static final FoodProperties PEACHES_N_CREAM = new FoodProperties.Builder().nutrition(5).saturationMod(3.2f).build();
        public static final FoodProperties PEACH_SLICE = new FoodProperties.Builder().nutrition(2).fast().saturationMod(1.2f).build();
        public static final FoodProperties PEACH_SYRUP = new FoodProperties.Builder().nutrition(3).saturationMod(0.8f).build();
        public static final FoodProperties PEACH_SODA = new FoodProperties.Builder().nutrition(5).saturationMod(4f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0f).build();
        public static final FoodProperties PEACH_TEA = new FoodProperties.Builder().nutrition(4).saturationMod(3.5f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();
        public static final FoodProperties PEACH_TOAST = new FoodProperties.Builder().nutrition(4).saturationMod(3.2f).build();
        public static final FoodProperties PEPPERMINT_PATTIE = new FoodProperties.Builder().nutrition(4).saturationMod(3.2f).build();
        public static final FoodProperties POPPY_SEEDS = new FoodProperties.Builder().nutrition(0).fast().saturationMod(0.2f).effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 300, 0), 1.0f).build();
        public static final FoodProperties SWEET_BERRY_JUICE = new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3000, 0), 1.0f).build();



    }

}