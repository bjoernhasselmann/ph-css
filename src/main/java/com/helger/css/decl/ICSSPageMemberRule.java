package com.helger.css.decl;

import com.helger.commons.lang.ICloneable;
import com.helger.css.ICSSWriteable;

/**
 * Basic interface for nested rules which can be part of {@link CSSPageRule}.
 * 
 * @author Bjoern Hasselmann
 *
 */
public interface ICSSPageMemberRule extends ICSSWriteable, ICloneable <ICSSPageMemberRule>
{
  
  /**
   * The type of the {@link ICSSPageMemberRule} instance.
   * 
   * @return the type
   */
  public ECSSPageMemberRuleType getType();
}
