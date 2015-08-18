package com.helger.css.decl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.helger.commons.annotation.Nonempty;

/**
 * This enum contains all possible page-margin box rules.
 * 
 * @author Bjoern Hasselmann
 *
 */
public enum ECSSPageMarginBoxRuleDeclarations
{
  
  TOP_LEFT_CORNER("@top-left-corner"),
  
  TOP_LEFT("@top-left"),
  
  TOP_CENTER("@top-center"),
  
  TOP_RIGHT("@top-right"),
  
  TOP_RIGHT_CORNER("@top-right-corner"),
  
  RIGHT_TOP("@right-top"),
  
  RIGHT_MIDDLE("@right-middle"),
  
  RIGHT_BOTTOM("@right-bottom"),
  
  BOTTOM_RIGHT_CORNER("@bottom-right-corner"),
  
  BOTTOM_RIGHT("@bottom-right"),
  
  BOTTOM_CENTER("@bottom-center"),
  
  BOTTOM_LEFT("@bottom-left"),
  
  BOTTOM_LEFT_CORNER("@bottom-left-corner"),
  
  LEFT_BOTTOM("@left-bottom"),
  
  LEFT_MIDDLE("@left-middle"),
  
  LEFT_TOP("@left-top");
  
  private String declaration;
  
  private ECSSPageMarginBoxRuleDeclarations(String declaration){
    this.declaration = declaration;
  }
  
  /**
   * Returns the declaration this instance stands for
   * 
   * @return the declaration
   */
  public String getDeclaration(){
    return this.declaration;
  }
  
  /**
   * Returns the matching {@link ECSSPageMarginBoxRuleDeclarations} instance, if any. Null otherwise.
   * 
   * @param declaration The declaration to look for
   * @return The matching value or null
   */
  public static ECSSPageMarginBoxRuleDeclarations getValueByDeclarationIgnoreCase(@Nonempty @Nonnull String declaration){
    for(ECSSPageMarginBoxRuleDeclarations val : ECSSPageMarginBoxRuleDeclarations.values()){
      if(val.getDeclaration ().equalsIgnoreCase (declaration))
        return val;
    }
    return null;
  }
  
  /**
   * Returns a list of all declarations associated with an {@link ECSSPageMarginBoxRuleDeclarations} instance
   * 
   * @return list of declarations
   */
  public static List<String> getAllDeclarations(){
    List<String> declarations = new ArrayList<String>();
    for(ECSSPageMarginBoxRuleDeclarations e : ECSSPageMarginBoxRuleDeclarations.values()){
      declarations.add (e.getDeclaration ());
    }
    return declarations;
  }
  
}
