package com.ankamagames.wakfu.common.game.craftNew.reference;

import gnu.trove.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class ReferenceCraft
{
    private final int m_id;
    private final int m_learningBookId;
    private final float m_xpFactor;
    private final boolean m_innate;
    private final boolean m_conceptualCraft;
    private final boolean m_hiddenCraft;
    private final TIntObjectHashMap<CraftRecipeReference> m_recipes;
    private TIntObjectHashMap<ArrayList<CraftRecipeReference>> m_ingredientsToRecipes;
    
    public ReferenceCraft(final int id, final int learningBookId, final float xpFactor, final boolean innate, final boolean conceptualCraft, final boolean hiddenCraft) {
        super();
        this.m_recipes = new TIntObjectHashMap<CraftRecipeReference>();
        this.m_ingredientsToRecipes = null;
        this.m_id = id;
        this.m_learningBookId = learningBookId;
        this.m_xpFactor = xpFactor;
        this.m_innate = innate;
        this.m_conceptualCraft = conceptualCraft;
        this.m_hiddenCraft = hiddenCraft;
    }
    
    public int getId() {
        return this.m_id;
    }
    
    public int getLearningBookId() {
        return this.m_learningBookId;
    }
    
    public float getXpFactor() {
        return this.m_xpFactor;
    }
    
    public boolean isInnate() {
        return this.m_innate || this.isConceptualCraft();
    }
    
    public boolean isConceptualCraft() {
        return this.m_conceptualCraft;
    }
    
    public CraftRecipeReference getRecipe(final int recipeId) {
        return this.m_recipes.get(recipeId);
    }
    
    public TIntObjectIterator<CraftRecipeReference> recipesIterator() {
        return this.m_recipes.iterator();
    }
    
    @Nullable
    public Iterator<CraftRecipeReference> ingredientsToRecipeIterator(final int ingredientId) {
        final ArrayList<CraftRecipeReference> recipes = this.m_ingredientsToRecipes.get(ingredientId);
        return (recipes != null) ? recipes.iterator() : null;
    }
    
    public boolean hasIngredientToRecipe(final int ingredientId) {
        return this.m_ingredientsToRecipes.get(ingredientId) != null;
    }
    
    public int getNumRecipes() {
        return this.m_recipes.size();
    }
    
    public boolean isHiddenCraft() {
        return this.m_hiddenCraft;
    }
    
    public void setIngredientsToRecipes(final TIntObjectHashMap<ArrayList<CraftRecipeReference>> ingredientsToRecipes) {
        this.m_ingredientsToRecipes = ingredientsToRecipes;
    }
    
    public void putRecipe(final int id, final CraftRecipeReference recipe) {
        this.m_recipes.put(id, recipe);
    }
}
