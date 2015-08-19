package com.helger.css.decl;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.helger.commons.annotation.Nonempty;
import com.helger.css.CSSSourceLocation;
import com.helger.css.ICSSWriterSettings;
/**
 * Rules that apply to the page-margin boxes within a {@link CSSPageRule}<br>
 * 
 * Example:<br>
 * <pre>
 * {@literal @}page {
 *   {@literal @}bottom-right{ content:element('footer') };
 * }
 * </pre>
 * 
 * @author Bjoern Hasselmann
 *
 */
public class CSSPageMarginBoxRule extends CSSUnknownRule implements ICSSPageMemberRule
{

  public CSSPageMarginBoxRule (@Nonnull @Nonempty String sDeclaration)
  {
    super (sDeclaration);
  }

  @Override
  public ICSSPageMemberRule getClone ()
  {
    CSSPageMarginBoxRule clonedRule = new CSSPageMarginBoxRule (this.getDeclaration ());
    clonedRule.setBody (this.getBody ());
    clonedRule.setParameterList (this.getParameterList ());
    CSSSourceLocation originalSource = this.getSourceLocation ();
    clonedRule.setSourceLocation (new CSSSourceLocation (originalSource.getFirstTokenArea (), originalSource.getLastTokenArea ()));
    return clonedRule;
  }
  
  @Override
  @Nonnull
  @Nonempty
  public String getAsCSSString(@Nonnull final ICSSWriterSettings aSettings, @Nonnegative final int nIndentLevel){
    final StringBuilder aSB = new StringBuilder (); 
    aSB.append (aSettings.getIndent (nIndentLevel+1));
    return aSB.append (super.getAsCSSString (aSettings, nIndentLevel+2)).toString ();
  }
  
}
