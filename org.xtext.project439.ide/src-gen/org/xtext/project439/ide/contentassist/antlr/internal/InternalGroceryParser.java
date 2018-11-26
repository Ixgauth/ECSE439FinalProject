package org.xtext.project439.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.project439.services.GroceryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGroceryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'good'", "'okay'", "'needs removal'", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'supplier'", "'shelf'", "'backroom'", "'produce'", "'price'", "'quantity'", "'quality'", "'perishableItem'", "'experationDate'", "'nonFoodItem'", "'driver'", "'name'", "'employee'", "'customer'", "'vehicle'", "'plateNumber'", "'delivery'", "'sale'", "'stock'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGroceryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGroceryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGroceryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGrocery.g"; }


    	private GroceryGrammarAccess grammarAccess;

    	public void setGrammarAccess(GroceryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGrocery"
    // InternalGrocery.g:53:1: entryRuleGrocery : ruleGrocery EOF ;
    public final void entryRuleGrocery() throws RecognitionException {
        try {
            // InternalGrocery.g:54:1: ( ruleGrocery EOF )
            // InternalGrocery.g:55:1: ruleGrocery EOF
            {
             before(grammarAccess.getGroceryRule()); 
            pushFollow(FOLLOW_1);
            ruleGrocery();

            state._fsp--;

             after(grammarAccess.getGroceryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrocery"


    // $ANTLR start "ruleGrocery"
    // InternalGrocery.g:62:1: ruleGrocery : ( ( rule__Grocery__ElementsAssignment )* ) ;
    public final void ruleGrocery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:66:2: ( ( ( rule__Grocery__ElementsAssignment )* ) )
            // InternalGrocery.g:67:2: ( ( rule__Grocery__ElementsAssignment )* )
            {
            // InternalGrocery.g:67:2: ( ( rule__Grocery__ElementsAssignment )* )
            // InternalGrocery.g:68:3: ( rule__Grocery__ElementsAssignment )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment()); 
            // InternalGrocery.g:69:3: ( rule__Grocery__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==17||(LA1_0>=20 && LA1_0<=23)||LA1_0==27||(LA1_0>=29 && LA1_0<=30)||(LA1_0>=32 && LA1_0<=34)||(LA1_0>=36 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrocery.g:69:4: rule__Grocery__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Grocery__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGroceryAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrocery"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalGrocery.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalGrocery.g:79:1: ( ruleAbstractElement EOF )
            // InternalGrocery.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalGrocery.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalGrocery.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalGrocery.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalGrocery.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalGrocery.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalGrocery.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleBuilding"
    // InternalGrocery.g:103:1: entryRuleBuilding : ruleBuilding EOF ;
    public final void entryRuleBuilding() throws RecognitionException {
        try {
            // InternalGrocery.g:104:1: ( ruleBuilding EOF )
            // InternalGrocery.g:105:1: ruleBuilding EOF
            {
             before(grammarAccess.getBuildingRule()); 
            pushFollow(FOLLOW_1);
            ruleBuilding();

            state._fsp--;

             after(grammarAccess.getBuildingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuilding"


    // $ANTLR start "ruleBuilding"
    // InternalGrocery.g:112:1: ruleBuilding : ( ( rule__Building__Alternatives ) ) ;
    public final void ruleBuilding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:116:2: ( ( ( rule__Building__Alternatives ) ) )
            // InternalGrocery.g:117:2: ( ( rule__Building__Alternatives ) )
            {
            // InternalGrocery.g:117:2: ( ( rule__Building__Alternatives ) )
            // InternalGrocery.g:118:3: ( rule__Building__Alternatives )
            {
             before(grammarAccess.getBuildingAccess().getAlternatives()); 
            // InternalGrocery.g:119:3: ( rule__Building__Alternatives )
            // InternalGrocery.g:119:4: rule__Building__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Building__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuildingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuilding"


    // $ANTLR start "entryRuleStoreElements"
    // InternalGrocery.g:128:1: entryRuleStoreElements : ruleStoreElements EOF ;
    public final void entryRuleStoreElements() throws RecognitionException {
        try {
            // InternalGrocery.g:129:1: ( ruleStoreElements EOF )
            // InternalGrocery.g:130:1: ruleStoreElements EOF
            {
             before(grammarAccess.getStoreElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStoreElements();

            state._fsp--;

             after(grammarAccess.getStoreElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStoreElements"


    // $ANTLR start "ruleStoreElements"
    // InternalGrocery.g:137:1: ruleStoreElements : ( ( rule__StoreElements__Alternatives ) ) ;
    public final void ruleStoreElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:141:2: ( ( ( rule__StoreElements__Alternatives ) ) )
            // InternalGrocery.g:142:2: ( ( rule__StoreElements__Alternatives ) )
            {
            // InternalGrocery.g:142:2: ( ( rule__StoreElements__Alternatives ) )
            // InternalGrocery.g:143:3: ( rule__StoreElements__Alternatives )
            {
             before(grammarAccess.getStoreElementsAccess().getAlternatives()); 
            // InternalGrocery.g:144:3: ( rule__StoreElements__Alternatives )
            // InternalGrocery.g:144:4: rule__StoreElements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StoreElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoreElements"


    // $ANTLR start "entryRuleMovementElement"
    // InternalGrocery.g:153:1: entryRuleMovementElement : ruleMovementElement EOF ;
    public final void entryRuleMovementElement() throws RecognitionException {
        try {
            // InternalGrocery.g:154:1: ( ruleMovementElement EOF )
            // InternalGrocery.g:155:1: ruleMovementElement EOF
            {
             before(grammarAccess.getMovementElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovementElement();

            state._fsp--;

             after(grammarAccess.getMovementElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovementElement"


    // $ANTLR start "ruleMovementElement"
    // InternalGrocery.g:162:1: ruleMovementElement : ( ( rule__MovementElement__Alternatives ) ) ;
    public final void ruleMovementElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:166:2: ( ( ( rule__MovementElement__Alternatives ) ) )
            // InternalGrocery.g:167:2: ( ( rule__MovementElement__Alternatives ) )
            {
            // InternalGrocery.g:167:2: ( ( rule__MovementElement__Alternatives ) )
            // InternalGrocery.g:168:3: ( rule__MovementElement__Alternatives )
            {
             before(grammarAccess.getMovementElementAccess().getAlternatives()); 
            // InternalGrocery.g:169:3: ( rule__MovementElement__Alternatives )
            // InternalGrocery.g:169:4: rule__MovementElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MovementElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMovementElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovementElement"


    // $ANTLR start "entryRulePerson"
    // InternalGrocery.g:178:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalGrocery.g:179:1: ( rulePerson EOF )
            // InternalGrocery.g:180:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalGrocery.g:187:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:191:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalGrocery.g:192:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalGrocery.g:192:2: ( ( rule__Person__Alternatives ) )
            // InternalGrocery.g:193:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalGrocery.g:194:3: ( rule__Person__Alternatives )
            // InternalGrocery.g:194:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleItem"
    // InternalGrocery.g:203:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalGrocery.g:204:1: ( ruleItem EOF )
            // InternalGrocery.g:205:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalGrocery.g:212:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:216:2: ( ( ( rule__Item__Alternatives ) ) )
            // InternalGrocery.g:217:2: ( ( rule__Item__Alternatives ) )
            {
            // InternalGrocery.g:217:2: ( ( rule__Item__Alternatives ) )
            // InternalGrocery.g:218:3: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // InternalGrocery.g:219:3: ( rule__Item__Alternatives )
            // InternalGrocery.g:219:4: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleFoodItem"
    // InternalGrocery.g:228:1: entryRuleFoodItem : ruleFoodItem EOF ;
    public final void entryRuleFoodItem() throws RecognitionException {
        try {
            // InternalGrocery.g:229:1: ( ruleFoodItem EOF )
            // InternalGrocery.g:230:1: ruleFoodItem EOF
            {
             before(grammarAccess.getFoodItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodItem();

            state._fsp--;

             after(grammarAccess.getFoodItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoodItem"


    // $ANTLR start "ruleFoodItem"
    // InternalGrocery.g:237:1: ruleFoodItem : ( ( rule__FoodItem__Alternatives ) ) ;
    public final void ruleFoodItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:241:2: ( ( ( rule__FoodItem__Alternatives ) ) )
            // InternalGrocery.g:242:2: ( ( rule__FoodItem__Alternatives ) )
            {
            // InternalGrocery.g:242:2: ( ( rule__FoodItem__Alternatives ) )
            // InternalGrocery.g:243:3: ( rule__FoodItem__Alternatives )
            {
             before(grammarAccess.getFoodItemAccess().getAlternatives()); 
            // InternalGrocery.g:244:3: ( rule__FoodItem__Alternatives )
            // InternalGrocery.g:244:4: rule__FoodItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FoodItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFoodItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodItem"


    // $ANTLR start "entryRuleMovement"
    // InternalGrocery.g:253:1: entryRuleMovement : ruleMovement EOF ;
    public final void entryRuleMovement() throws RecognitionException {
        try {
            // InternalGrocery.g:254:1: ( ruleMovement EOF )
            // InternalGrocery.g:255:1: ruleMovement EOF
            {
             before(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getMovementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalGrocery.g:262:1: ruleMovement : ( ( rule__Movement__Alternatives ) ) ;
    public final void ruleMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:266:2: ( ( ( rule__Movement__Alternatives ) ) )
            // InternalGrocery.g:267:2: ( ( rule__Movement__Alternatives ) )
            {
            // InternalGrocery.g:267:2: ( ( rule__Movement__Alternatives ) )
            // InternalGrocery.g:268:3: ( rule__Movement__Alternatives )
            {
             before(grammarAccess.getMovementAccess().getAlternatives()); 
            // InternalGrocery.g:269:3: ( rule__Movement__Alternatives )
            // InternalGrocery.g:269:4: rule__Movement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleStore"
    // InternalGrocery.g:278:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalGrocery.g:279:1: ( ruleStore EOF )
            // InternalGrocery.g:280:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalGrocery.g:287:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:291:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalGrocery.g:292:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalGrocery.g:292:2: ( ( rule__Store__Group__0 ) )
            // InternalGrocery.g:293:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalGrocery.g:294:3: ( rule__Store__Group__0 )
            // InternalGrocery.g:294:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleWarehouse"
    // InternalGrocery.g:303:1: entryRuleWarehouse : ruleWarehouse EOF ;
    public final void entryRuleWarehouse() throws RecognitionException {
        try {
            // InternalGrocery.g:304:1: ( ruleWarehouse EOF )
            // InternalGrocery.g:305:1: ruleWarehouse EOF
            {
             before(grammarAccess.getWarehouseRule()); 
            pushFollow(FOLLOW_1);
            ruleWarehouse();

            state._fsp--;

             after(grammarAccess.getWarehouseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWarehouse"


    // $ANTLR start "ruleWarehouse"
    // InternalGrocery.g:312:1: ruleWarehouse : ( ( rule__Warehouse__Group__0 ) ) ;
    public final void ruleWarehouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:316:2: ( ( ( rule__Warehouse__Group__0 ) ) )
            // InternalGrocery.g:317:2: ( ( rule__Warehouse__Group__0 ) )
            {
            // InternalGrocery.g:317:2: ( ( rule__Warehouse__Group__0 ) )
            // InternalGrocery.g:318:3: ( rule__Warehouse__Group__0 )
            {
             before(grammarAccess.getWarehouseAccess().getGroup()); 
            // InternalGrocery.g:319:3: ( rule__Warehouse__Group__0 )
            // InternalGrocery.g:319:4: rule__Warehouse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWarehouse"


    // $ANTLR start "entryRuleShelf"
    // InternalGrocery.g:328:1: entryRuleShelf : ruleShelf EOF ;
    public final void entryRuleShelf() throws RecognitionException {
        try {
            // InternalGrocery.g:329:1: ( ruleShelf EOF )
            // InternalGrocery.g:330:1: ruleShelf EOF
            {
             before(grammarAccess.getShelfRule()); 
            pushFollow(FOLLOW_1);
            ruleShelf();

            state._fsp--;

             after(grammarAccess.getShelfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShelf"


    // $ANTLR start "ruleShelf"
    // InternalGrocery.g:337:1: ruleShelf : ( ( rule__Shelf__Group__0 ) ) ;
    public final void ruleShelf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:341:2: ( ( ( rule__Shelf__Group__0 ) ) )
            // InternalGrocery.g:342:2: ( ( rule__Shelf__Group__0 ) )
            {
            // InternalGrocery.g:342:2: ( ( rule__Shelf__Group__0 ) )
            // InternalGrocery.g:343:3: ( rule__Shelf__Group__0 )
            {
             before(grammarAccess.getShelfAccess().getGroup()); 
            // InternalGrocery.g:344:3: ( rule__Shelf__Group__0 )
            // InternalGrocery.g:344:4: rule__Shelf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShelfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShelf"


    // $ANTLR start "entryRuleBackroom"
    // InternalGrocery.g:353:1: entryRuleBackroom : ruleBackroom EOF ;
    public final void entryRuleBackroom() throws RecognitionException {
        try {
            // InternalGrocery.g:354:1: ( ruleBackroom EOF )
            // InternalGrocery.g:355:1: ruleBackroom EOF
            {
             before(grammarAccess.getBackroomRule()); 
            pushFollow(FOLLOW_1);
            ruleBackroom();

            state._fsp--;

             after(grammarAccess.getBackroomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackroom"


    // $ANTLR start "ruleBackroom"
    // InternalGrocery.g:362:1: ruleBackroom : ( ( rule__Backroom__Group__0 ) ) ;
    public final void ruleBackroom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:366:2: ( ( ( rule__Backroom__Group__0 ) ) )
            // InternalGrocery.g:367:2: ( ( rule__Backroom__Group__0 ) )
            {
            // InternalGrocery.g:367:2: ( ( rule__Backroom__Group__0 ) )
            // InternalGrocery.g:368:3: ( rule__Backroom__Group__0 )
            {
             before(grammarAccess.getBackroomAccess().getGroup()); 
            // InternalGrocery.g:369:3: ( rule__Backroom__Group__0 )
            // InternalGrocery.g:369:4: rule__Backroom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackroomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackroom"


    // $ANTLR start "entryRuleProduce"
    // InternalGrocery.g:378:1: entryRuleProduce : ruleProduce EOF ;
    public final void entryRuleProduce() throws RecognitionException {
        try {
            // InternalGrocery.g:379:1: ( ruleProduce EOF )
            // InternalGrocery.g:380:1: ruleProduce EOF
            {
             before(grammarAccess.getProduceRule()); 
            pushFollow(FOLLOW_1);
            ruleProduce();

            state._fsp--;

             after(grammarAccess.getProduceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProduce"


    // $ANTLR start "ruleProduce"
    // InternalGrocery.g:387:1: ruleProduce : ( ( rule__Produce__Group__0 ) ) ;
    public final void ruleProduce() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:391:2: ( ( ( rule__Produce__Group__0 ) ) )
            // InternalGrocery.g:392:2: ( ( rule__Produce__Group__0 ) )
            {
            // InternalGrocery.g:392:2: ( ( rule__Produce__Group__0 ) )
            // InternalGrocery.g:393:3: ( rule__Produce__Group__0 )
            {
             before(grammarAccess.getProduceAccess().getGroup()); 
            // InternalGrocery.g:394:3: ( rule__Produce__Group__0 )
            // InternalGrocery.g:394:4: rule__Produce__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Produce__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProduceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduce"


    // $ANTLR start "entryRulePerishableItem"
    // InternalGrocery.g:403:1: entryRulePerishableItem : rulePerishableItem EOF ;
    public final void entryRulePerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:404:1: ( rulePerishableItem EOF )
            // InternalGrocery.g:405:1: rulePerishableItem EOF
            {
             before(grammarAccess.getPerishableItemRule()); 
            pushFollow(FOLLOW_1);
            rulePerishableItem();

            state._fsp--;

             after(grammarAccess.getPerishableItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerishableItem"


    // $ANTLR start "rulePerishableItem"
    // InternalGrocery.g:412:1: rulePerishableItem : ( ( rule__PerishableItem__Group__0 ) ) ;
    public final void rulePerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:416:2: ( ( ( rule__PerishableItem__Group__0 ) ) )
            // InternalGrocery.g:417:2: ( ( rule__PerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:417:2: ( ( rule__PerishableItem__Group__0 ) )
            // InternalGrocery.g:418:3: ( rule__PerishableItem__Group__0 )
            {
             before(grammarAccess.getPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:419:3: ( rule__PerishableItem__Group__0 )
            // InternalGrocery.g:419:4: rule__PerishableItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerishableItem"


    // $ANTLR start "entryRuleNonFoodItem"
    // InternalGrocery.g:428:1: entryRuleNonFoodItem : ruleNonFoodItem EOF ;
    public final void entryRuleNonFoodItem() throws RecognitionException {
        try {
            // InternalGrocery.g:429:1: ( ruleNonFoodItem EOF )
            // InternalGrocery.g:430:1: ruleNonFoodItem EOF
            {
             before(grammarAccess.getNonFoodItemRule()); 
            pushFollow(FOLLOW_1);
            ruleNonFoodItem();

            state._fsp--;

             after(grammarAccess.getNonFoodItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonFoodItem"


    // $ANTLR start "ruleNonFoodItem"
    // InternalGrocery.g:437:1: ruleNonFoodItem : ( ( rule__NonFoodItem__Group__0 ) ) ;
    public final void ruleNonFoodItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:441:2: ( ( ( rule__NonFoodItem__Group__0 ) ) )
            // InternalGrocery.g:442:2: ( ( rule__NonFoodItem__Group__0 ) )
            {
            // InternalGrocery.g:442:2: ( ( rule__NonFoodItem__Group__0 ) )
            // InternalGrocery.g:443:3: ( rule__NonFoodItem__Group__0 )
            {
             before(grammarAccess.getNonFoodItemAccess().getGroup()); 
            // InternalGrocery.g:444:3: ( rule__NonFoodItem__Group__0 )
            // InternalGrocery.g:444:4: rule__NonFoodItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonFoodItem"


    // $ANTLR start "entryRuleDriver"
    // InternalGrocery.g:453:1: entryRuleDriver : ruleDriver EOF ;
    public final void entryRuleDriver() throws RecognitionException {
        try {
            // InternalGrocery.g:454:1: ( ruleDriver EOF )
            // InternalGrocery.g:455:1: ruleDriver EOF
            {
             before(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_1);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getDriverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // InternalGrocery.g:462:1: ruleDriver : ( ( rule__Driver__Group__0 ) ) ;
    public final void ruleDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:466:2: ( ( ( rule__Driver__Group__0 ) ) )
            // InternalGrocery.g:467:2: ( ( rule__Driver__Group__0 ) )
            {
            // InternalGrocery.g:467:2: ( ( rule__Driver__Group__0 ) )
            // InternalGrocery.g:468:3: ( rule__Driver__Group__0 )
            {
             before(grammarAccess.getDriverAccess().getGroup()); 
            // InternalGrocery.g:469:3: ( rule__Driver__Group__0 )
            // InternalGrocery.g:469:4: rule__Driver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleEmployee"
    // InternalGrocery.g:478:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalGrocery.g:479:1: ( ruleEmployee EOF )
            // InternalGrocery.g:480:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalGrocery.g:487:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:491:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalGrocery.g:492:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalGrocery.g:492:2: ( ( rule__Employee__Group__0 ) )
            // InternalGrocery.g:493:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalGrocery.g:494:3: ( rule__Employee__Group__0 )
            // InternalGrocery.g:494:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleCustomer"
    // InternalGrocery.g:503:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalGrocery.g:504:1: ( ruleCustomer EOF )
            // InternalGrocery.g:505:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalGrocery.g:512:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:516:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalGrocery.g:517:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalGrocery.g:517:2: ( ( rule__Customer__Group__0 ) )
            // InternalGrocery.g:518:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalGrocery.g:519:3: ( rule__Customer__Group__0 )
            // InternalGrocery.g:519:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleSupplier"
    // InternalGrocery.g:528:1: entryRuleSupplier : ruleSupplier EOF ;
    public final void entryRuleSupplier() throws RecognitionException {
        try {
            // InternalGrocery.g:529:1: ( ruleSupplier EOF )
            // InternalGrocery.g:530:1: ruleSupplier EOF
            {
             before(grammarAccess.getSupplierRule()); 
            pushFollow(FOLLOW_1);
            ruleSupplier();

            state._fsp--;

             after(grammarAccess.getSupplierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSupplier"


    // $ANTLR start "ruleSupplier"
    // InternalGrocery.g:537:1: ruleSupplier : ( ( rule__Supplier__Group__0 ) ) ;
    public final void ruleSupplier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:541:2: ( ( ( rule__Supplier__Group__0 ) ) )
            // InternalGrocery.g:542:2: ( ( rule__Supplier__Group__0 ) )
            {
            // InternalGrocery.g:542:2: ( ( rule__Supplier__Group__0 ) )
            // InternalGrocery.g:543:3: ( rule__Supplier__Group__0 )
            {
             before(grammarAccess.getSupplierAccess().getGroup()); 
            // InternalGrocery.g:544:3: ( rule__Supplier__Group__0 )
            // InternalGrocery.g:544:4: rule__Supplier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Supplier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSupplierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupplier"


    // $ANTLR start "entryRuleVehicle"
    // InternalGrocery.g:553:1: entryRuleVehicle : ruleVehicle EOF ;
    public final void entryRuleVehicle() throws RecognitionException {
        try {
            // InternalGrocery.g:554:1: ( ruleVehicle EOF )
            // InternalGrocery.g:555:1: ruleVehicle EOF
            {
             before(grammarAccess.getVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleVehicle();

            state._fsp--;

             after(grammarAccess.getVehicleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVehicle"


    // $ANTLR start "ruleVehicle"
    // InternalGrocery.g:562:1: ruleVehicle : ( ( rule__Vehicle__Group__0 ) ) ;
    public final void ruleVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:566:2: ( ( ( rule__Vehicle__Group__0 ) ) )
            // InternalGrocery.g:567:2: ( ( rule__Vehicle__Group__0 ) )
            {
            // InternalGrocery.g:567:2: ( ( rule__Vehicle__Group__0 ) )
            // InternalGrocery.g:568:3: ( rule__Vehicle__Group__0 )
            {
             before(grammarAccess.getVehicleAccess().getGroup()); 
            // InternalGrocery.g:569:3: ( rule__Vehicle__Group__0 )
            // InternalGrocery.g:569:4: rule__Vehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVehicleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVehicle"


    // $ANTLR start "entryRuleDelivery"
    // InternalGrocery.g:578:1: entryRuleDelivery : ruleDelivery EOF ;
    public final void entryRuleDelivery() throws RecognitionException {
        try {
            // InternalGrocery.g:579:1: ( ruleDelivery EOF )
            // InternalGrocery.g:580:1: ruleDelivery EOF
            {
             before(grammarAccess.getDeliveryRule()); 
            pushFollow(FOLLOW_1);
            ruleDelivery();

            state._fsp--;

             after(grammarAccess.getDeliveryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelivery"


    // $ANTLR start "ruleDelivery"
    // InternalGrocery.g:587:1: ruleDelivery : ( ( rule__Delivery__Group__0 ) ) ;
    public final void ruleDelivery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:591:2: ( ( ( rule__Delivery__Group__0 ) ) )
            // InternalGrocery.g:592:2: ( ( rule__Delivery__Group__0 ) )
            {
            // InternalGrocery.g:592:2: ( ( rule__Delivery__Group__0 ) )
            // InternalGrocery.g:593:3: ( rule__Delivery__Group__0 )
            {
             before(grammarAccess.getDeliveryAccess().getGroup()); 
            // InternalGrocery.g:594:3: ( rule__Delivery__Group__0 )
            // InternalGrocery.g:594:4: rule__Delivery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelivery"


    // $ANTLR start "entryRuleSale"
    // InternalGrocery.g:603:1: entryRuleSale : ruleSale EOF ;
    public final void entryRuleSale() throws RecognitionException {
        try {
            // InternalGrocery.g:604:1: ( ruleSale EOF )
            // InternalGrocery.g:605:1: ruleSale EOF
            {
             before(grammarAccess.getSaleRule()); 
            pushFollow(FOLLOW_1);
            ruleSale();

            state._fsp--;

             after(grammarAccess.getSaleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSale"


    // $ANTLR start "ruleSale"
    // InternalGrocery.g:612:1: ruleSale : ( ( rule__Sale__Group__0 ) ) ;
    public final void ruleSale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:616:2: ( ( ( rule__Sale__Group__0 ) ) )
            // InternalGrocery.g:617:2: ( ( rule__Sale__Group__0 ) )
            {
            // InternalGrocery.g:617:2: ( ( rule__Sale__Group__0 ) )
            // InternalGrocery.g:618:3: ( rule__Sale__Group__0 )
            {
             before(grammarAccess.getSaleAccess().getGroup()); 
            // InternalGrocery.g:619:3: ( rule__Sale__Group__0 )
            // InternalGrocery.g:619:4: rule__Sale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSale"


    // $ANTLR start "entryRuleStockMovement"
    // InternalGrocery.g:628:1: entryRuleStockMovement : ruleStockMovement EOF ;
    public final void entryRuleStockMovement() throws RecognitionException {
        try {
            // InternalGrocery.g:629:1: ( ruleStockMovement EOF )
            // InternalGrocery.g:630:1: ruleStockMovement EOF
            {
             before(grammarAccess.getStockMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleStockMovement();

            state._fsp--;

             after(grammarAccess.getStockMovementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStockMovement"


    // $ANTLR start "ruleStockMovement"
    // InternalGrocery.g:637:1: ruleStockMovement : ( ( rule__StockMovement__Group__0 ) ) ;
    public final void ruleStockMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:641:2: ( ( ( rule__StockMovement__Group__0 ) ) )
            // InternalGrocery.g:642:2: ( ( rule__StockMovement__Group__0 ) )
            {
            // InternalGrocery.g:642:2: ( ( rule__StockMovement__Group__0 ) )
            // InternalGrocery.g:643:3: ( rule__StockMovement__Group__0 )
            {
             before(grammarAccess.getStockMovementAccess().getGroup()); 
            // InternalGrocery.g:644:3: ( rule__StockMovement__Group__0 )
            // InternalGrocery.g:644:4: rule__StockMovement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStockMovement"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGrocery.g:653:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalGrocery.g:654:1: ( ruleDECIMAL EOF )
            // InternalGrocery.g:655:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalGrocery.g:662:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:666:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalGrocery.g:667:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalGrocery.g:667:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalGrocery.g:668:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalGrocery.g:669:3: ( rule__DECIMAL__Group__0 )
            // InternalGrocery.g:669:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleDATE"
    // InternalGrocery.g:678:1: entryRuleDATE : ruleDATE EOF ;
    public final void entryRuleDATE() throws RecognitionException {
        try {
            // InternalGrocery.g:679:1: ( ruleDATE EOF )
            // InternalGrocery.g:680:1: ruleDATE EOF
            {
             before(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getDATERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalGrocery.g:687:1: ruleDATE : ( ( rule__DATE__Group__0 ) ) ;
    public final void ruleDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:691:2: ( ( ( rule__DATE__Group__0 ) ) )
            // InternalGrocery.g:692:2: ( ( rule__DATE__Group__0 ) )
            {
            // InternalGrocery.g:692:2: ( ( rule__DATE__Group__0 ) )
            // InternalGrocery.g:693:3: ( rule__DATE__Group__0 )
            {
             before(grammarAccess.getDATEAccess().getGroup()); 
            // InternalGrocery.g:694:3: ( rule__DATE__Group__0 )
            // InternalGrocery.g:694:4: rule__DATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DATE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleADDRESS"
    // InternalGrocery.g:703:1: entryRuleADDRESS : ruleADDRESS EOF ;
    public final void entryRuleADDRESS() throws RecognitionException {
        try {
            // InternalGrocery.g:704:1: ( ruleADDRESS EOF )
            // InternalGrocery.g:705:1: ruleADDRESS EOF
            {
             before(grammarAccess.getADDRESSRule()); 
            pushFollow(FOLLOW_1);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getADDRESSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleADDRESS"


    // $ANTLR start "ruleADDRESS"
    // InternalGrocery.g:712:1: ruleADDRESS : ( ( rule__ADDRESS__Group__0 ) ) ;
    public final void ruleADDRESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:716:2: ( ( ( rule__ADDRESS__Group__0 ) ) )
            // InternalGrocery.g:717:2: ( ( rule__ADDRESS__Group__0 ) )
            {
            // InternalGrocery.g:717:2: ( ( rule__ADDRESS__Group__0 ) )
            // InternalGrocery.g:718:3: ( rule__ADDRESS__Group__0 )
            {
             before(grammarAccess.getADDRESSAccess().getGroup()); 
            // InternalGrocery.g:719:3: ( rule__ADDRESS__Group__0 )
            // InternalGrocery.g:719:4: rule__ADDRESS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getADDRESSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleADDRESS"


    // $ANTLR start "rulequalityLevel"
    // InternalGrocery.g:728:1: rulequalityLevel : ( ( rule__QualityLevel__Alternatives ) ) ;
    public final void rulequalityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:732:1: ( ( ( rule__QualityLevel__Alternatives ) ) )
            // InternalGrocery.g:733:2: ( ( rule__QualityLevel__Alternatives ) )
            {
            // InternalGrocery.g:733:2: ( ( rule__QualityLevel__Alternatives ) )
            // InternalGrocery.g:734:3: ( rule__QualityLevel__Alternatives )
            {
             before(grammarAccess.getQualityLevelAccess().getAlternatives()); 
            // InternalGrocery.g:735:3: ( rule__QualityLevel__Alternatives )
            // InternalGrocery.g:735:4: rule__QualityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualityLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulequalityLevel"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalGrocery.g:743:1: rule__AbstractElement__Alternatives : ( ( ruleBuilding ) | ( ruleMovementElement ) | ( ruleMovement ) | ( ruleItem ) | ( ruleStoreElements ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:747:1: ( ( ruleBuilding ) | ( ruleMovementElement ) | ( ruleMovement ) | ( ruleItem ) | ( ruleStoreElements ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
            case 17:
                {
                alt2=1;
                }
                break;
            case 20:
            case 30:
            case 32:
            case 33:
            case 34:
                {
                alt2=2;
                }
                break;
            case 36:
            case 37:
            case 38:
                {
                alt2=3;
                }
                break;
            case 23:
            case 27:
            case 29:
                {
                alt2=4;
                }
                break;
            case 21:
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGrocery.g:748:2: ( ruleBuilding )
                    {
                    // InternalGrocery.g:748:2: ( ruleBuilding )
                    // InternalGrocery.g:749:3: ruleBuilding
                    {
                     before(grammarAccess.getAbstractElementAccess().getBuildingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBuilding();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getBuildingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:754:2: ( ruleMovementElement )
                    {
                    // InternalGrocery.g:754:2: ( ruleMovementElement )
                    // InternalGrocery.g:755:3: ruleMovementElement
                    {
                     before(grammarAccess.getAbstractElementAccess().getMovementElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMovementElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getMovementElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:760:2: ( ruleMovement )
                    {
                    // InternalGrocery.g:760:2: ( ruleMovement )
                    // InternalGrocery.g:761:3: ruleMovement
                    {
                     before(grammarAccess.getAbstractElementAccess().getMovementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMovement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getMovementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGrocery.g:766:2: ( ruleItem )
                    {
                    // InternalGrocery.g:766:2: ( ruleItem )
                    // InternalGrocery.g:767:3: ruleItem
                    {
                     before(grammarAccess.getAbstractElementAccess().getItemParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleItem();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getItemParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGrocery.g:772:2: ( ruleStoreElements )
                    {
                    // InternalGrocery.g:772:2: ( ruleStoreElements )
                    // InternalGrocery.g:773:3: ruleStoreElements
                    {
                     before(grammarAccess.getAbstractElementAccess().getStoreElementsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStoreElements();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getStoreElementsParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Building__Alternatives"
    // InternalGrocery.g:782:1: rule__Building__Alternatives : ( ( ruleStore ) | ( ruleWarehouse ) );
    public final void rule__Building__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:786:1: ( ( ruleStore ) | ( ruleWarehouse ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:787:2: ( ruleStore )
                    {
                    // InternalGrocery.g:787:2: ( ruleStore )
                    // InternalGrocery.g:788:3: ruleStore
                    {
                     before(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:793:2: ( ruleWarehouse )
                    {
                    // InternalGrocery.g:793:2: ( ruleWarehouse )
                    // InternalGrocery.g:794:3: ruleWarehouse
                    {
                     before(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWarehouse();

                    state._fsp--;

                     after(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Alternatives"


    // $ANTLR start "rule__StoreElements__Alternatives"
    // InternalGrocery.g:803:1: rule__StoreElements__Alternatives : ( ( ruleBackroom ) | ( ruleShelf ) );
    public final void rule__StoreElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:807:1: ( ( ruleBackroom ) | ( ruleShelf ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:808:2: ( ruleBackroom )
                    {
                    // InternalGrocery.g:808:2: ( ruleBackroom )
                    // InternalGrocery.g:809:3: ruleBackroom
                    {
                     before(grammarAccess.getStoreElementsAccess().getBackroomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBackroom();

                    state._fsp--;

                     after(grammarAccess.getStoreElementsAccess().getBackroomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:814:2: ( ruleShelf )
                    {
                    // InternalGrocery.g:814:2: ( ruleShelf )
                    // InternalGrocery.g:815:3: ruleShelf
                    {
                     before(grammarAccess.getStoreElementsAccess().getShelfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShelf();

                    state._fsp--;

                     after(grammarAccess.getStoreElementsAccess().getShelfParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElements__Alternatives"


    // $ANTLR start "rule__MovementElement__Alternatives"
    // InternalGrocery.g:824:1: rule__MovementElement__Alternatives : ( ( rulePerson ) | ( ruleVehicle ) | ( ruleSupplier ) );
    public final void rule__MovementElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:828:1: ( ( rulePerson ) | ( ruleVehicle ) | ( ruleSupplier ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 30:
            case 32:
            case 33:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGrocery.g:829:2: ( rulePerson )
                    {
                    // InternalGrocery.g:829:2: ( rulePerson )
                    // InternalGrocery.g:830:3: rulePerson
                    {
                     before(grammarAccess.getMovementElementAccess().getPersonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePerson();

                    state._fsp--;

                     after(grammarAccess.getMovementElementAccess().getPersonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:835:2: ( ruleVehicle )
                    {
                    // InternalGrocery.g:835:2: ( ruleVehicle )
                    // InternalGrocery.g:836:3: ruleVehicle
                    {
                     before(grammarAccess.getMovementElementAccess().getVehicleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVehicle();

                    state._fsp--;

                     after(grammarAccess.getMovementElementAccess().getVehicleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:841:2: ( ruleSupplier )
                    {
                    // InternalGrocery.g:841:2: ( ruleSupplier )
                    // InternalGrocery.g:842:3: ruleSupplier
                    {
                     before(grammarAccess.getMovementElementAccess().getSupplierParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSupplier();

                    state._fsp--;

                     after(grammarAccess.getMovementElementAccess().getSupplierParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovementElement__Alternatives"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalGrocery.g:851:1: rule__Person__Alternatives : ( ( ruleDriver ) | ( ruleEmployee ) | ( ruleCustomer ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:855:1: ( ( ruleDriver ) | ( ruleEmployee ) | ( ruleCustomer ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGrocery.g:856:2: ( ruleDriver )
                    {
                    // InternalGrocery.g:856:2: ( ruleDriver )
                    // InternalGrocery.g:857:3: ruleDriver
                    {
                     before(grammarAccess.getPersonAccess().getDriverParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDriver();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getDriverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:862:2: ( ruleEmployee )
                    {
                    // InternalGrocery.g:862:2: ( ruleEmployee )
                    // InternalGrocery.g:863:3: ruleEmployee
                    {
                     before(grammarAccess.getPersonAccess().getEmployeeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmployee();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getEmployeeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:868:2: ( ruleCustomer )
                    {
                    // InternalGrocery.g:868:2: ( ruleCustomer )
                    // InternalGrocery.g:869:3: ruleCustomer
                    {
                     before(grammarAccess.getPersonAccess().getCustomerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomer();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getCustomerParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__Item__Alternatives"
    // InternalGrocery.g:878:1: rule__Item__Alternatives : ( ( ruleFoodItem ) | ( ruleNonFoodItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:882:1: ( ( ruleFoodItem ) | ( ruleNonFoodItem ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23||LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGrocery.g:883:2: ( ruleFoodItem )
                    {
                    // InternalGrocery.g:883:2: ( ruleFoodItem )
                    // InternalGrocery.g:884:3: ruleFoodItem
                    {
                     before(grammarAccess.getItemAccess().getFoodItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFoodItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getFoodItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:889:2: ( ruleNonFoodItem )
                    {
                    // InternalGrocery.g:889:2: ( ruleNonFoodItem )
                    // InternalGrocery.g:890:3: ruleNonFoodItem
                    {
                     before(grammarAccess.getItemAccess().getNonFoodItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonFoodItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getNonFoodItemParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__FoodItem__Alternatives"
    // InternalGrocery.g:899:1: rule__FoodItem__Alternatives : ( ( rulePerishableItem ) | ( ruleProduce ) );
    public final void rule__FoodItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:903:1: ( ( rulePerishableItem ) | ( ruleProduce ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGrocery.g:904:2: ( rulePerishableItem )
                    {
                    // InternalGrocery.g:904:2: ( rulePerishableItem )
                    // InternalGrocery.g:905:3: rulePerishableItem
                    {
                     before(grammarAccess.getFoodItemAccess().getPerishableItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePerishableItem();

                    state._fsp--;

                     after(grammarAccess.getFoodItemAccess().getPerishableItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:910:2: ( ruleProduce )
                    {
                    // InternalGrocery.g:910:2: ( ruleProduce )
                    // InternalGrocery.g:911:3: ruleProduce
                    {
                     before(grammarAccess.getFoodItemAccess().getProduceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProduce();

                    state._fsp--;

                     after(grammarAccess.getFoodItemAccess().getProduceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodItem__Alternatives"


    // $ANTLR start "rule__Movement__Alternatives"
    // InternalGrocery.g:920:1: rule__Movement__Alternatives : ( ( ruleDelivery ) | ( ruleSale ) | ( ruleStockMovement ) );
    public final void rule__Movement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:924:1: ( ( ruleDelivery ) | ( ruleSale ) | ( ruleStockMovement ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGrocery.g:925:2: ( ruleDelivery )
                    {
                    // InternalGrocery.g:925:2: ( ruleDelivery )
                    // InternalGrocery.g:926:3: ruleDelivery
                    {
                     before(grammarAccess.getMovementAccess().getDeliveryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDelivery();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getDeliveryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:931:2: ( ruleSale )
                    {
                    // InternalGrocery.g:931:2: ( ruleSale )
                    // InternalGrocery.g:932:3: ruleSale
                    {
                     before(grammarAccess.getMovementAccess().getSaleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSale();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getSaleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:937:2: ( ruleStockMovement )
                    {
                    // InternalGrocery.g:937:2: ( ruleStockMovement )
                    // InternalGrocery.g:938:3: ruleStockMovement
                    {
                     before(grammarAccess.getMovementAccess().getStockMovementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStockMovement();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getStockMovementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movement__Alternatives"


    // $ANTLR start "rule__QualityLevel__Alternatives"
    // InternalGrocery.g:947:1: rule__QualityLevel__Alternatives : ( ( ( 'good' ) ) | ( ( 'okay' ) ) | ( ( 'needs removal' ) ) );
    public final void rule__QualityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:951:1: ( ( ( 'good' ) ) | ( ( 'okay' ) ) | ( ( 'needs removal' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGrocery.g:952:2: ( ( 'good' ) )
                    {
                    // InternalGrocery.g:952:2: ( ( 'good' ) )
                    // InternalGrocery.g:953:3: ( 'good' )
                    {
                     before(grammarAccess.getQualityLevelAccess().getGOODEnumLiteralDeclaration_0()); 
                    // InternalGrocery.g:954:3: ( 'good' )
                    // InternalGrocery.g:954:4: 'good'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualityLevelAccess().getGOODEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:958:2: ( ( 'okay' ) )
                    {
                    // InternalGrocery.g:958:2: ( ( 'okay' ) )
                    // InternalGrocery.g:959:3: ( 'okay' )
                    {
                     before(grammarAccess.getQualityLevelAccess().getMEDIOCREEnumLiteralDeclaration_1()); 
                    // InternalGrocery.g:960:3: ( 'okay' )
                    // InternalGrocery.g:960:4: 'okay'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualityLevelAccess().getMEDIOCREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:964:2: ( ( 'needs removal' ) )
                    {
                    // InternalGrocery.g:964:2: ( ( 'needs removal' ) )
                    // InternalGrocery.g:965:3: ( 'needs removal' )
                    {
                     before(grammarAccess.getQualityLevelAccess().getNEEDSREMOVALEnumLiteralDeclaration_2()); 
                    // InternalGrocery.g:966:3: ( 'needs removal' )
                    // InternalGrocery.g:966:4: 'needs removal'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualityLevelAccess().getNEEDSREMOVALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityLevel__Alternatives"


    // $ANTLR start "rule__Store__Group__0"
    // InternalGrocery.g:974:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:978:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalGrocery.g:979:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalGrocery.g:986:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:990:1: ( ( 'store' ) )
            // InternalGrocery.g:991:1: ( 'store' )
            {
            // InternalGrocery.g:991:1: ( 'store' )
            // InternalGrocery.g:992:2: 'store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalGrocery.g:1001:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1005:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalGrocery.g:1006:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalGrocery.g:1013:1: rule__Store__Group__1__Impl : ( ( rule__Store__NameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1017:1: ( ( ( rule__Store__NameAssignment_1 ) ) )
            // InternalGrocery.g:1018:1: ( ( rule__Store__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1018:1: ( ( rule__Store__NameAssignment_1 ) )
            // InternalGrocery.g:1019:2: ( rule__Store__NameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1020:2: ( rule__Store__NameAssignment_1 )
            // InternalGrocery.g:1020:3: rule__Store__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalGrocery.g:1028:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1032:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalGrocery.g:1033:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Store__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalGrocery.g:1040:1: rule__Store__Group__2__Impl : ( '{' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1044:1: ( ( '{' ) )
            // InternalGrocery.g:1045:1: ( '{' )
            {
            // InternalGrocery.g:1045:1: ( '{' )
            // InternalGrocery.g:1046:2: '{'
            {
             before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__3"
    // InternalGrocery.g:1055:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1059:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalGrocery.g:1060:2: rule__Store__Group__3__Impl rule__Store__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Store__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3"


    // $ANTLR start "rule__Store__Group__3__Impl"
    // InternalGrocery.g:1067:1: rule__Store__Group__3__Impl : ( ( rule__Store__ElementsAssignment_3 )* ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1071:1: ( ( ( rule__Store__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:1072:1: ( ( rule__Store__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:1072:1: ( ( rule__Store__ElementsAssignment_3 )* )
            // InternalGrocery.g:1073:2: ( rule__Store__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:1074:2: ( rule__Store__ElementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrocery.g:1074:3: rule__Store__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Store__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStoreAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3__Impl"


    // $ANTLR start "rule__Store__Group__4"
    // InternalGrocery.g:1082:1: rule__Store__Group__4 : rule__Store__Group__4__Impl ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1086:1: ( rule__Store__Group__4__Impl )
            // InternalGrocery.g:1087:2: rule__Store__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4"


    // $ANTLR start "rule__Store__Group__4__Impl"
    // InternalGrocery.g:1093:1: rule__Store__Group__4__Impl : ( '}' ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1097:1: ( ( '}' ) )
            // InternalGrocery.g:1098:1: ( '}' )
            {
            // InternalGrocery.g:1098:1: ( '}' )
            // InternalGrocery.g:1099:2: '}'
            {
             before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4__Impl"


    // $ANTLR start "rule__Warehouse__Group__0"
    // InternalGrocery.g:1109:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1113:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalGrocery.g:1114:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Warehouse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__0"


    // $ANTLR start "rule__Warehouse__Group__0__Impl"
    // InternalGrocery.g:1121:1: rule__Warehouse__Group__0__Impl : ( 'warehouse' ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1125:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:1126:1: ( 'warehouse' )
            {
            // InternalGrocery.g:1126:1: ( 'warehouse' )
            // InternalGrocery.g:1127:2: 'warehouse'
            {
             before(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__0__Impl"


    // $ANTLR start "rule__Warehouse__Group__1"
    // InternalGrocery.g:1136:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1140:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalGrocery.g:1141:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Warehouse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__1"


    // $ANTLR start "rule__Warehouse__Group__1__Impl"
    // InternalGrocery.g:1148:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__NameAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1152:1: ( ( ( rule__Warehouse__NameAssignment_1 ) ) )
            // InternalGrocery.g:1153:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1153:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            // InternalGrocery.g:1154:2: ( rule__Warehouse__NameAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1155:2: ( rule__Warehouse__NameAssignment_1 )
            // InternalGrocery.g:1155:3: rule__Warehouse__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__1__Impl"


    // $ANTLR start "rule__Warehouse__Group__2"
    // InternalGrocery.g:1163:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1167:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalGrocery.g:1168:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Warehouse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__2"


    // $ANTLR start "rule__Warehouse__Group__2__Impl"
    // InternalGrocery.g:1175:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1179:1: ( ( '{' ) )
            // InternalGrocery.g:1180:1: ( '{' )
            {
            // InternalGrocery.g:1180:1: ( '{' )
            // InternalGrocery.g:1181:2: '{'
            {
             before(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__2__Impl"


    // $ANTLR start "rule__Warehouse__Group__3"
    // InternalGrocery.g:1190:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1194:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalGrocery.g:1195:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Warehouse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__3"


    // $ANTLR start "rule__Warehouse__Group__3__Impl"
    // InternalGrocery.g:1202:1: rule__Warehouse__Group__3__Impl : ( 'address' ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1206:1: ( ( 'address' ) )
            // InternalGrocery.g:1207:1: ( 'address' )
            {
            // InternalGrocery.g:1207:1: ( 'address' )
            // InternalGrocery.g:1208:2: 'address'
            {
             before(grammarAccess.getWarehouseAccess().getAddressKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getAddressKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__3__Impl"


    // $ANTLR start "rule__Warehouse__Group__4"
    // InternalGrocery.g:1217:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1221:1: ( rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 )
            // InternalGrocery.g:1222:2: rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Warehouse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__4"


    // $ANTLR start "rule__Warehouse__Group__4__Impl"
    // InternalGrocery.g:1229:1: rule__Warehouse__Group__4__Impl : ( ':' ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1233:1: ( ( ':' ) )
            // InternalGrocery.g:1234:1: ( ':' )
            {
            // InternalGrocery.g:1234:1: ( ':' )
            // InternalGrocery.g:1235:2: ':'
            {
             before(grammarAccess.getWarehouseAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__4__Impl"


    // $ANTLR start "rule__Warehouse__Group__5"
    // InternalGrocery.g:1244:1: rule__Warehouse__Group__5 : rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 ;
    public final void rule__Warehouse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1248:1: ( rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 )
            // InternalGrocery.g:1249:2: rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Warehouse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__5"


    // $ANTLR start "rule__Warehouse__Group__5__Impl"
    // InternalGrocery.g:1256:1: rule__Warehouse__Group__5__Impl : ( ( rule__Warehouse__AddressAssignment_5 ) ) ;
    public final void rule__Warehouse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1260:1: ( ( ( rule__Warehouse__AddressAssignment_5 ) ) )
            // InternalGrocery.g:1261:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            {
            // InternalGrocery.g:1261:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            // InternalGrocery.g:1262:2: ( rule__Warehouse__AddressAssignment_5 )
            {
             before(grammarAccess.getWarehouseAccess().getAddressAssignment_5()); 
            // InternalGrocery.g:1263:2: ( rule__Warehouse__AddressAssignment_5 )
            // InternalGrocery.g:1263:3: rule__Warehouse__AddressAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__AddressAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getAddressAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__5__Impl"


    // $ANTLR start "rule__Warehouse__Group__6"
    // InternalGrocery.g:1271:1: rule__Warehouse__Group__6 : rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 ;
    public final void rule__Warehouse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1275:1: ( rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 )
            // InternalGrocery.g:1276:2: rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Warehouse__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__6"


    // $ANTLR start "rule__Warehouse__Group__6__Impl"
    // InternalGrocery.g:1283:1: rule__Warehouse__Group__6__Impl : ( 'supplier' ) ;
    public final void rule__Warehouse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1287:1: ( ( 'supplier' ) )
            // InternalGrocery.g:1288:1: ( 'supplier' )
            {
            // InternalGrocery.g:1288:1: ( 'supplier' )
            // InternalGrocery.g:1289:2: 'supplier'
            {
             before(grammarAccess.getWarehouseAccess().getSupplierKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getSupplierKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__6__Impl"


    // $ANTLR start "rule__Warehouse__Group__7"
    // InternalGrocery.g:1298:1: rule__Warehouse__Group__7 : rule__Warehouse__Group__7__Impl rule__Warehouse__Group__8 ;
    public final void rule__Warehouse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1302:1: ( rule__Warehouse__Group__7__Impl rule__Warehouse__Group__8 )
            // InternalGrocery.g:1303:2: rule__Warehouse__Group__7__Impl rule__Warehouse__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Warehouse__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__7"


    // $ANTLR start "rule__Warehouse__Group__7__Impl"
    // InternalGrocery.g:1310:1: rule__Warehouse__Group__7__Impl : ( ':' ) ;
    public final void rule__Warehouse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1314:1: ( ( ':' ) )
            // InternalGrocery.g:1315:1: ( ':' )
            {
            // InternalGrocery.g:1315:1: ( ':' )
            // InternalGrocery.g:1316:2: ':'
            {
             before(grammarAccess.getWarehouseAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__7__Impl"


    // $ANTLR start "rule__Warehouse__Group__8"
    // InternalGrocery.g:1325:1: rule__Warehouse__Group__8 : rule__Warehouse__Group__8__Impl rule__Warehouse__Group__9 ;
    public final void rule__Warehouse__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1329:1: ( rule__Warehouse__Group__8__Impl rule__Warehouse__Group__9 )
            // InternalGrocery.g:1330:2: rule__Warehouse__Group__8__Impl rule__Warehouse__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Warehouse__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__8"


    // $ANTLR start "rule__Warehouse__Group__8__Impl"
    // InternalGrocery.g:1337:1: rule__Warehouse__Group__8__Impl : ( ( rule__Warehouse__SupplierAssignment_8 ) ) ;
    public final void rule__Warehouse__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1341:1: ( ( ( rule__Warehouse__SupplierAssignment_8 ) ) )
            // InternalGrocery.g:1342:1: ( ( rule__Warehouse__SupplierAssignment_8 ) )
            {
            // InternalGrocery.g:1342:1: ( ( rule__Warehouse__SupplierAssignment_8 ) )
            // InternalGrocery.g:1343:2: ( rule__Warehouse__SupplierAssignment_8 )
            {
             before(grammarAccess.getWarehouseAccess().getSupplierAssignment_8()); 
            // InternalGrocery.g:1344:2: ( rule__Warehouse__SupplierAssignment_8 )
            // InternalGrocery.g:1344:3: rule__Warehouse__SupplierAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__SupplierAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getSupplierAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__8__Impl"


    // $ANTLR start "rule__Warehouse__Group__9"
    // InternalGrocery.g:1352:1: rule__Warehouse__Group__9 : rule__Warehouse__Group__9__Impl ;
    public final void rule__Warehouse__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1356:1: ( rule__Warehouse__Group__9__Impl )
            // InternalGrocery.g:1357:2: rule__Warehouse__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__9"


    // $ANTLR start "rule__Warehouse__Group__9__Impl"
    // InternalGrocery.g:1363:1: rule__Warehouse__Group__9__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1367:1: ( ( '}' ) )
            // InternalGrocery.g:1368:1: ( '}' )
            {
            // InternalGrocery.g:1368:1: ( '}' )
            // InternalGrocery.g:1369:2: '}'
            {
             before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__9__Impl"


    // $ANTLR start "rule__Shelf__Group__0"
    // InternalGrocery.g:1379:1: rule__Shelf__Group__0 : rule__Shelf__Group__0__Impl rule__Shelf__Group__1 ;
    public final void rule__Shelf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1383:1: ( rule__Shelf__Group__0__Impl rule__Shelf__Group__1 )
            // InternalGrocery.g:1384:2: rule__Shelf__Group__0__Impl rule__Shelf__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Shelf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__0"


    // $ANTLR start "rule__Shelf__Group__0__Impl"
    // InternalGrocery.g:1391:1: rule__Shelf__Group__0__Impl : ( 'shelf' ) ;
    public final void rule__Shelf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1395:1: ( ( 'shelf' ) )
            // InternalGrocery.g:1396:1: ( 'shelf' )
            {
            // InternalGrocery.g:1396:1: ( 'shelf' )
            // InternalGrocery.g:1397:2: 'shelf'
            {
             before(grammarAccess.getShelfAccess().getShelfKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getShelfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__0__Impl"


    // $ANTLR start "rule__Shelf__Group__1"
    // InternalGrocery.g:1406:1: rule__Shelf__Group__1 : rule__Shelf__Group__1__Impl rule__Shelf__Group__2 ;
    public final void rule__Shelf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1410:1: ( rule__Shelf__Group__1__Impl rule__Shelf__Group__2 )
            // InternalGrocery.g:1411:2: rule__Shelf__Group__1__Impl rule__Shelf__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Shelf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__1"


    // $ANTLR start "rule__Shelf__Group__1__Impl"
    // InternalGrocery.g:1418:1: rule__Shelf__Group__1__Impl : ( ( rule__Shelf__NameAssignment_1 ) ) ;
    public final void rule__Shelf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1422:1: ( ( ( rule__Shelf__NameAssignment_1 ) ) )
            // InternalGrocery.g:1423:1: ( ( rule__Shelf__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1423:1: ( ( rule__Shelf__NameAssignment_1 ) )
            // InternalGrocery.g:1424:2: ( rule__Shelf__NameAssignment_1 )
            {
             before(grammarAccess.getShelfAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1425:2: ( rule__Shelf__NameAssignment_1 )
            // InternalGrocery.g:1425:3: rule__Shelf__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShelfAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__1__Impl"


    // $ANTLR start "rule__Shelf__Group__2"
    // InternalGrocery.g:1433:1: rule__Shelf__Group__2 : rule__Shelf__Group__2__Impl rule__Shelf__Group__3 ;
    public final void rule__Shelf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1437:1: ( rule__Shelf__Group__2__Impl rule__Shelf__Group__3 )
            // InternalGrocery.g:1438:2: rule__Shelf__Group__2__Impl rule__Shelf__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Shelf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__2"


    // $ANTLR start "rule__Shelf__Group__2__Impl"
    // InternalGrocery.g:1445:1: rule__Shelf__Group__2__Impl : ( '{' ) ;
    public final void rule__Shelf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1449:1: ( ( '{' ) )
            // InternalGrocery.g:1450:1: ( '{' )
            {
            // InternalGrocery.g:1450:1: ( '{' )
            // InternalGrocery.g:1451:2: '{'
            {
             before(grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__2__Impl"


    // $ANTLR start "rule__Shelf__Group__3"
    // InternalGrocery.g:1460:1: rule__Shelf__Group__3 : rule__Shelf__Group__3__Impl rule__Shelf__Group__4 ;
    public final void rule__Shelf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1464:1: ( rule__Shelf__Group__3__Impl rule__Shelf__Group__4 )
            // InternalGrocery.g:1465:2: rule__Shelf__Group__3__Impl rule__Shelf__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Shelf__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__3"


    // $ANTLR start "rule__Shelf__Group__3__Impl"
    // InternalGrocery.g:1472:1: rule__Shelf__Group__3__Impl : ( ( rule__Shelf__ItemsAssignment_3 )* ) ;
    public final void rule__Shelf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1476:1: ( ( ( rule__Shelf__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:1477:1: ( ( rule__Shelf__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:1477:1: ( ( rule__Shelf__ItemsAssignment_3 )* )
            // InternalGrocery.g:1478:2: ( rule__Shelf__ItemsAssignment_3 )*
            {
             before(grammarAccess.getShelfAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:1479:2: ( rule__Shelf__ItemsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGrocery.g:1479:3: rule__Shelf__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Shelf__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getShelfAccess().getItemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__3__Impl"


    // $ANTLR start "rule__Shelf__Group__4"
    // InternalGrocery.g:1487:1: rule__Shelf__Group__4 : rule__Shelf__Group__4__Impl ;
    public final void rule__Shelf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1491:1: ( rule__Shelf__Group__4__Impl )
            // InternalGrocery.g:1492:2: rule__Shelf__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__4"


    // $ANTLR start "rule__Shelf__Group__4__Impl"
    // InternalGrocery.g:1498:1: rule__Shelf__Group__4__Impl : ( '}' ) ;
    public final void rule__Shelf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1502:1: ( ( '}' ) )
            // InternalGrocery.g:1503:1: ( '}' )
            {
            // InternalGrocery.g:1503:1: ( '}' )
            // InternalGrocery.g:1504:2: '}'
            {
             before(grammarAccess.getShelfAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__4__Impl"


    // $ANTLR start "rule__Backroom__Group__0"
    // InternalGrocery.g:1514:1: rule__Backroom__Group__0 : rule__Backroom__Group__0__Impl rule__Backroom__Group__1 ;
    public final void rule__Backroom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1518:1: ( rule__Backroom__Group__0__Impl rule__Backroom__Group__1 )
            // InternalGrocery.g:1519:2: rule__Backroom__Group__0__Impl rule__Backroom__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Backroom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__0"


    // $ANTLR start "rule__Backroom__Group__0__Impl"
    // InternalGrocery.g:1526:1: rule__Backroom__Group__0__Impl : ( 'backroom' ) ;
    public final void rule__Backroom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1530:1: ( ( 'backroom' ) )
            // InternalGrocery.g:1531:1: ( 'backroom' )
            {
            // InternalGrocery.g:1531:1: ( 'backroom' )
            // InternalGrocery.g:1532:2: 'backroom'
            {
             before(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__0__Impl"


    // $ANTLR start "rule__Backroom__Group__1"
    // InternalGrocery.g:1541:1: rule__Backroom__Group__1 : rule__Backroom__Group__1__Impl rule__Backroom__Group__2 ;
    public final void rule__Backroom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1545:1: ( rule__Backroom__Group__1__Impl rule__Backroom__Group__2 )
            // InternalGrocery.g:1546:2: rule__Backroom__Group__1__Impl rule__Backroom__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Backroom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__1"


    // $ANTLR start "rule__Backroom__Group__1__Impl"
    // InternalGrocery.g:1553:1: rule__Backroom__Group__1__Impl : ( ( rule__Backroom__NameAssignment_1 ) ) ;
    public final void rule__Backroom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1557:1: ( ( ( rule__Backroom__NameAssignment_1 ) ) )
            // InternalGrocery.g:1558:1: ( ( rule__Backroom__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1558:1: ( ( rule__Backroom__NameAssignment_1 ) )
            // InternalGrocery.g:1559:2: ( rule__Backroom__NameAssignment_1 )
            {
             before(grammarAccess.getBackroomAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1560:2: ( rule__Backroom__NameAssignment_1 )
            // InternalGrocery.g:1560:3: rule__Backroom__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackroomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__1__Impl"


    // $ANTLR start "rule__Backroom__Group__2"
    // InternalGrocery.g:1568:1: rule__Backroom__Group__2 : rule__Backroom__Group__2__Impl rule__Backroom__Group__3 ;
    public final void rule__Backroom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1572:1: ( rule__Backroom__Group__2__Impl rule__Backroom__Group__3 )
            // InternalGrocery.g:1573:2: rule__Backroom__Group__2__Impl rule__Backroom__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Backroom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__2"


    // $ANTLR start "rule__Backroom__Group__2__Impl"
    // InternalGrocery.g:1580:1: rule__Backroom__Group__2__Impl : ( '{' ) ;
    public final void rule__Backroom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1584:1: ( ( '{' ) )
            // InternalGrocery.g:1585:1: ( '{' )
            {
            // InternalGrocery.g:1585:1: ( '{' )
            // InternalGrocery.g:1586:2: '{'
            {
             before(grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__2__Impl"


    // $ANTLR start "rule__Backroom__Group__3"
    // InternalGrocery.g:1595:1: rule__Backroom__Group__3 : rule__Backroom__Group__3__Impl rule__Backroom__Group__4 ;
    public final void rule__Backroom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1599:1: ( rule__Backroom__Group__3__Impl rule__Backroom__Group__4 )
            // InternalGrocery.g:1600:2: rule__Backroom__Group__3__Impl rule__Backroom__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Backroom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__3"


    // $ANTLR start "rule__Backroom__Group__3__Impl"
    // InternalGrocery.g:1607:1: rule__Backroom__Group__3__Impl : ( ( rule__Backroom__ItemsAssignment_3 )* ) ;
    public final void rule__Backroom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1611:1: ( ( ( rule__Backroom__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:1612:1: ( ( rule__Backroom__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:1612:1: ( ( rule__Backroom__ItemsAssignment_3 )* )
            // InternalGrocery.g:1613:2: ( rule__Backroom__ItemsAssignment_3 )*
            {
             before(grammarAccess.getBackroomAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:1614:2: ( rule__Backroom__ItemsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGrocery.g:1614:3: rule__Backroom__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Backroom__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBackroomAccess().getItemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__3__Impl"


    // $ANTLR start "rule__Backroom__Group__4"
    // InternalGrocery.g:1622:1: rule__Backroom__Group__4 : rule__Backroom__Group__4__Impl ;
    public final void rule__Backroom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1626:1: ( rule__Backroom__Group__4__Impl )
            // InternalGrocery.g:1627:2: rule__Backroom__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__4"


    // $ANTLR start "rule__Backroom__Group__4__Impl"
    // InternalGrocery.g:1633:1: rule__Backroom__Group__4__Impl : ( '}' ) ;
    public final void rule__Backroom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1637:1: ( ( '}' ) )
            // InternalGrocery.g:1638:1: ( '}' )
            {
            // InternalGrocery.g:1638:1: ( '}' )
            // InternalGrocery.g:1639:2: '}'
            {
             before(grammarAccess.getBackroomAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__4__Impl"


    // $ANTLR start "rule__Produce__Group__0"
    // InternalGrocery.g:1649:1: rule__Produce__Group__0 : rule__Produce__Group__0__Impl rule__Produce__Group__1 ;
    public final void rule__Produce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1653:1: ( rule__Produce__Group__0__Impl rule__Produce__Group__1 )
            // InternalGrocery.g:1654:2: rule__Produce__Group__0__Impl rule__Produce__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Produce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__0"


    // $ANTLR start "rule__Produce__Group__0__Impl"
    // InternalGrocery.g:1661:1: rule__Produce__Group__0__Impl : ( 'produce' ) ;
    public final void rule__Produce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1665:1: ( ( 'produce' ) )
            // InternalGrocery.g:1666:1: ( 'produce' )
            {
            // InternalGrocery.g:1666:1: ( 'produce' )
            // InternalGrocery.g:1667:2: 'produce'
            {
             before(grammarAccess.getProduceAccess().getProduceKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getProduceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__0__Impl"


    // $ANTLR start "rule__Produce__Group__1"
    // InternalGrocery.g:1676:1: rule__Produce__Group__1 : rule__Produce__Group__1__Impl rule__Produce__Group__2 ;
    public final void rule__Produce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1680:1: ( rule__Produce__Group__1__Impl rule__Produce__Group__2 )
            // InternalGrocery.g:1681:2: rule__Produce__Group__1__Impl rule__Produce__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Produce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__1"


    // $ANTLR start "rule__Produce__Group__1__Impl"
    // InternalGrocery.g:1688:1: rule__Produce__Group__1__Impl : ( ( rule__Produce__NameAssignment_1 ) ) ;
    public final void rule__Produce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1692:1: ( ( ( rule__Produce__NameAssignment_1 ) ) )
            // InternalGrocery.g:1693:1: ( ( rule__Produce__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1693:1: ( ( rule__Produce__NameAssignment_1 ) )
            // InternalGrocery.g:1694:2: ( rule__Produce__NameAssignment_1 )
            {
             before(grammarAccess.getProduceAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1695:2: ( rule__Produce__NameAssignment_1 )
            // InternalGrocery.g:1695:3: rule__Produce__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Produce__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProduceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__1__Impl"


    // $ANTLR start "rule__Produce__Group__2"
    // InternalGrocery.g:1703:1: rule__Produce__Group__2 : rule__Produce__Group__2__Impl rule__Produce__Group__3 ;
    public final void rule__Produce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1707:1: ( rule__Produce__Group__2__Impl rule__Produce__Group__3 )
            // InternalGrocery.g:1708:2: rule__Produce__Group__2__Impl rule__Produce__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Produce__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__2"


    // $ANTLR start "rule__Produce__Group__2__Impl"
    // InternalGrocery.g:1715:1: rule__Produce__Group__2__Impl : ( '{' ) ;
    public final void rule__Produce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1719:1: ( ( '{' ) )
            // InternalGrocery.g:1720:1: ( '{' )
            {
            // InternalGrocery.g:1720:1: ( '{' )
            // InternalGrocery.g:1721:2: '{'
            {
             before(grammarAccess.getProduceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__2__Impl"


    // $ANTLR start "rule__Produce__Group__3"
    // InternalGrocery.g:1730:1: rule__Produce__Group__3 : rule__Produce__Group__3__Impl rule__Produce__Group__4 ;
    public final void rule__Produce__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1734:1: ( rule__Produce__Group__3__Impl rule__Produce__Group__4 )
            // InternalGrocery.g:1735:2: rule__Produce__Group__3__Impl rule__Produce__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Produce__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__3"


    // $ANTLR start "rule__Produce__Group__3__Impl"
    // InternalGrocery.g:1742:1: rule__Produce__Group__3__Impl : ( 'price' ) ;
    public final void rule__Produce__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1746:1: ( ( 'price' ) )
            // InternalGrocery.g:1747:1: ( 'price' )
            {
            // InternalGrocery.g:1747:1: ( 'price' )
            // InternalGrocery.g:1748:2: 'price'
            {
             before(grammarAccess.getProduceAccess().getPriceKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getPriceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__3__Impl"


    // $ANTLR start "rule__Produce__Group__4"
    // InternalGrocery.g:1757:1: rule__Produce__Group__4 : rule__Produce__Group__4__Impl rule__Produce__Group__5 ;
    public final void rule__Produce__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1761:1: ( rule__Produce__Group__4__Impl rule__Produce__Group__5 )
            // InternalGrocery.g:1762:2: rule__Produce__Group__4__Impl rule__Produce__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Produce__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__4"


    // $ANTLR start "rule__Produce__Group__4__Impl"
    // InternalGrocery.g:1769:1: rule__Produce__Group__4__Impl : ( ':' ) ;
    public final void rule__Produce__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1773:1: ( ( ':' ) )
            // InternalGrocery.g:1774:1: ( ':' )
            {
            // InternalGrocery.g:1774:1: ( ':' )
            // InternalGrocery.g:1775:2: ':'
            {
             before(grammarAccess.getProduceAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__4__Impl"


    // $ANTLR start "rule__Produce__Group__5"
    // InternalGrocery.g:1784:1: rule__Produce__Group__5 : rule__Produce__Group__5__Impl rule__Produce__Group__6 ;
    public final void rule__Produce__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1788:1: ( rule__Produce__Group__5__Impl rule__Produce__Group__6 )
            // InternalGrocery.g:1789:2: rule__Produce__Group__5__Impl rule__Produce__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Produce__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__5"


    // $ANTLR start "rule__Produce__Group__5__Impl"
    // InternalGrocery.g:1796:1: rule__Produce__Group__5__Impl : ( ( rule__Produce__PriceAssignment_5 ) ) ;
    public final void rule__Produce__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1800:1: ( ( ( rule__Produce__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1801:1: ( ( rule__Produce__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1801:1: ( ( rule__Produce__PriceAssignment_5 ) )
            // InternalGrocery.g:1802:2: ( rule__Produce__PriceAssignment_5 )
            {
             before(grammarAccess.getProduceAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1803:2: ( rule__Produce__PriceAssignment_5 )
            // InternalGrocery.g:1803:3: rule__Produce__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Produce__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProduceAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__5__Impl"


    // $ANTLR start "rule__Produce__Group__6"
    // InternalGrocery.g:1811:1: rule__Produce__Group__6 : rule__Produce__Group__6__Impl rule__Produce__Group__7 ;
    public final void rule__Produce__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1815:1: ( rule__Produce__Group__6__Impl rule__Produce__Group__7 )
            // InternalGrocery.g:1816:2: rule__Produce__Group__6__Impl rule__Produce__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Produce__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__6"


    // $ANTLR start "rule__Produce__Group__6__Impl"
    // InternalGrocery.g:1823:1: rule__Produce__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__Produce__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1827:1: ( ( 'quantity' ) )
            // InternalGrocery.g:1828:1: ( 'quantity' )
            {
            // InternalGrocery.g:1828:1: ( 'quantity' )
            // InternalGrocery.g:1829:2: 'quantity'
            {
             before(grammarAccess.getProduceAccess().getQuantityKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getQuantityKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__6__Impl"


    // $ANTLR start "rule__Produce__Group__7"
    // InternalGrocery.g:1838:1: rule__Produce__Group__7 : rule__Produce__Group__7__Impl rule__Produce__Group__8 ;
    public final void rule__Produce__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1842:1: ( rule__Produce__Group__7__Impl rule__Produce__Group__8 )
            // InternalGrocery.g:1843:2: rule__Produce__Group__7__Impl rule__Produce__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Produce__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__7"


    // $ANTLR start "rule__Produce__Group__7__Impl"
    // InternalGrocery.g:1850:1: rule__Produce__Group__7__Impl : ( ':' ) ;
    public final void rule__Produce__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1854:1: ( ( ':' ) )
            // InternalGrocery.g:1855:1: ( ':' )
            {
            // InternalGrocery.g:1855:1: ( ':' )
            // InternalGrocery.g:1856:2: ':'
            {
             before(grammarAccess.getProduceAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__7__Impl"


    // $ANTLR start "rule__Produce__Group__8"
    // InternalGrocery.g:1865:1: rule__Produce__Group__8 : rule__Produce__Group__8__Impl rule__Produce__Group__9 ;
    public final void rule__Produce__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1869:1: ( rule__Produce__Group__8__Impl rule__Produce__Group__9 )
            // InternalGrocery.g:1870:2: rule__Produce__Group__8__Impl rule__Produce__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Produce__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__8"


    // $ANTLR start "rule__Produce__Group__8__Impl"
    // InternalGrocery.g:1877:1: rule__Produce__Group__8__Impl : ( ( rule__Produce__QuantityAssignment_8 ) ) ;
    public final void rule__Produce__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1881:1: ( ( ( rule__Produce__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:1882:1: ( ( rule__Produce__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:1882:1: ( ( rule__Produce__QuantityAssignment_8 ) )
            // InternalGrocery.g:1883:2: ( rule__Produce__QuantityAssignment_8 )
            {
             before(grammarAccess.getProduceAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:1884:2: ( rule__Produce__QuantityAssignment_8 )
            // InternalGrocery.g:1884:3: rule__Produce__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Produce__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProduceAccess().getQuantityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__8__Impl"


    // $ANTLR start "rule__Produce__Group__9"
    // InternalGrocery.g:1892:1: rule__Produce__Group__9 : rule__Produce__Group__9__Impl rule__Produce__Group__10 ;
    public final void rule__Produce__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1896:1: ( rule__Produce__Group__9__Impl rule__Produce__Group__10 )
            // InternalGrocery.g:1897:2: rule__Produce__Group__9__Impl rule__Produce__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Produce__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__9"


    // $ANTLR start "rule__Produce__Group__9__Impl"
    // InternalGrocery.g:1904:1: rule__Produce__Group__9__Impl : ( 'quality' ) ;
    public final void rule__Produce__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1908:1: ( ( 'quality' ) )
            // InternalGrocery.g:1909:1: ( 'quality' )
            {
            // InternalGrocery.g:1909:1: ( 'quality' )
            // InternalGrocery.g:1910:2: 'quality'
            {
             before(grammarAccess.getProduceAccess().getQualityKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getQualityKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__9__Impl"


    // $ANTLR start "rule__Produce__Group__10"
    // InternalGrocery.g:1919:1: rule__Produce__Group__10 : rule__Produce__Group__10__Impl rule__Produce__Group__11 ;
    public final void rule__Produce__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1923:1: ( rule__Produce__Group__10__Impl rule__Produce__Group__11 )
            // InternalGrocery.g:1924:2: rule__Produce__Group__10__Impl rule__Produce__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Produce__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__10"


    // $ANTLR start "rule__Produce__Group__10__Impl"
    // InternalGrocery.g:1931:1: rule__Produce__Group__10__Impl : ( ':' ) ;
    public final void rule__Produce__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1935:1: ( ( ':' ) )
            // InternalGrocery.g:1936:1: ( ':' )
            {
            // InternalGrocery.g:1936:1: ( ':' )
            // InternalGrocery.g:1937:2: ':'
            {
             before(grammarAccess.getProduceAccess().getColonKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__10__Impl"


    // $ANTLR start "rule__Produce__Group__11"
    // InternalGrocery.g:1946:1: rule__Produce__Group__11 : rule__Produce__Group__11__Impl rule__Produce__Group__12 ;
    public final void rule__Produce__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1950:1: ( rule__Produce__Group__11__Impl rule__Produce__Group__12 )
            // InternalGrocery.g:1951:2: rule__Produce__Group__11__Impl rule__Produce__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Produce__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Produce__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__11"


    // $ANTLR start "rule__Produce__Group__11__Impl"
    // InternalGrocery.g:1958:1: rule__Produce__Group__11__Impl : ( ( rule__Produce__QualityAssignment_11 ) ) ;
    public final void rule__Produce__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1962:1: ( ( ( rule__Produce__QualityAssignment_11 ) ) )
            // InternalGrocery.g:1963:1: ( ( rule__Produce__QualityAssignment_11 ) )
            {
            // InternalGrocery.g:1963:1: ( ( rule__Produce__QualityAssignment_11 ) )
            // InternalGrocery.g:1964:2: ( rule__Produce__QualityAssignment_11 )
            {
             before(grammarAccess.getProduceAccess().getQualityAssignment_11()); 
            // InternalGrocery.g:1965:2: ( rule__Produce__QualityAssignment_11 )
            // InternalGrocery.g:1965:3: rule__Produce__QualityAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Produce__QualityAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getProduceAccess().getQualityAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__11__Impl"


    // $ANTLR start "rule__Produce__Group__12"
    // InternalGrocery.g:1973:1: rule__Produce__Group__12 : rule__Produce__Group__12__Impl ;
    public final void rule__Produce__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1977:1: ( rule__Produce__Group__12__Impl )
            // InternalGrocery.g:1978:2: rule__Produce__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Produce__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__12"


    // $ANTLR start "rule__Produce__Group__12__Impl"
    // InternalGrocery.g:1984:1: rule__Produce__Group__12__Impl : ( '}' ) ;
    public final void rule__Produce__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1988:1: ( ( '}' ) )
            // InternalGrocery.g:1989:1: ( '}' )
            {
            // InternalGrocery.g:1989:1: ( '}' )
            // InternalGrocery.g:1990:2: '}'
            {
             before(grammarAccess.getProduceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__Group__12__Impl"


    // $ANTLR start "rule__PerishableItem__Group__0"
    // InternalGrocery.g:2000:1: rule__PerishableItem__Group__0 : rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 ;
    public final void rule__PerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2004:1: ( rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 )
            // InternalGrocery.g:2005:2: rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PerishableItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__0"


    // $ANTLR start "rule__PerishableItem__Group__0__Impl"
    // InternalGrocery.g:2012:1: rule__PerishableItem__Group__0__Impl : ( 'perishableItem' ) ;
    public final void rule__PerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2016:1: ( ( 'perishableItem' ) )
            // InternalGrocery.g:2017:1: ( 'perishableItem' )
            {
            // InternalGrocery.g:2017:1: ( 'perishableItem' )
            // InternalGrocery.g:2018:2: 'perishableItem'
            {
             before(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__0__Impl"


    // $ANTLR start "rule__PerishableItem__Group__1"
    // InternalGrocery.g:2027:1: rule__PerishableItem__Group__1 : rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 ;
    public final void rule__PerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2031:1: ( rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 )
            // InternalGrocery.g:2032:2: rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PerishableItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__1"


    // $ANTLR start "rule__PerishableItem__Group__1__Impl"
    // InternalGrocery.g:2039:1: rule__PerishableItem__Group__1__Impl : ( ( rule__PerishableItem__NameAssignment_1 ) ) ;
    public final void rule__PerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2043:1: ( ( ( rule__PerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:2044:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2044:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:2045:2: ( rule__PerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2046:2: ( rule__PerishableItem__NameAssignment_1 )
            // InternalGrocery.g:2046:3: rule__PerishableItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__1__Impl"


    // $ANTLR start "rule__PerishableItem__Group__2"
    // InternalGrocery.g:2054:1: rule__PerishableItem__Group__2 : rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 ;
    public final void rule__PerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2058:1: ( rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 )
            // InternalGrocery.g:2059:2: rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PerishableItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__2"


    // $ANTLR start "rule__PerishableItem__Group__2__Impl"
    // InternalGrocery.g:2066:1: rule__PerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__PerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2070:1: ( ( '{' ) )
            // InternalGrocery.g:2071:1: ( '{' )
            {
            // InternalGrocery.g:2071:1: ( '{' )
            // InternalGrocery.g:2072:2: '{'
            {
             before(grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__2__Impl"


    // $ANTLR start "rule__PerishableItem__Group__3"
    // InternalGrocery.g:2081:1: rule__PerishableItem__Group__3 : rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 ;
    public final void rule__PerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2085:1: ( rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 )
            // InternalGrocery.g:2086:2: rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__PerishableItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__3"


    // $ANTLR start "rule__PerishableItem__Group__3__Impl"
    // InternalGrocery.g:2093:1: rule__PerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__PerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2097:1: ( ( 'price' ) )
            // InternalGrocery.g:2098:1: ( 'price' )
            {
            // InternalGrocery.g:2098:1: ( 'price' )
            // InternalGrocery.g:2099:2: 'price'
            {
             before(grammarAccess.getPerishableItemAccess().getPriceKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getPriceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__3__Impl"


    // $ANTLR start "rule__PerishableItem__Group__4"
    // InternalGrocery.g:2108:1: rule__PerishableItem__Group__4 : rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 ;
    public final void rule__PerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2112:1: ( rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 )
            // InternalGrocery.g:2113:2: rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__PerishableItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__4"


    // $ANTLR start "rule__PerishableItem__Group__4__Impl"
    // InternalGrocery.g:2120:1: rule__PerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2124:1: ( ( ':' ) )
            // InternalGrocery.g:2125:1: ( ':' )
            {
            // InternalGrocery.g:2125:1: ( ':' )
            // InternalGrocery.g:2126:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__4__Impl"


    // $ANTLR start "rule__PerishableItem__Group__5"
    // InternalGrocery.g:2135:1: rule__PerishableItem__Group__5 : rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 ;
    public final void rule__PerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2139:1: ( rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 )
            // InternalGrocery.g:2140:2: rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PerishableItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__5"


    // $ANTLR start "rule__PerishableItem__Group__5__Impl"
    // InternalGrocery.g:2147:1: rule__PerishableItem__Group__5__Impl : ( ( rule__PerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__PerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2151:1: ( ( ( rule__PerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:2152:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:2152:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:2153:2: ( rule__PerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:2154:2: ( rule__PerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:2154:3: rule__PerishableItem__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__5__Impl"


    // $ANTLR start "rule__PerishableItem__Group__6"
    // InternalGrocery.g:2162:1: rule__PerishableItem__Group__6 : rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 ;
    public final void rule__PerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2166:1: ( rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 )
            // InternalGrocery.g:2167:2: rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__PerishableItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__6"


    // $ANTLR start "rule__PerishableItem__Group__6__Impl"
    // InternalGrocery.g:2174:1: rule__PerishableItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__PerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2178:1: ( ( 'quantity' ) )
            // InternalGrocery.g:2179:1: ( 'quantity' )
            {
            // InternalGrocery.g:2179:1: ( 'quantity' )
            // InternalGrocery.g:2180:2: 'quantity'
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getQuantityKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__6__Impl"


    // $ANTLR start "rule__PerishableItem__Group__7"
    // InternalGrocery.g:2189:1: rule__PerishableItem__Group__7 : rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8 ;
    public final void rule__PerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2193:1: ( rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8 )
            // InternalGrocery.g:2194:2: rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__PerishableItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__7"


    // $ANTLR start "rule__PerishableItem__Group__7__Impl"
    // InternalGrocery.g:2201:1: rule__PerishableItem__Group__7__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2205:1: ( ( ':' ) )
            // InternalGrocery.g:2206:1: ( ':' )
            {
            // InternalGrocery.g:2206:1: ( ':' )
            // InternalGrocery.g:2207:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__7__Impl"


    // $ANTLR start "rule__PerishableItem__Group__8"
    // InternalGrocery.g:2216:1: rule__PerishableItem__Group__8 : rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9 ;
    public final void rule__PerishableItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2220:1: ( rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9 )
            // InternalGrocery.g:2221:2: rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__PerishableItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__8"


    // $ANTLR start "rule__PerishableItem__Group__8__Impl"
    // InternalGrocery.g:2228:1: rule__PerishableItem__Group__8__Impl : ( ( rule__PerishableItem__QuantityAssignment_8 ) ) ;
    public final void rule__PerishableItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2232:1: ( ( ( rule__PerishableItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:2233:1: ( ( rule__PerishableItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:2233:1: ( ( rule__PerishableItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:2234:2: ( rule__PerishableItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:2235:2: ( rule__PerishableItem__QuantityAssignment_8 )
            // InternalGrocery.g:2235:3: rule__PerishableItem__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getQuantityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__8__Impl"


    // $ANTLR start "rule__PerishableItem__Group__9"
    // InternalGrocery.g:2243:1: rule__PerishableItem__Group__9 : rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10 ;
    public final void rule__PerishableItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2247:1: ( rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10 )
            // InternalGrocery.g:2248:2: rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__PerishableItem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__9"


    // $ANTLR start "rule__PerishableItem__Group__9__Impl"
    // InternalGrocery.g:2255:1: rule__PerishableItem__Group__9__Impl : ( 'experationDate' ) ;
    public final void rule__PerishableItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2259:1: ( ( 'experationDate' ) )
            // InternalGrocery.g:2260:1: ( 'experationDate' )
            {
            // InternalGrocery.g:2260:1: ( 'experationDate' )
            // InternalGrocery.g:2261:2: 'experationDate'
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__9__Impl"


    // $ANTLR start "rule__PerishableItem__Group__10"
    // InternalGrocery.g:2270:1: rule__PerishableItem__Group__10 : rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11 ;
    public final void rule__PerishableItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2274:1: ( rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11 )
            // InternalGrocery.g:2275:2: rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__PerishableItem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__10"


    // $ANTLR start "rule__PerishableItem__Group__10__Impl"
    // InternalGrocery.g:2282:1: rule__PerishableItem__Group__10__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2286:1: ( ( ':' ) )
            // InternalGrocery.g:2287:1: ( ':' )
            {
            // InternalGrocery.g:2287:1: ( ':' )
            // InternalGrocery.g:2288:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__10__Impl"


    // $ANTLR start "rule__PerishableItem__Group__11"
    // InternalGrocery.g:2297:1: rule__PerishableItem__Group__11 : rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12 ;
    public final void rule__PerishableItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2301:1: ( rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12 )
            // InternalGrocery.g:2302:2: rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__PerishableItem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__11"


    // $ANTLR start "rule__PerishableItem__Group__11__Impl"
    // InternalGrocery.g:2309:1: rule__PerishableItem__Group__11__Impl : ( ( rule__PerishableItem__ExperationDateAssignment_11 ) ) ;
    public final void rule__PerishableItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2313:1: ( ( ( rule__PerishableItem__ExperationDateAssignment_11 ) ) )
            // InternalGrocery.g:2314:1: ( ( rule__PerishableItem__ExperationDateAssignment_11 ) )
            {
            // InternalGrocery.g:2314:1: ( ( rule__PerishableItem__ExperationDateAssignment_11 ) )
            // InternalGrocery.g:2315:2: ( rule__PerishableItem__ExperationDateAssignment_11 )
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_11()); 
            // InternalGrocery.g:2316:2: ( rule__PerishableItem__ExperationDateAssignment_11 )
            // InternalGrocery.g:2316:3: rule__PerishableItem__ExperationDateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__ExperationDateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__11__Impl"


    // $ANTLR start "rule__PerishableItem__Group__12"
    // InternalGrocery.g:2324:1: rule__PerishableItem__Group__12 : rule__PerishableItem__Group__12__Impl ;
    public final void rule__PerishableItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2328:1: ( rule__PerishableItem__Group__12__Impl )
            // InternalGrocery.g:2329:2: rule__PerishableItem__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__12"


    // $ANTLR start "rule__PerishableItem__Group__12__Impl"
    // InternalGrocery.g:2335:1: rule__PerishableItem__Group__12__Impl : ( '}' ) ;
    public final void rule__PerishableItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2339:1: ( ( '}' ) )
            // InternalGrocery.g:2340:1: ( '}' )
            {
            // InternalGrocery.g:2340:1: ( '}' )
            // InternalGrocery.g:2341:2: '}'
            {
             before(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__12__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__0"
    // InternalGrocery.g:2351:1: rule__NonFoodItem__Group__0 : rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1 ;
    public final void rule__NonFoodItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2355:1: ( rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1 )
            // InternalGrocery.g:2356:2: rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NonFoodItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__0"


    // $ANTLR start "rule__NonFoodItem__Group__0__Impl"
    // InternalGrocery.g:2363:1: rule__NonFoodItem__Group__0__Impl : ( 'nonFoodItem' ) ;
    public final void rule__NonFoodItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2367:1: ( ( 'nonFoodItem' ) )
            // InternalGrocery.g:2368:1: ( 'nonFoodItem' )
            {
            // InternalGrocery.g:2368:1: ( 'nonFoodItem' )
            // InternalGrocery.g:2369:2: 'nonFoodItem'
            {
             before(grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__0__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__1"
    // InternalGrocery.g:2378:1: rule__NonFoodItem__Group__1 : rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2 ;
    public final void rule__NonFoodItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2382:1: ( rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2 )
            // InternalGrocery.g:2383:2: rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NonFoodItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__1"


    // $ANTLR start "rule__NonFoodItem__Group__1__Impl"
    // InternalGrocery.g:2390:1: rule__NonFoodItem__Group__1__Impl : ( ( rule__NonFoodItem__NameAssignment_1 ) ) ;
    public final void rule__NonFoodItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2394:1: ( ( ( rule__NonFoodItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:2395:1: ( ( rule__NonFoodItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2395:1: ( ( rule__NonFoodItem__NameAssignment_1 ) )
            // InternalGrocery.g:2396:2: ( rule__NonFoodItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonFoodItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2397:2: ( rule__NonFoodItem__NameAssignment_1 )
            // InternalGrocery.g:2397:3: rule__NonFoodItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__1__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__2"
    // InternalGrocery.g:2405:1: rule__NonFoodItem__Group__2 : rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3 ;
    public final void rule__NonFoodItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2409:1: ( rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3 )
            // InternalGrocery.g:2410:2: rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NonFoodItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__2"


    // $ANTLR start "rule__NonFoodItem__Group__2__Impl"
    // InternalGrocery.g:2417:1: rule__NonFoodItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonFoodItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2421:1: ( ( '{' ) )
            // InternalGrocery.g:2422:1: ( '{' )
            {
            // InternalGrocery.g:2422:1: ( '{' )
            // InternalGrocery.g:2423:2: '{'
            {
             before(grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__2__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__3"
    // InternalGrocery.g:2432:1: rule__NonFoodItem__Group__3 : rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4 ;
    public final void rule__NonFoodItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2436:1: ( rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4 )
            // InternalGrocery.g:2437:2: rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__NonFoodItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__3"


    // $ANTLR start "rule__NonFoodItem__Group__3__Impl"
    // InternalGrocery.g:2444:1: rule__NonFoodItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonFoodItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2448:1: ( ( 'price' ) )
            // InternalGrocery.g:2449:1: ( 'price' )
            {
            // InternalGrocery.g:2449:1: ( 'price' )
            // InternalGrocery.g:2450:2: 'price'
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getPriceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__3__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__4"
    // InternalGrocery.g:2459:1: rule__NonFoodItem__Group__4 : rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5 ;
    public final void rule__NonFoodItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2463:1: ( rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5 )
            // InternalGrocery.g:2464:2: rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__NonFoodItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__4"


    // $ANTLR start "rule__NonFoodItem__Group__4__Impl"
    // InternalGrocery.g:2471:1: rule__NonFoodItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonFoodItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2475:1: ( ( ':' ) )
            // InternalGrocery.g:2476:1: ( ':' )
            {
            // InternalGrocery.g:2476:1: ( ':' )
            // InternalGrocery.g:2477:2: ':'
            {
             before(grammarAccess.getNonFoodItemAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__4__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__5"
    // InternalGrocery.g:2486:1: rule__NonFoodItem__Group__5 : rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6 ;
    public final void rule__NonFoodItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2490:1: ( rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6 )
            // InternalGrocery.g:2491:2: rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__NonFoodItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__5"


    // $ANTLR start "rule__NonFoodItem__Group__5__Impl"
    // InternalGrocery.g:2498:1: rule__NonFoodItem__Group__5__Impl : ( ( rule__NonFoodItem__PriceAssignment_5 ) ) ;
    public final void rule__NonFoodItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2502:1: ( ( ( rule__NonFoodItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:2503:1: ( ( rule__NonFoodItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:2503:1: ( ( rule__NonFoodItem__PriceAssignment_5 ) )
            // InternalGrocery.g:2504:2: ( rule__NonFoodItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:2505:2: ( rule__NonFoodItem__PriceAssignment_5 )
            // InternalGrocery.g:2505:3: rule__NonFoodItem__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__5__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__6"
    // InternalGrocery.g:2513:1: rule__NonFoodItem__Group__6 : rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7 ;
    public final void rule__NonFoodItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2517:1: ( rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7 )
            // InternalGrocery.g:2518:2: rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__NonFoodItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__6"


    // $ANTLR start "rule__NonFoodItem__Group__6__Impl"
    // InternalGrocery.g:2525:1: rule__NonFoodItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__NonFoodItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2529:1: ( ( 'quantity' ) )
            // InternalGrocery.g:2530:1: ( 'quantity' )
            {
            // InternalGrocery.g:2530:1: ( 'quantity' )
            // InternalGrocery.g:2531:2: 'quantity'
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__6__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__7"
    // InternalGrocery.g:2540:1: rule__NonFoodItem__Group__7 : rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8 ;
    public final void rule__NonFoodItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2544:1: ( rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8 )
            // InternalGrocery.g:2545:2: rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__NonFoodItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__7"


    // $ANTLR start "rule__NonFoodItem__Group__7__Impl"
    // InternalGrocery.g:2552:1: rule__NonFoodItem__Group__7__Impl : ( ':' ) ;
    public final void rule__NonFoodItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2556:1: ( ( ':' ) )
            // InternalGrocery.g:2557:1: ( ':' )
            {
            // InternalGrocery.g:2557:1: ( ':' )
            // InternalGrocery.g:2558:2: ':'
            {
             before(grammarAccess.getNonFoodItemAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__7__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__8"
    // InternalGrocery.g:2567:1: rule__NonFoodItem__Group__8 : rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9 ;
    public final void rule__NonFoodItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2571:1: ( rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9 )
            // InternalGrocery.g:2572:2: rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__NonFoodItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__8"


    // $ANTLR start "rule__NonFoodItem__Group__8__Impl"
    // InternalGrocery.g:2579:1: rule__NonFoodItem__Group__8__Impl : ( ( rule__NonFoodItem__QuantityAssignment_8 ) ) ;
    public final void rule__NonFoodItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2583:1: ( ( ( rule__NonFoodItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:2584:1: ( ( rule__NonFoodItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:2584:1: ( ( rule__NonFoodItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:2585:2: ( rule__NonFoodItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:2586:2: ( rule__NonFoodItem__QuantityAssignment_8 )
            // InternalGrocery.g:2586:3: rule__NonFoodItem__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getQuantityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__8__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__9"
    // InternalGrocery.g:2594:1: rule__NonFoodItem__Group__9 : rule__NonFoodItem__Group__9__Impl ;
    public final void rule__NonFoodItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2598:1: ( rule__NonFoodItem__Group__9__Impl )
            // InternalGrocery.g:2599:2: rule__NonFoodItem__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__9"


    // $ANTLR start "rule__NonFoodItem__Group__9__Impl"
    // InternalGrocery.g:2605:1: rule__NonFoodItem__Group__9__Impl : ( '}' ) ;
    public final void rule__NonFoodItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2609:1: ( ( '}' ) )
            // InternalGrocery.g:2610:1: ( '}' )
            {
            // InternalGrocery.g:2610:1: ( '}' )
            // InternalGrocery.g:2611:2: '}'
            {
             before(grammarAccess.getNonFoodItemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__9__Impl"


    // $ANTLR start "rule__Driver__Group__0"
    // InternalGrocery.g:2621:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2625:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalGrocery.g:2626:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Driver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__0"


    // $ANTLR start "rule__Driver__Group__0__Impl"
    // InternalGrocery.g:2633:1: rule__Driver__Group__0__Impl : ( 'driver' ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2637:1: ( ( 'driver' ) )
            // InternalGrocery.g:2638:1: ( 'driver' )
            {
            // InternalGrocery.g:2638:1: ( 'driver' )
            // InternalGrocery.g:2639:2: 'driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__0__Impl"


    // $ANTLR start "rule__Driver__Group__1"
    // InternalGrocery.g:2648:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2652:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalGrocery.g:2653:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Driver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__1"


    // $ANTLR start "rule__Driver__Group__1__Impl"
    // InternalGrocery.g:2660:1: rule__Driver__Group__1__Impl : ( ( rule__Driver__NameAssignment_1 ) ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2664:1: ( ( ( rule__Driver__NameAssignment_1 ) ) )
            // InternalGrocery.g:2665:1: ( ( rule__Driver__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2665:1: ( ( rule__Driver__NameAssignment_1 ) )
            // InternalGrocery.g:2666:2: ( rule__Driver__NameAssignment_1 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2667:2: ( rule__Driver__NameAssignment_1 )
            // InternalGrocery.g:2667:3: rule__Driver__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__1__Impl"


    // $ANTLR start "rule__Driver__Group__2"
    // InternalGrocery.g:2675:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2679:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalGrocery.g:2680:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Driver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__2"


    // $ANTLR start "rule__Driver__Group__2__Impl"
    // InternalGrocery.g:2687:1: rule__Driver__Group__2__Impl : ( '{' ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2691:1: ( ( '{' ) )
            // InternalGrocery.g:2692:1: ( '{' )
            {
            // InternalGrocery.g:2692:1: ( '{' )
            // InternalGrocery.g:2693:2: '{'
            {
             before(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__2__Impl"


    // $ANTLR start "rule__Driver__Group__3"
    // InternalGrocery.g:2702:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2706:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalGrocery.g:2707:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Driver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__3"


    // $ANTLR start "rule__Driver__Group__3__Impl"
    // InternalGrocery.g:2714:1: rule__Driver__Group__3__Impl : ( 'name' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2718:1: ( ( 'name' ) )
            // InternalGrocery.g:2719:1: ( 'name' )
            {
            // InternalGrocery.g:2719:1: ( 'name' )
            // InternalGrocery.g:2720:2: 'name'
            {
             before(grammarAccess.getDriverAccess().getNameKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__3__Impl"


    // $ANTLR start "rule__Driver__Group__4"
    // InternalGrocery.g:2729:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2733:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalGrocery.g:2734:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Driver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__4"


    // $ANTLR start "rule__Driver__Group__4__Impl"
    // InternalGrocery.g:2741:1: rule__Driver__Group__4__Impl : ( ':' ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2745:1: ( ( ':' ) )
            // InternalGrocery.g:2746:1: ( ':' )
            {
            // InternalGrocery.g:2746:1: ( ':' )
            // InternalGrocery.g:2747:2: ':'
            {
             before(grammarAccess.getDriverAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__4__Impl"


    // $ANTLR start "rule__Driver__Group__5"
    // InternalGrocery.g:2756:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2760:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalGrocery.g:2761:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Driver__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__5"


    // $ANTLR start "rule__Driver__Group__5__Impl"
    // InternalGrocery.g:2768:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__DriverNameAssignment_5 ) ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2772:1: ( ( ( rule__Driver__DriverNameAssignment_5 ) ) )
            // InternalGrocery.g:2773:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            {
            // InternalGrocery.g:2773:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            // InternalGrocery.g:2774:2: ( rule__Driver__DriverNameAssignment_5 )
            {
             before(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 
            // InternalGrocery.g:2775:2: ( rule__Driver__DriverNameAssignment_5 )
            // InternalGrocery.g:2775:3: rule__Driver__DriverNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DriverNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__5__Impl"


    // $ANTLR start "rule__Driver__Group__6"
    // InternalGrocery.g:2783:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl rule__Driver__Group__7 ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2787:1: ( rule__Driver__Group__6__Impl rule__Driver__Group__7 )
            // InternalGrocery.g:2788:2: rule__Driver__Group__6__Impl rule__Driver__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Driver__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__6"


    // $ANTLR start "rule__Driver__Group__6__Impl"
    // InternalGrocery.g:2795:1: rule__Driver__Group__6__Impl : ( ( rule__Driver__VehicleAssignment_6 ) ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2799:1: ( ( ( rule__Driver__VehicleAssignment_6 ) ) )
            // InternalGrocery.g:2800:1: ( ( rule__Driver__VehicleAssignment_6 ) )
            {
            // InternalGrocery.g:2800:1: ( ( rule__Driver__VehicleAssignment_6 ) )
            // InternalGrocery.g:2801:2: ( rule__Driver__VehicleAssignment_6 )
            {
             before(grammarAccess.getDriverAccess().getVehicleAssignment_6()); 
            // InternalGrocery.g:2802:2: ( rule__Driver__VehicleAssignment_6 )
            // InternalGrocery.g:2802:3: rule__Driver__VehicleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Driver__VehicleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getVehicleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__6__Impl"


    // $ANTLR start "rule__Driver__Group__7"
    // InternalGrocery.g:2810:1: rule__Driver__Group__7 : rule__Driver__Group__7__Impl rule__Driver__Group__8 ;
    public final void rule__Driver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2814:1: ( rule__Driver__Group__7__Impl rule__Driver__Group__8 )
            // InternalGrocery.g:2815:2: rule__Driver__Group__7__Impl rule__Driver__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Driver__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__7"


    // $ANTLR start "rule__Driver__Group__7__Impl"
    // InternalGrocery.g:2822:1: rule__Driver__Group__7__Impl : ( ( rule__Driver__DeliveryAssignment_7 )* ) ;
    public final void rule__Driver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2826:1: ( ( ( rule__Driver__DeliveryAssignment_7 )* ) )
            // InternalGrocery.g:2827:1: ( ( rule__Driver__DeliveryAssignment_7 )* )
            {
            // InternalGrocery.g:2827:1: ( ( rule__Driver__DeliveryAssignment_7 )* )
            // InternalGrocery.g:2828:2: ( rule__Driver__DeliveryAssignment_7 )*
            {
             before(grammarAccess.getDriverAccess().getDeliveryAssignment_7()); 
            // InternalGrocery.g:2829:2: ( rule__Driver__DeliveryAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGrocery.g:2829:3: rule__Driver__DeliveryAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Driver__DeliveryAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDriverAccess().getDeliveryAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__7__Impl"


    // $ANTLR start "rule__Driver__Group__8"
    // InternalGrocery.g:2837:1: rule__Driver__Group__8 : rule__Driver__Group__8__Impl ;
    public final void rule__Driver__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2841:1: ( rule__Driver__Group__8__Impl )
            // InternalGrocery.g:2842:2: rule__Driver__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__8"


    // $ANTLR start "rule__Driver__Group__8__Impl"
    // InternalGrocery.g:2848:1: rule__Driver__Group__8__Impl : ( '}' ) ;
    public final void rule__Driver__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2852:1: ( ( '}' ) )
            // InternalGrocery.g:2853:1: ( '}' )
            {
            // InternalGrocery.g:2853:1: ( '}' )
            // InternalGrocery.g:2854:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__8__Impl"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalGrocery.g:2864:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2868:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalGrocery.g:2869:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalGrocery.g:2876:1: rule__Employee__Group__0__Impl : ( 'employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2880:1: ( ( 'employee' ) )
            // InternalGrocery.g:2881:1: ( 'employee' )
            {
            // InternalGrocery.g:2881:1: ( 'employee' )
            // InternalGrocery.g:2882:2: 'employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalGrocery.g:2891:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2895:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalGrocery.g:2896:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalGrocery.g:2903:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2907:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalGrocery.g:2908:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2908:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalGrocery.g:2909:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2910:2: ( rule__Employee__NameAssignment_1 )
            // InternalGrocery.g:2910:3: rule__Employee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalGrocery.g:2918:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2922:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalGrocery.g:2923:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalGrocery.g:2930:1: rule__Employee__Group__2__Impl : ( '{' ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2934:1: ( ( '{' ) )
            // InternalGrocery.g:2935:1: ( '{' )
            {
            // InternalGrocery.g:2935:1: ( '{' )
            // InternalGrocery.g:2936:2: '{'
            {
             before(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalGrocery.g:2945:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2949:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalGrocery.g:2950:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Employee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalGrocery.g:2957:1: rule__Employee__Group__3__Impl : ( 'name' ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2961:1: ( ( 'name' ) )
            // InternalGrocery.g:2962:1: ( 'name' )
            {
            // InternalGrocery.g:2962:1: ( 'name' )
            // InternalGrocery.g:2963:2: 'name'
            {
             before(grammarAccess.getEmployeeAccess().getNameKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group__4"
    // InternalGrocery.g:2972:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2976:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalGrocery.g:2977:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Employee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4"


    // $ANTLR start "rule__Employee__Group__4__Impl"
    // InternalGrocery.g:2984:1: rule__Employee__Group__4__Impl : ( ':' ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2988:1: ( ( ':' ) )
            // InternalGrocery.g:2989:1: ( ':' )
            {
            // InternalGrocery.g:2989:1: ( ':' )
            // InternalGrocery.g:2990:2: ':'
            {
             before(grammarAccess.getEmployeeAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4__Impl"


    // $ANTLR start "rule__Employee__Group__5"
    // InternalGrocery.g:2999:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3003:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalGrocery.g:3004:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Employee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5"


    // $ANTLR start "rule__Employee__Group__5__Impl"
    // InternalGrocery.g:3011:1: rule__Employee__Group__5__Impl : ( ( rule__Employee__EmployeeNameAssignment_5 ) ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3015:1: ( ( ( rule__Employee__EmployeeNameAssignment_5 ) ) )
            // InternalGrocery.g:3016:1: ( ( rule__Employee__EmployeeNameAssignment_5 ) )
            {
            // InternalGrocery.g:3016:1: ( ( rule__Employee__EmployeeNameAssignment_5 ) )
            // InternalGrocery.g:3017:2: ( rule__Employee__EmployeeNameAssignment_5 )
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeNameAssignment_5()); 
            // InternalGrocery.g:3018:2: ( rule__Employee__EmployeeNameAssignment_5 )
            // InternalGrocery.g:3018:3: rule__Employee__EmployeeNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Employee__EmployeeNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getEmployeeNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5__Impl"


    // $ANTLR start "rule__Employee__Group__6"
    // InternalGrocery.g:3026:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl rule__Employee__Group__7 ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3030:1: ( rule__Employee__Group__6__Impl rule__Employee__Group__7 )
            // InternalGrocery.g:3031:2: rule__Employee__Group__6__Impl rule__Employee__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Employee__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6"


    // $ANTLR start "rule__Employee__Group__6__Impl"
    // InternalGrocery.g:3038:1: rule__Employee__Group__6__Impl : ( ( rule__Employee__StockMovementAssignment_6 )* ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3042:1: ( ( ( rule__Employee__StockMovementAssignment_6 )* ) )
            // InternalGrocery.g:3043:1: ( ( rule__Employee__StockMovementAssignment_6 )* )
            {
            // InternalGrocery.g:3043:1: ( ( rule__Employee__StockMovementAssignment_6 )* )
            // InternalGrocery.g:3044:2: ( rule__Employee__StockMovementAssignment_6 )*
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementAssignment_6()); 
            // InternalGrocery.g:3045:2: ( rule__Employee__StockMovementAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGrocery.g:3045:3: rule__Employee__StockMovementAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Employee__StockMovementAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEmployeeAccess().getStockMovementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6__Impl"


    // $ANTLR start "rule__Employee__Group__7"
    // InternalGrocery.g:3053:1: rule__Employee__Group__7 : rule__Employee__Group__7__Impl ;
    public final void rule__Employee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3057:1: ( rule__Employee__Group__7__Impl )
            // InternalGrocery.g:3058:2: rule__Employee__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7"


    // $ANTLR start "rule__Employee__Group__7__Impl"
    // InternalGrocery.g:3064:1: rule__Employee__Group__7__Impl : ( '}' ) ;
    public final void rule__Employee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3068:1: ( ( '}' ) )
            // InternalGrocery.g:3069:1: ( '}' )
            {
            // InternalGrocery.g:3069:1: ( '}' )
            // InternalGrocery.g:3070:2: '}'
            {
             before(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalGrocery.g:3080:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3084:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalGrocery.g:3085:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalGrocery.g:3092:1: rule__Customer__Group__0__Impl : ( 'customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3096:1: ( ( 'customer' ) )
            // InternalGrocery.g:3097:1: ( 'customer' )
            {
            // InternalGrocery.g:3097:1: ( 'customer' )
            // InternalGrocery.g:3098:2: 'customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalGrocery.g:3107:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3111:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalGrocery.g:3112:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalGrocery.g:3119:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__NameAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3123:1: ( ( ( rule__Customer__NameAssignment_1 ) ) )
            // InternalGrocery.g:3124:1: ( ( rule__Customer__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3124:1: ( ( rule__Customer__NameAssignment_1 ) )
            // InternalGrocery.g:3125:2: ( rule__Customer__NameAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3126:2: ( rule__Customer__NameAssignment_1 )
            // InternalGrocery.g:3126:3: rule__Customer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalGrocery.g:3134:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3138:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalGrocery.g:3139:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalGrocery.g:3146:1: rule__Customer__Group__2__Impl : ( '{' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3150:1: ( ( '{' ) )
            // InternalGrocery.g:3151:1: ( '{' )
            {
            // InternalGrocery.g:3151:1: ( '{' )
            // InternalGrocery.g:3152:2: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // InternalGrocery.g:3161:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3165:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalGrocery.g:3166:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // InternalGrocery.g:3173:1: rule__Customer__Group__3__Impl : ( 'name' ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3177:1: ( ( 'name' ) )
            // InternalGrocery.g:3178:1: ( 'name' )
            {
            // InternalGrocery.g:3178:1: ( 'name' )
            // InternalGrocery.g:3179:2: 'name'
            {
             before(grammarAccess.getCustomerAccess().getNameKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // InternalGrocery.g:3188:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl rule__Customer__Group__5 ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3192:1: ( rule__Customer__Group__4__Impl rule__Customer__Group__5 )
            // InternalGrocery.g:3193:2: rule__Customer__Group__4__Impl rule__Customer__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Customer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // InternalGrocery.g:3200:1: rule__Customer__Group__4__Impl : ( ':' ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3204:1: ( ( ':' ) )
            // InternalGrocery.g:3205:1: ( ':' )
            {
            // InternalGrocery.g:3205:1: ( ':' )
            // InternalGrocery.g:3206:2: ':'
            {
             before(grammarAccess.getCustomerAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__Customer__Group__5"
    // InternalGrocery.g:3215:1: rule__Customer__Group__5 : rule__Customer__Group__5__Impl rule__Customer__Group__6 ;
    public final void rule__Customer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3219:1: ( rule__Customer__Group__5__Impl rule__Customer__Group__6 )
            // InternalGrocery.g:3220:2: rule__Customer__Group__5__Impl rule__Customer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Customer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5"


    // $ANTLR start "rule__Customer__Group__5__Impl"
    // InternalGrocery.g:3227:1: rule__Customer__Group__5__Impl : ( ( rule__Customer__CustomerNameAssignment_5 ) ) ;
    public final void rule__Customer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3231:1: ( ( ( rule__Customer__CustomerNameAssignment_5 ) ) )
            // InternalGrocery.g:3232:1: ( ( rule__Customer__CustomerNameAssignment_5 ) )
            {
            // InternalGrocery.g:3232:1: ( ( rule__Customer__CustomerNameAssignment_5 ) )
            // InternalGrocery.g:3233:2: ( rule__Customer__CustomerNameAssignment_5 )
            {
             before(grammarAccess.getCustomerAccess().getCustomerNameAssignment_5()); 
            // InternalGrocery.g:3234:2: ( rule__Customer__CustomerNameAssignment_5 )
            // InternalGrocery.g:3234:3: rule__Customer__CustomerNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Customer__CustomerNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getCustomerNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5__Impl"


    // $ANTLR start "rule__Customer__Group__6"
    // InternalGrocery.g:3242:1: rule__Customer__Group__6 : rule__Customer__Group__6__Impl rule__Customer__Group__7 ;
    public final void rule__Customer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3246:1: ( rule__Customer__Group__6__Impl rule__Customer__Group__7 )
            // InternalGrocery.g:3247:2: rule__Customer__Group__6__Impl rule__Customer__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Customer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6"


    // $ANTLR start "rule__Customer__Group__6__Impl"
    // InternalGrocery.g:3254:1: rule__Customer__Group__6__Impl : ( ( rule__Customer__SaleAssignment_6 )* ) ;
    public final void rule__Customer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3258:1: ( ( ( rule__Customer__SaleAssignment_6 )* ) )
            // InternalGrocery.g:3259:1: ( ( rule__Customer__SaleAssignment_6 )* )
            {
            // InternalGrocery.g:3259:1: ( ( rule__Customer__SaleAssignment_6 )* )
            // InternalGrocery.g:3260:2: ( rule__Customer__SaleAssignment_6 )*
            {
             before(grammarAccess.getCustomerAccess().getSaleAssignment_6()); 
            // InternalGrocery.g:3261:2: ( rule__Customer__SaleAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrocery.g:3261:3: rule__Customer__SaleAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Customer__SaleAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCustomerAccess().getSaleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6__Impl"


    // $ANTLR start "rule__Customer__Group__7"
    // InternalGrocery.g:3269:1: rule__Customer__Group__7 : rule__Customer__Group__7__Impl ;
    public final void rule__Customer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3273:1: ( rule__Customer__Group__7__Impl )
            // InternalGrocery.g:3274:2: rule__Customer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7"


    // $ANTLR start "rule__Customer__Group__7__Impl"
    // InternalGrocery.g:3280:1: rule__Customer__Group__7__Impl : ( '}' ) ;
    public final void rule__Customer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3284:1: ( ( '}' ) )
            // InternalGrocery.g:3285:1: ( '}' )
            {
            // InternalGrocery.g:3285:1: ( '}' )
            // InternalGrocery.g:3286:2: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7__Impl"


    // $ANTLR start "rule__Supplier__Group__0"
    // InternalGrocery.g:3296:1: rule__Supplier__Group__0 : rule__Supplier__Group__0__Impl rule__Supplier__Group__1 ;
    public final void rule__Supplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3300:1: ( rule__Supplier__Group__0__Impl rule__Supplier__Group__1 )
            // InternalGrocery.g:3301:2: rule__Supplier__Group__0__Impl rule__Supplier__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Supplier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supplier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__0"


    // $ANTLR start "rule__Supplier__Group__0__Impl"
    // InternalGrocery.g:3308:1: rule__Supplier__Group__0__Impl : ( 'supplier' ) ;
    public final void rule__Supplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3312:1: ( ( 'supplier' ) )
            // InternalGrocery.g:3313:1: ( 'supplier' )
            {
            // InternalGrocery.g:3313:1: ( 'supplier' )
            // InternalGrocery.g:3314:2: 'supplier'
            {
             before(grammarAccess.getSupplierAccess().getSupplierKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSupplierAccess().getSupplierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__0__Impl"


    // $ANTLR start "rule__Supplier__Group__1"
    // InternalGrocery.g:3323:1: rule__Supplier__Group__1 : rule__Supplier__Group__1__Impl rule__Supplier__Group__2 ;
    public final void rule__Supplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3327:1: ( rule__Supplier__Group__1__Impl rule__Supplier__Group__2 )
            // InternalGrocery.g:3328:2: rule__Supplier__Group__1__Impl rule__Supplier__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Supplier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supplier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__1"


    // $ANTLR start "rule__Supplier__Group__1__Impl"
    // InternalGrocery.g:3335:1: rule__Supplier__Group__1__Impl : ( ( rule__Supplier__NameAssignment_1 ) ) ;
    public final void rule__Supplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3339:1: ( ( ( rule__Supplier__NameAssignment_1 ) ) )
            // InternalGrocery.g:3340:1: ( ( rule__Supplier__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3340:1: ( ( rule__Supplier__NameAssignment_1 ) )
            // InternalGrocery.g:3341:2: ( rule__Supplier__NameAssignment_1 )
            {
             before(grammarAccess.getSupplierAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3342:2: ( rule__Supplier__NameAssignment_1 )
            // InternalGrocery.g:3342:3: rule__Supplier__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Supplier__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSupplierAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__1__Impl"


    // $ANTLR start "rule__Supplier__Group__2"
    // InternalGrocery.g:3350:1: rule__Supplier__Group__2 : rule__Supplier__Group__2__Impl rule__Supplier__Group__3 ;
    public final void rule__Supplier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3354:1: ( rule__Supplier__Group__2__Impl rule__Supplier__Group__3 )
            // InternalGrocery.g:3355:2: rule__Supplier__Group__2__Impl rule__Supplier__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Supplier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supplier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__2"


    // $ANTLR start "rule__Supplier__Group__2__Impl"
    // InternalGrocery.g:3362:1: rule__Supplier__Group__2__Impl : ( '{' ) ;
    public final void rule__Supplier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3366:1: ( ( '{' ) )
            // InternalGrocery.g:3367:1: ( '{' )
            {
            // InternalGrocery.g:3367:1: ( '{' )
            // InternalGrocery.g:3368:2: '{'
            {
             before(grammarAccess.getSupplierAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSupplierAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__2__Impl"


    // $ANTLR start "rule__Supplier__Group__3"
    // InternalGrocery.g:3377:1: rule__Supplier__Group__3 : rule__Supplier__Group__3__Impl rule__Supplier__Group__4 ;
    public final void rule__Supplier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3381:1: ( rule__Supplier__Group__3__Impl rule__Supplier__Group__4 )
            // InternalGrocery.g:3382:2: rule__Supplier__Group__3__Impl rule__Supplier__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Supplier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supplier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__3"


    // $ANTLR start "rule__Supplier__Group__3__Impl"
    // InternalGrocery.g:3389:1: rule__Supplier__Group__3__Impl : ( ( rule__Supplier__ItemsAssignment_3 )* ) ;
    public final void rule__Supplier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3393:1: ( ( ( rule__Supplier__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:3394:1: ( ( rule__Supplier__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:3394:1: ( ( rule__Supplier__ItemsAssignment_3 )* )
            // InternalGrocery.g:3395:2: ( rule__Supplier__ItemsAssignment_3 )*
            {
             before(grammarAccess.getSupplierAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:3396:2: ( rule__Supplier__ItemsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrocery.g:3396:3: rule__Supplier__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Supplier__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSupplierAccess().getItemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__3__Impl"


    // $ANTLR start "rule__Supplier__Group__4"
    // InternalGrocery.g:3404:1: rule__Supplier__Group__4 : rule__Supplier__Group__4__Impl ;
    public final void rule__Supplier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3408:1: ( rule__Supplier__Group__4__Impl )
            // InternalGrocery.g:3409:2: rule__Supplier__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Supplier__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__4"


    // $ANTLR start "rule__Supplier__Group__4__Impl"
    // InternalGrocery.g:3415:1: rule__Supplier__Group__4__Impl : ( '}' ) ;
    public final void rule__Supplier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3419:1: ( ( '}' ) )
            // InternalGrocery.g:3420:1: ( '}' )
            {
            // InternalGrocery.g:3420:1: ( '}' )
            // InternalGrocery.g:3421:2: '}'
            {
             before(grammarAccess.getSupplierAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSupplierAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__Group__4__Impl"


    // $ANTLR start "rule__Vehicle__Group__0"
    // InternalGrocery.g:3431:1: rule__Vehicle__Group__0 : rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 ;
    public final void rule__Vehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3435:1: ( rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 )
            // InternalGrocery.g:3436:2: rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Vehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__0"


    // $ANTLR start "rule__Vehicle__Group__0__Impl"
    // InternalGrocery.g:3443:1: rule__Vehicle__Group__0__Impl : ( 'vehicle' ) ;
    public final void rule__Vehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3447:1: ( ( 'vehicle' ) )
            // InternalGrocery.g:3448:1: ( 'vehicle' )
            {
            // InternalGrocery.g:3448:1: ( 'vehicle' )
            // InternalGrocery.g:3449:2: 'vehicle'
            {
             before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__0__Impl"


    // $ANTLR start "rule__Vehicle__Group__1"
    // InternalGrocery.g:3458:1: rule__Vehicle__Group__1 : rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 ;
    public final void rule__Vehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3462:1: ( rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 )
            // InternalGrocery.g:3463:2: rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Vehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__1"


    // $ANTLR start "rule__Vehicle__Group__1__Impl"
    // InternalGrocery.g:3470:1: rule__Vehicle__Group__1__Impl : ( ( rule__Vehicle__NameAssignment_1 ) ) ;
    public final void rule__Vehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3474:1: ( ( ( rule__Vehicle__NameAssignment_1 ) ) )
            // InternalGrocery.g:3475:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3475:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            // InternalGrocery.g:3476:2: ( rule__Vehicle__NameAssignment_1 )
            {
             before(grammarAccess.getVehicleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3477:2: ( rule__Vehicle__NameAssignment_1 )
            // InternalGrocery.g:3477:3: rule__Vehicle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVehicleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__1__Impl"


    // $ANTLR start "rule__Vehicle__Group__2"
    // InternalGrocery.g:3485:1: rule__Vehicle__Group__2 : rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 ;
    public final void rule__Vehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3489:1: ( rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 )
            // InternalGrocery.g:3490:2: rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Vehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__2"


    // $ANTLR start "rule__Vehicle__Group__2__Impl"
    // InternalGrocery.g:3497:1: rule__Vehicle__Group__2__Impl : ( '{' ) ;
    public final void rule__Vehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3501:1: ( ( '{' ) )
            // InternalGrocery.g:3502:1: ( '{' )
            {
            // InternalGrocery.g:3502:1: ( '{' )
            // InternalGrocery.g:3503:2: '{'
            {
             before(grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__2__Impl"


    // $ANTLR start "rule__Vehicle__Group__3"
    // InternalGrocery.g:3512:1: rule__Vehicle__Group__3 : rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 ;
    public final void rule__Vehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3516:1: ( rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 )
            // InternalGrocery.g:3517:2: rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Vehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__3"


    // $ANTLR start "rule__Vehicle__Group__3__Impl"
    // InternalGrocery.g:3524:1: rule__Vehicle__Group__3__Impl : ( 'plateNumber' ) ;
    public final void rule__Vehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3528:1: ( ( 'plateNumber' ) )
            // InternalGrocery.g:3529:1: ( 'plateNumber' )
            {
            // InternalGrocery.g:3529:1: ( 'plateNumber' )
            // InternalGrocery.g:3530:2: 'plateNumber'
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__3__Impl"


    // $ANTLR start "rule__Vehicle__Group__4"
    // InternalGrocery.g:3539:1: rule__Vehicle__Group__4 : rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 ;
    public final void rule__Vehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3543:1: ( rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 )
            // InternalGrocery.g:3544:2: rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Vehicle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__4"


    // $ANTLR start "rule__Vehicle__Group__4__Impl"
    // InternalGrocery.g:3551:1: rule__Vehicle__Group__4__Impl : ( ':' ) ;
    public final void rule__Vehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3555:1: ( ( ':' ) )
            // InternalGrocery.g:3556:1: ( ':' )
            {
            // InternalGrocery.g:3556:1: ( ':' )
            // InternalGrocery.g:3557:2: ':'
            {
             before(grammarAccess.getVehicleAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__4__Impl"


    // $ANTLR start "rule__Vehicle__Group__5"
    // InternalGrocery.g:3566:1: rule__Vehicle__Group__5 : rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 ;
    public final void rule__Vehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3570:1: ( rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 )
            // InternalGrocery.g:3571:2: rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Vehicle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__5"


    // $ANTLR start "rule__Vehicle__Group__5__Impl"
    // InternalGrocery.g:3578:1: rule__Vehicle__Group__5__Impl : ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) ;
    public final void rule__Vehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3582:1: ( ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) )
            // InternalGrocery.g:3583:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            {
            // InternalGrocery.g:3583:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            // InternalGrocery.g:3584:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 
            // InternalGrocery.g:3585:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            // InternalGrocery.g:3585:3: rule__Vehicle__PlateNumberAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__PlateNumberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__5__Impl"


    // $ANTLR start "rule__Vehicle__Group__6"
    // InternalGrocery.g:3593:1: rule__Vehicle__Group__6 : rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7 ;
    public final void rule__Vehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3597:1: ( rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7 )
            // InternalGrocery.g:3598:2: rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Vehicle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__6"


    // $ANTLR start "rule__Vehicle__Group__6__Impl"
    // InternalGrocery.g:3605:1: rule__Vehicle__Group__6__Impl : ( ( rule__Vehicle__DeliveryAssignment_6 )* ) ;
    public final void rule__Vehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3609:1: ( ( ( rule__Vehicle__DeliveryAssignment_6 )* ) )
            // InternalGrocery.g:3610:1: ( ( rule__Vehicle__DeliveryAssignment_6 )* )
            {
            // InternalGrocery.g:3610:1: ( ( rule__Vehicle__DeliveryAssignment_6 )* )
            // InternalGrocery.g:3611:2: ( rule__Vehicle__DeliveryAssignment_6 )*
            {
             before(grammarAccess.getVehicleAccess().getDeliveryAssignment_6()); 
            // InternalGrocery.g:3612:2: ( rule__Vehicle__DeliveryAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGrocery.g:3612:3: rule__Vehicle__DeliveryAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vehicle__DeliveryAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getVehicleAccess().getDeliveryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__6__Impl"


    // $ANTLR start "rule__Vehicle__Group__7"
    // InternalGrocery.g:3620:1: rule__Vehicle__Group__7 : rule__Vehicle__Group__7__Impl ;
    public final void rule__Vehicle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3624:1: ( rule__Vehicle__Group__7__Impl )
            // InternalGrocery.g:3625:2: rule__Vehicle__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__7"


    // $ANTLR start "rule__Vehicle__Group__7__Impl"
    // InternalGrocery.g:3631:1: rule__Vehicle__Group__7__Impl : ( '}' ) ;
    public final void rule__Vehicle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3635:1: ( ( '}' ) )
            // InternalGrocery.g:3636:1: ( '}' )
            {
            // InternalGrocery.g:3636:1: ( '}' )
            // InternalGrocery.g:3637:2: '}'
            {
             before(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__7__Impl"


    // $ANTLR start "rule__Delivery__Group__0"
    // InternalGrocery.g:3647:1: rule__Delivery__Group__0 : rule__Delivery__Group__0__Impl rule__Delivery__Group__1 ;
    public final void rule__Delivery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3651:1: ( rule__Delivery__Group__0__Impl rule__Delivery__Group__1 )
            // InternalGrocery.g:3652:2: rule__Delivery__Group__0__Impl rule__Delivery__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Delivery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__0"


    // $ANTLR start "rule__Delivery__Group__0__Impl"
    // InternalGrocery.g:3659:1: rule__Delivery__Group__0__Impl : ( 'delivery' ) ;
    public final void rule__Delivery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3663:1: ( ( 'delivery' ) )
            // InternalGrocery.g:3664:1: ( 'delivery' )
            {
            // InternalGrocery.g:3664:1: ( 'delivery' )
            // InternalGrocery.g:3665:2: 'delivery'
            {
             before(grammarAccess.getDeliveryAccess().getDeliveryKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getDeliveryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__0__Impl"


    // $ANTLR start "rule__Delivery__Group__1"
    // InternalGrocery.g:3674:1: rule__Delivery__Group__1 : rule__Delivery__Group__1__Impl rule__Delivery__Group__2 ;
    public final void rule__Delivery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3678:1: ( rule__Delivery__Group__1__Impl rule__Delivery__Group__2 )
            // InternalGrocery.g:3679:2: rule__Delivery__Group__1__Impl rule__Delivery__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Delivery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__1"


    // $ANTLR start "rule__Delivery__Group__1__Impl"
    // InternalGrocery.g:3686:1: rule__Delivery__Group__1__Impl : ( ( rule__Delivery__NameAssignment_1 ) ) ;
    public final void rule__Delivery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3690:1: ( ( ( rule__Delivery__NameAssignment_1 ) ) )
            // InternalGrocery.g:3691:1: ( ( rule__Delivery__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3691:1: ( ( rule__Delivery__NameAssignment_1 ) )
            // InternalGrocery.g:3692:2: ( rule__Delivery__NameAssignment_1 )
            {
             before(grammarAccess.getDeliveryAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3693:2: ( rule__Delivery__NameAssignment_1 )
            // InternalGrocery.g:3693:3: rule__Delivery__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__1__Impl"


    // $ANTLR start "rule__Delivery__Group__2"
    // InternalGrocery.g:3701:1: rule__Delivery__Group__2 : rule__Delivery__Group__2__Impl rule__Delivery__Group__3 ;
    public final void rule__Delivery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3705:1: ( rule__Delivery__Group__2__Impl rule__Delivery__Group__3 )
            // InternalGrocery.g:3706:2: rule__Delivery__Group__2__Impl rule__Delivery__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Delivery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__2"


    // $ANTLR start "rule__Delivery__Group__2__Impl"
    // InternalGrocery.g:3713:1: rule__Delivery__Group__2__Impl : ( '{' ) ;
    public final void rule__Delivery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3717:1: ( ( '{' ) )
            // InternalGrocery.g:3718:1: ( '{' )
            {
            // InternalGrocery.g:3718:1: ( '{' )
            // InternalGrocery.g:3719:2: '{'
            {
             before(grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__2__Impl"


    // $ANTLR start "rule__Delivery__Group__3"
    // InternalGrocery.g:3728:1: rule__Delivery__Group__3 : rule__Delivery__Group__3__Impl rule__Delivery__Group__4 ;
    public final void rule__Delivery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3732:1: ( rule__Delivery__Group__3__Impl rule__Delivery__Group__4 )
            // InternalGrocery.g:3733:2: rule__Delivery__Group__3__Impl rule__Delivery__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Delivery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__3"


    // $ANTLR start "rule__Delivery__Group__3__Impl"
    // InternalGrocery.g:3740:1: rule__Delivery__Group__3__Impl : ( 'warehouse' ) ;
    public final void rule__Delivery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3744:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:3745:1: ( 'warehouse' )
            {
            // InternalGrocery.g:3745:1: ( 'warehouse' )
            // InternalGrocery.g:3746:2: 'warehouse'
            {
             before(grammarAccess.getDeliveryAccess().getWarehouseKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getWarehouseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__3__Impl"


    // $ANTLR start "rule__Delivery__Group__4"
    // InternalGrocery.g:3755:1: rule__Delivery__Group__4 : rule__Delivery__Group__4__Impl rule__Delivery__Group__5 ;
    public final void rule__Delivery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3759:1: ( rule__Delivery__Group__4__Impl rule__Delivery__Group__5 )
            // InternalGrocery.g:3760:2: rule__Delivery__Group__4__Impl rule__Delivery__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Delivery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__4"


    // $ANTLR start "rule__Delivery__Group__4__Impl"
    // InternalGrocery.g:3767:1: rule__Delivery__Group__4__Impl : ( ':' ) ;
    public final void rule__Delivery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3771:1: ( ( ':' ) )
            // InternalGrocery.g:3772:1: ( ':' )
            {
            // InternalGrocery.g:3772:1: ( ':' )
            // InternalGrocery.g:3773:2: ':'
            {
             before(grammarAccess.getDeliveryAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__4__Impl"


    // $ANTLR start "rule__Delivery__Group__5"
    // InternalGrocery.g:3782:1: rule__Delivery__Group__5 : rule__Delivery__Group__5__Impl rule__Delivery__Group__6 ;
    public final void rule__Delivery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3786:1: ( rule__Delivery__Group__5__Impl rule__Delivery__Group__6 )
            // InternalGrocery.g:3787:2: rule__Delivery__Group__5__Impl rule__Delivery__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Delivery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__5"


    // $ANTLR start "rule__Delivery__Group__5__Impl"
    // InternalGrocery.g:3794:1: rule__Delivery__Group__5__Impl : ( ( rule__Delivery__FromWarehouseAssignment_5 ) ) ;
    public final void rule__Delivery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3798:1: ( ( ( rule__Delivery__FromWarehouseAssignment_5 ) ) )
            // InternalGrocery.g:3799:1: ( ( rule__Delivery__FromWarehouseAssignment_5 ) )
            {
            // InternalGrocery.g:3799:1: ( ( rule__Delivery__FromWarehouseAssignment_5 ) )
            // InternalGrocery.g:3800:2: ( rule__Delivery__FromWarehouseAssignment_5 )
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseAssignment_5()); 
            // InternalGrocery.g:3801:2: ( rule__Delivery__FromWarehouseAssignment_5 )
            // InternalGrocery.g:3801:3: rule__Delivery__FromWarehouseAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__FromWarehouseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getFromWarehouseAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__5__Impl"


    // $ANTLR start "rule__Delivery__Group__6"
    // InternalGrocery.g:3809:1: rule__Delivery__Group__6 : rule__Delivery__Group__6__Impl rule__Delivery__Group__7 ;
    public final void rule__Delivery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3813:1: ( rule__Delivery__Group__6__Impl rule__Delivery__Group__7 )
            // InternalGrocery.g:3814:2: rule__Delivery__Group__6__Impl rule__Delivery__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Delivery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__6"


    // $ANTLR start "rule__Delivery__Group__6__Impl"
    // InternalGrocery.g:3821:1: rule__Delivery__Group__6__Impl : ( 'store' ) ;
    public final void rule__Delivery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3825:1: ( ( 'store' ) )
            // InternalGrocery.g:3826:1: ( 'store' )
            {
            // InternalGrocery.g:3826:1: ( 'store' )
            // InternalGrocery.g:3827:2: 'store'
            {
             before(grammarAccess.getDeliveryAccess().getStoreKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getStoreKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__6__Impl"


    // $ANTLR start "rule__Delivery__Group__7"
    // InternalGrocery.g:3836:1: rule__Delivery__Group__7 : rule__Delivery__Group__7__Impl rule__Delivery__Group__8 ;
    public final void rule__Delivery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3840:1: ( rule__Delivery__Group__7__Impl rule__Delivery__Group__8 )
            // InternalGrocery.g:3841:2: rule__Delivery__Group__7__Impl rule__Delivery__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Delivery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__7"


    // $ANTLR start "rule__Delivery__Group__7__Impl"
    // InternalGrocery.g:3848:1: rule__Delivery__Group__7__Impl : ( ':' ) ;
    public final void rule__Delivery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3852:1: ( ( ':' ) )
            // InternalGrocery.g:3853:1: ( ':' )
            {
            // InternalGrocery.g:3853:1: ( ':' )
            // InternalGrocery.g:3854:2: ':'
            {
             before(grammarAccess.getDeliveryAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__7__Impl"


    // $ANTLR start "rule__Delivery__Group__8"
    // InternalGrocery.g:3863:1: rule__Delivery__Group__8 : rule__Delivery__Group__8__Impl rule__Delivery__Group__9 ;
    public final void rule__Delivery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3867:1: ( rule__Delivery__Group__8__Impl rule__Delivery__Group__9 )
            // InternalGrocery.g:3868:2: rule__Delivery__Group__8__Impl rule__Delivery__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Delivery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__8"


    // $ANTLR start "rule__Delivery__Group__8__Impl"
    // InternalGrocery.g:3875:1: rule__Delivery__Group__8__Impl : ( ( rule__Delivery__ToStoreAssignment_8 ) ) ;
    public final void rule__Delivery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3879:1: ( ( ( rule__Delivery__ToStoreAssignment_8 ) ) )
            // InternalGrocery.g:3880:1: ( ( rule__Delivery__ToStoreAssignment_8 ) )
            {
            // InternalGrocery.g:3880:1: ( ( rule__Delivery__ToStoreAssignment_8 ) )
            // InternalGrocery.g:3881:2: ( rule__Delivery__ToStoreAssignment_8 )
            {
             before(grammarAccess.getDeliveryAccess().getToStoreAssignment_8()); 
            // InternalGrocery.g:3882:2: ( rule__Delivery__ToStoreAssignment_8 )
            // InternalGrocery.g:3882:3: rule__Delivery__ToStoreAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__ToStoreAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getToStoreAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__8__Impl"


    // $ANTLR start "rule__Delivery__Group__9"
    // InternalGrocery.g:3890:1: rule__Delivery__Group__9 : rule__Delivery__Group__9__Impl rule__Delivery__Group__10 ;
    public final void rule__Delivery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3894:1: ( rule__Delivery__Group__9__Impl rule__Delivery__Group__10 )
            // InternalGrocery.g:3895:2: rule__Delivery__Group__9__Impl rule__Delivery__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Delivery__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__9"


    // $ANTLR start "rule__Delivery__Group__9__Impl"
    // InternalGrocery.g:3902:1: rule__Delivery__Group__9__Impl : ( ( rule__Delivery__ItemsAssignment_9 )* ) ;
    public final void rule__Delivery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3906:1: ( ( ( rule__Delivery__ItemsAssignment_9 )* ) )
            // InternalGrocery.g:3907:1: ( ( rule__Delivery__ItemsAssignment_9 )* )
            {
            // InternalGrocery.g:3907:1: ( ( rule__Delivery__ItemsAssignment_9 )* )
            // InternalGrocery.g:3908:2: ( rule__Delivery__ItemsAssignment_9 )*
            {
             before(grammarAccess.getDeliveryAccess().getItemsAssignment_9()); 
            // InternalGrocery.g:3909:2: ( rule__Delivery__ItemsAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGrocery.g:3909:3: rule__Delivery__ItemsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Delivery__ItemsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDeliveryAccess().getItemsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__9__Impl"


    // $ANTLR start "rule__Delivery__Group__10"
    // InternalGrocery.g:3917:1: rule__Delivery__Group__10 : rule__Delivery__Group__10__Impl ;
    public final void rule__Delivery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3921:1: ( rule__Delivery__Group__10__Impl )
            // InternalGrocery.g:3922:2: rule__Delivery__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__10"


    // $ANTLR start "rule__Delivery__Group__10__Impl"
    // InternalGrocery.g:3928:1: rule__Delivery__Group__10__Impl : ( '}' ) ;
    public final void rule__Delivery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3932:1: ( ( '}' ) )
            // InternalGrocery.g:3933:1: ( '}' )
            {
            // InternalGrocery.g:3933:1: ( '}' )
            // InternalGrocery.g:3934:2: '}'
            {
             before(grammarAccess.getDeliveryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__10__Impl"


    // $ANTLR start "rule__Sale__Group__0"
    // InternalGrocery.g:3944:1: rule__Sale__Group__0 : rule__Sale__Group__0__Impl rule__Sale__Group__1 ;
    public final void rule__Sale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3948:1: ( rule__Sale__Group__0__Impl rule__Sale__Group__1 )
            // InternalGrocery.g:3949:2: rule__Sale__Group__0__Impl rule__Sale__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__0"


    // $ANTLR start "rule__Sale__Group__0__Impl"
    // InternalGrocery.g:3956:1: rule__Sale__Group__0__Impl : ( 'sale' ) ;
    public final void rule__Sale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3960:1: ( ( 'sale' ) )
            // InternalGrocery.g:3961:1: ( 'sale' )
            {
            // InternalGrocery.g:3961:1: ( 'sale' )
            // InternalGrocery.g:3962:2: 'sale'
            {
             before(grammarAccess.getSaleAccess().getSaleKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getSaleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__0__Impl"


    // $ANTLR start "rule__Sale__Group__1"
    // InternalGrocery.g:3971:1: rule__Sale__Group__1 : rule__Sale__Group__1__Impl rule__Sale__Group__2 ;
    public final void rule__Sale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3975:1: ( rule__Sale__Group__1__Impl rule__Sale__Group__2 )
            // InternalGrocery.g:3976:2: rule__Sale__Group__1__Impl rule__Sale__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__1"


    // $ANTLR start "rule__Sale__Group__1__Impl"
    // InternalGrocery.g:3983:1: rule__Sale__Group__1__Impl : ( ( rule__Sale__NameAssignment_1 ) ) ;
    public final void rule__Sale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3987:1: ( ( ( rule__Sale__NameAssignment_1 ) ) )
            // InternalGrocery.g:3988:1: ( ( rule__Sale__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3988:1: ( ( rule__Sale__NameAssignment_1 ) )
            // InternalGrocery.g:3989:2: ( rule__Sale__NameAssignment_1 )
            {
             before(grammarAccess.getSaleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3990:2: ( rule__Sale__NameAssignment_1 )
            // InternalGrocery.g:3990:3: rule__Sale__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sale__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSaleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__1__Impl"


    // $ANTLR start "rule__Sale__Group__2"
    // InternalGrocery.g:3998:1: rule__Sale__Group__2 : rule__Sale__Group__2__Impl rule__Sale__Group__3 ;
    public final void rule__Sale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4002:1: ( rule__Sale__Group__2__Impl rule__Sale__Group__3 )
            // InternalGrocery.g:4003:2: rule__Sale__Group__2__Impl rule__Sale__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Sale__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__2"


    // $ANTLR start "rule__Sale__Group__2__Impl"
    // InternalGrocery.g:4010:1: rule__Sale__Group__2__Impl : ( '{' ) ;
    public final void rule__Sale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4014:1: ( ( '{' ) )
            // InternalGrocery.g:4015:1: ( '{' )
            {
            // InternalGrocery.g:4015:1: ( '{' )
            // InternalGrocery.g:4016:2: '{'
            {
             before(grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__2__Impl"


    // $ANTLR start "rule__Sale__Group__3"
    // InternalGrocery.g:4025:1: rule__Sale__Group__3 : rule__Sale__Group__3__Impl rule__Sale__Group__4 ;
    public final void rule__Sale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4029:1: ( rule__Sale__Group__3__Impl rule__Sale__Group__4 )
            // InternalGrocery.g:4030:2: rule__Sale__Group__3__Impl rule__Sale__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Sale__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__3"


    // $ANTLR start "rule__Sale__Group__3__Impl"
    // InternalGrocery.g:4037:1: rule__Sale__Group__3__Impl : ( 'shelf' ) ;
    public final void rule__Sale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4041:1: ( ( 'shelf' ) )
            // InternalGrocery.g:4042:1: ( 'shelf' )
            {
            // InternalGrocery.g:4042:1: ( 'shelf' )
            // InternalGrocery.g:4043:2: 'shelf'
            {
             before(grammarAccess.getSaleAccess().getShelfKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getShelfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__3__Impl"


    // $ANTLR start "rule__Sale__Group__4"
    // InternalGrocery.g:4052:1: rule__Sale__Group__4 : rule__Sale__Group__4__Impl rule__Sale__Group__5 ;
    public final void rule__Sale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4056:1: ( rule__Sale__Group__4__Impl rule__Sale__Group__5 )
            // InternalGrocery.g:4057:2: rule__Sale__Group__4__Impl rule__Sale__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Sale__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__4"


    // $ANTLR start "rule__Sale__Group__4__Impl"
    // InternalGrocery.g:4064:1: rule__Sale__Group__4__Impl : ( ':' ) ;
    public final void rule__Sale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4068:1: ( ( ':' ) )
            // InternalGrocery.g:4069:1: ( ':' )
            {
            // InternalGrocery.g:4069:1: ( ':' )
            // InternalGrocery.g:4070:2: ':'
            {
             before(grammarAccess.getSaleAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__4__Impl"


    // $ANTLR start "rule__Sale__Group__5"
    // InternalGrocery.g:4079:1: rule__Sale__Group__5 : rule__Sale__Group__5__Impl rule__Sale__Group__6 ;
    public final void rule__Sale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4083:1: ( rule__Sale__Group__5__Impl rule__Sale__Group__6 )
            // InternalGrocery.g:4084:2: rule__Sale__Group__5__Impl rule__Sale__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Sale__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__5"


    // $ANTLR start "rule__Sale__Group__5__Impl"
    // InternalGrocery.g:4091:1: rule__Sale__Group__5__Impl : ( ( rule__Sale__FromShelfAssignment_5 ) ) ;
    public final void rule__Sale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4095:1: ( ( ( rule__Sale__FromShelfAssignment_5 ) ) )
            // InternalGrocery.g:4096:1: ( ( rule__Sale__FromShelfAssignment_5 ) )
            {
            // InternalGrocery.g:4096:1: ( ( rule__Sale__FromShelfAssignment_5 ) )
            // InternalGrocery.g:4097:2: ( rule__Sale__FromShelfAssignment_5 )
            {
             before(grammarAccess.getSaleAccess().getFromShelfAssignment_5()); 
            // InternalGrocery.g:4098:2: ( rule__Sale__FromShelfAssignment_5 )
            // InternalGrocery.g:4098:3: rule__Sale__FromShelfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Sale__FromShelfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSaleAccess().getFromShelfAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__5__Impl"


    // $ANTLR start "rule__Sale__Group__6"
    // InternalGrocery.g:4106:1: rule__Sale__Group__6 : rule__Sale__Group__6__Impl rule__Sale__Group__7 ;
    public final void rule__Sale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4110:1: ( rule__Sale__Group__6__Impl rule__Sale__Group__7 )
            // InternalGrocery.g:4111:2: rule__Sale__Group__6__Impl rule__Sale__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Sale__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__6"


    // $ANTLR start "rule__Sale__Group__6__Impl"
    // InternalGrocery.g:4118:1: rule__Sale__Group__6__Impl : ( ( rule__Sale__ItemsAssignment_6 )* ) ;
    public final void rule__Sale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4122:1: ( ( ( rule__Sale__ItemsAssignment_6 )* ) )
            // InternalGrocery.g:4123:1: ( ( rule__Sale__ItemsAssignment_6 )* )
            {
            // InternalGrocery.g:4123:1: ( ( rule__Sale__ItemsAssignment_6 )* )
            // InternalGrocery.g:4124:2: ( rule__Sale__ItemsAssignment_6 )*
            {
             before(grammarAccess.getSaleAccess().getItemsAssignment_6()); 
            // InternalGrocery.g:4125:2: ( rule__Sale__ItemsAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGrocery.g:4125:3: rule__Sale__ItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Sale__ItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSaleAccess().getItemsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__6__Impl"


    // $ANTLR start "rule__Sale__Group__7"
    // InternalGrocery.g:4133:1: rule__Sale__Group__7 : rule__Sale__Group__7__Impl ;
    public final void rule__Sale__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4137:1: ( rule__Sale__Group__7__Impl )
            // InternalGrocery.g:4138:2: rule__Sale__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sale__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__7"


    // $ANTLR start "rule__Sale__Group__7__Impl"
    // InternalGrocery.g:4144:1: rule__Sale__Group__7__Impl : ( '}' ) ;
    public final void rule__Sale__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4148:1: ( ( '}' ) )
            // InternalGrocery.g:4149:1: ( '}' )
            {
            // InternalGrocery.g:4149:1: ( '}' )
            // InternalGrocery.g:4150:2: '}'
            {
             before(grammarAccess.getSaleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__7__Impl"


    // $ANTLR start "rule__StockMovement__Group__0"
    // InternalGrocery.g:4160:1: rule__StockMovement__Group__0 : rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1 ;
    public final void rule__StockMovement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4164:1: ( rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1 )
            // InternalGrocery.g:4165:2: rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StockMovement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__0"


    // $ANTLR start "rule__StockMovement__Group__0__Impl"
    // InternalGrocery.g:4172:1: rule__StockMovement__Group__0__Impl : ( 'stock' ) ;
    public final void rule__StockMovement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4176:1: ( ( 'stock' ) )
            // InternalGrocery.g:4177:1: ( 'stock' )
            {
            // InternalGrocery.g:4177:1: ( 'stock' )
            // InternalGrocery.g:4178:2: 'stock'
            {
             before(grammarAccess.getStockMovementAccess().getStockKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getStockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__0__Impl"


    // $ANTLR start "rule__StockMovement__Group__1"
    // InternalGrocery.g:4187:1: rule__StockMovement__Group__1 : rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2 ;
    public final void rule__StockMovement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4191:1: ( rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2 )
            // InternalGrocery.g:4192:2: rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StockMovement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__1"


    // $ANTLR start "rule__StockMovement__Group__1__Impl"
    // InternalGrocery.g:4199:1: rule__StockMovement__Group__1__Impl : ( ( rule__StockMovement__NameAssignment_1 ) ) ;
    public final void rule__StockMovement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4203:1: ( ( ( rule__StockMovement__NameAssignment_1 ) ) )
            // InternalGrocery.g:4204:1: ( ( rule__StockMovement__NameAssignment_1 ) )
            {
            // InternalGrocery.g:4204:1: ( ( rule__StockMovement__NameAssignment_1 ) )
            // InternalGrocery.g:4205:2: ( rule__StockMovement__NameAssignment_1 )
            {
             before(grammarAccess.getStockMovementAccess().getNameAssignment_1()); 
            // InternalGrocery.g:4206:2: ( rule__StockMovement__NameAssignment_1 )
            // InternalGrocery.g:4206:3: rule__StockMovement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__1__Impl"


    // $ANTLR start "rule__StockMovement__Group__2"
    // InternalGrocery.g:4214:1: rule__StockMovement__Group__2 : rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3 ;
    public final void rule__StockMovement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4218:1: ( rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3 )
            // InternalGrocery.g:4219:2: rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__StockMovement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__2"


    // $ANTLR start "rule__StockMovement__Group__2__Impl"
    // InternalGrocery.g:4226:1: rule__StockMovement__Group__2__Impl : ( '{' ) ;
    public final void rule__StockMovement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4230:1: ( ( '{' ) )
            // InternalGrocery.g:4231:1: ( '{' )
            {
            // InternalGrocery.g:4231:1: ( '{' )
            // InternalGrocery.g:4232:2: '{'
            {
             before(grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__2__Impl"


    // $ANTLR start "rule__StockMovement__Group__3"
    // InternalGrocery.g:4241:1: rule__StockMovement__Group__3 : rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4 ;
    public final void rule__StockMovement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4245:1: ( rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4 )
            // InternalGrocery.g:4246:2: rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__StockMovement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__3"


    // $ANTLR start "rule__StockMovement__Group__3__Impl"
    // InternalGrocery.g:4253:1: rule__StockMovement__Group__3__Impl : ( 'backroom' ) ;
    public final void rule__StockMovement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4257:1: ( ( 'backroom' ) )
            // InternalGrocery.g:4258:1: ( 'backroom' )
            {
            // InternalGrocery.g:4258:1: ( 'backroom' )
            // InternalGrocery.g:4259:2: 'backroom'
            {
             before(grammarAccess.getStockMovementAccess().getBackroomKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getBackroomKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__3__Impl"


    // $ANTLR start "rule__StockMovement__Group__4"
    // InternalGrocery.g:4268:1: rule__StockMovement__Group__4 : rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5 ;
    public final void rule__StockMovement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4272:1: ( rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5 )
            // InternalGrocery.g:4273:2: rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__StockMovement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__4"


    // $ANTLR start "rule__StockMovement__Group__4__Impl"
    // InternalGrocery.g:4280:1: rule__StockMovement__Group__4__Impl : ( ':' ) ;
    public final void rule__StockMovement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4284:1: ( ( ':' ) )
            // InternalGrocery.g:4285:1: ( ':' )
            {
            // InternalGrocery.g:4285:1: ( ':' )
            // InternalGrocery.g:4286:2: ':'
            {
             before(grammarAccess.getStockMovementAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__4__Impl"


    // $ANTLR start "rule__StockMovement__Group__5"
    // InternalGrocery.g:4295:1: rule__StockMovement__Group__5 : rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6 ;
    public final void rule__StockMovement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4299:1: ( rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6 )
            // InternalGrocery.g:4300:2: rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__StockMovement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__5"


    // $ANTLR start "rule__StockMovement__Group__5__Impl"
    // InternalGrocery.g:4307:1: rule__StockMovement__Group__5__Impl : ( ( rule__StockMovement__FromBackroomAssignment_5 ) ) ;
    public final void rule__StockMovement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4311:1: ( ( ( rule__StockMovement__FromBackroomAssignment_5 ) ) )
            // InternalGrocery.g:4312:1: ( ( rule__StockMovement__FromBackroomAssignment_5 ) )
            {
            // InternalGrocery.g:4312:1: ( ( rule__StockMovement__FromBackroomAssignment_5 ) )
            // InternalGrocery.g:4313:2: ( rule__StockMovement__FromBackroomAssignment_5 )
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomAssignment_5()); 
            // InternalGrocery.g:4314:2: ( rule__StockMovement__FromBackroomAssignment_5 )
            // InternalGrocery.g:4314:3: rule__StockMovement__FromBackroomAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__FromBackroomAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getFromBackroomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__5__Impl"


    // $ANTLR start "rule__StockMovement__Group__6"
    // InternalGrocery.g:4322:1: rule__StockMovement__Group__6 : rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7 ;
    public final void rule__StockMovement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4326:1: ( rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7 )
            // InternalGrocery.g:4327:2: rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__StockMovement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__6"


    // $ANTLR start "rule__StockMovement__Group__6__Impl"
    // InternalGrocery.g:4334:1: rule__StockMovement__Group__6__Impl : ( 'shelf' ) ;
    public final void rule__StockMovement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4338:1: ( ( 'shelf' ) )
            // InternalGrocery.g:4339:1: ( 'shelf' )
            {
            // InternalGrocery.g:4339:1: ( 'shelf' )
            // InternalGrocery.g:4340:2: 'shelf'
            {
             before(grammarAccess.getStockMovementAccess().getShelfKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getShelfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__6__Impl"


    // $ANTLR start "rule__StockMovement__Group__7"
    // InternalGrocery.g:4349:1: rule__StockMovement__Group__7 : rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8 ;
    public final void rule__StockMovement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4353:1: ( rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8 )
            // InternalGrocery.g:4354:2: rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__StockMovement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__7"


    // $ANTLR start "rule__StockMovement__Group__7__Impl"
    // InternalGrocery.g:4361:1: rule__StockMovement__Group__7__Impl : ( ':' ) ;
    public final void rule__StockMovement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4365:1: ( ( ':' ) )
            // InternalGrocery.g:4366:1: ( ':' )
            {
            // InternalGrocery.g:4366:1: ( ':' )
            // InternalGrocery.g:4367:2: ':'
            {
             before(grammarAccess.getStockMovementAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__7__Impl"


    // $ANTLR start "rule__StockMovement__Group__8"
    // InternalGrocery.g:4376:1: rule__StockMovement__Group__8 : rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9 ;
    public final void rule__StockMovement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4380:1: ( rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9 )
            // InternalGrocery.g:4381:2: rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__StockMovement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__8"


    // $ANTLR start "rule__StockMovement__Group__8__Impl"
    // InternalGrocery.g:4388:1: rule__StockMovement__Group__8__Impl : ( ( rule__StockMovement__ToShelfAssignment_8 ) ) ;
    public final void rule__StockMovement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4392:1: ( ( ( rule__StockMovement__ToShelfAssignment_8 ) ) )
            // InternalGrocery.g:4393:1: ( ( rule__StockMovement__ToShelfAssignment_8 ) )
            {
            // InternalGrocery.g:4393:1: ( ( rule__StockMovement__ToShelfAssignment_8 ) )
            // InternalGrocery.g:4394:2: ( rule__StockMovement__ToShelfAssignment_8 )
            {
             before(grammarAccess.getStockMovementAccess().getToShelfAssignment_8()); 
            // InternalGrocery.g:4395:2: ( rule__StockMovement__ToShelfAssignment_8 )
            // InternalGrocery.g:4395:3: rule__StockMovement__ToShelfAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__ToShelfAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getToShelfAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__8__Impl"


    // $ANTLR start "rule__StockMovement__Group__9"
    // InternalGrocery.g:4403:1: rule__StockMovement__Group__9 : rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10 ;
    public final void rule__StockMovement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4407:1: ( rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10 )
            // InternalGrocery.g:4408:2: rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__StockMovement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__9"


    // $ANTLR start "rule__StockMovement__Group__9__Impl"
    // InternalGrocery.g:4415:1: rule__StockMovement__Group__9__Impl : ( ( rule__StockMovement__ItemsAssignment_9 )* ) ;
    public final void rule__StockMovement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4419:1: ( ( ( rule__StockMovement__ItemsAssignment_9 )* ) )
            // InternalGrocery.g:4420:1: ( ( rule__StockMovement__ItemsAssignment_9 )* )
            {
            // InternalGrocery.g:4420:1: ( ( rule__StockMovement__ItemsAssignment_9 )* )
            // InternalGrocery.g:4421:2: ( rule__StockMovement__ItemsAssignment_9 )*
            {
             before(grammarAccess.getStockMovementAccess().getItemsAssignment_9()); 
            // InternalGrocery.g:4422:2: ( rule__StockMovement__ItemsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGrocery.g:4422:3: rule__StockMovement__ItemsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StockMovement__ItemsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStockMovementAccess().getItemsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__9__Impl"


    // $ANTLR start "rule__StockMovement__Group__10"
    // InternalGrocery.g:4430:1: rule__StockMovement__Group__10 : rule__StockMovement__Group__10__Impl ;
    public final void rule__StockMovement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4434:1: ( rule__StockMovement__Group__10__Impl )
            // InternalGrocery.g:4435:2: rule__StockMovement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__10"


    // $ANTLR start "rule__StockMovement__Group__10__Impl"
    // InternalGrocery.g:4441:1: rule__StockMovement__Group__10__Impl : ( '}' ) ;
    public final void rule__StockMovement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4445:1: ( ( '}' ) )
            // InternalGrocery.g:4446:1: ( '}' )
            {
            // InternalGrocery.g:4446:1: ( '}' )
            // InternalGrocery.g:4447:2: '}'
            {
             before(grammarAccess.getStockMovementAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__10__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalGrocery.g:4457:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4461:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalGrocery.g:4462:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalGrocery.g:4469:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4473:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4474:1: ( RULE_INT )
            {
            // InternalGrocery.g:4474:1: ( RULE_INT )
            // InternalGrocery.g:4475:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalGrocery.g:4484:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4488:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalGrocery.g:4489:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalGrocery.g:4496:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4500:1: ( ( '.' ) )
            // InternalGrocery.g:4501:1: ( '.' )
            {
            // InternalGrocery.g:4501:1: ( '.' )
            // InternalGrocery.g:4502:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalGrocery.g:4511:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4515:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalGrocery.g:4516:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalGrocery.g:4522:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4526:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4527:1: ( RULE_INT )
            {
            // InternalGrocery.g:4527:1: ( RULE_INT )
            // InternalGrocery.g:4528:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__DATE__Group__0"
    // InternalGrocery.g:4538:1: rule__DATE__Group__0 : rule__DATE__Group__0__Impl rule__DATE__Group__1 ;
    public final void rule__DATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4542:1: ( rule__DATE__Group__0__Impl rule__DATE__Group__1 )
            // InternalGrocery.g:4543:2: rule__DATE__Group__0__Impl rule__DATE__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DATE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__0"


    // $ANTLR start "rule__DATE__Group__0__Impl"
    // InternalGrocery.g:4550:1: rule__DATE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4554:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4555:1: ( RULE_INT )
            {
            // InternalGrocery.g:4555:1: ( RULE_INT )
            // InternalGrocery.g:4556:2: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__0__Impl"


    // $ANTLR start "rule__DATE__Group__1"
    // InternalGrocery.g:4565:1: rule__DATE__Group__1 : rule__DATE__Group__1__Impl rule__DATE__Group__2 ;
    public final void rule__DATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4569:1: ( rule__DATE__Group__1__Impl rule__DATE__Group__2 )
            // InternalGrocery.g:4570:2: rule__DATE__Group__1__Impl rule__DATE__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DATE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__1"


    // $ANTLR start "rule__DATE__Group__1__Impl"
    // InternalGrocery.g:4577:1: rule__DATE__Group__1__Impl : ( '/' ) ;
    public final void rule__DATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4581:1: ( ( '/' ) )
            // InternalGrocery.g:4582:1: ( '/' )
            {
            // InternalGrocery.g:4582:1: ( '/' )
            // InternalGrocery.g:4583:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__1__Impl"


    // $ANTLR start "rule__DATE__Group__2"
    // InternalGrocery.g:4592:1: rule__DATE__Group__2 : rule__DATE__Group__2__Impl rule__DATE__Group__3 ;
    public final void rule__DATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4596:1: ( rule__DATE__Group__2__Impl rule__DATE__Group__3 )
            // InternalGrocery.g:4597:2: rule__DATE__Group__2__Impl rule__DATE__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__DATE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__2"


    // $ANTLR start "rule__DATE__Group__2__Impl"
    // InternalGrocery.g:4604:1: rule__DATE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4608:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4609:1: ( RULE_INT )
            {
            // InternalGrocery.g:4609:1: ( RULE_INT )
            // InternalGrocery.g:4610:2: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__2__Impl"


    // $ANTLR start "rule__DATE__Group__3"
    // InternalGrocery.g:4619:1: rule__DATE__Group__3 : rule__DATE__Group__3__Impl rule__DATE__Group__4 ;
    public final void rule__DATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4623:1: ( rule__DATE__Group__3__Impl rule__DATE__Group__4 )
            // InternalGrocery.g:4624:2: rule__DATE__Group__3__Impl rule__DATE__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__DATE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__3"


    // $ANTLR start "rule__DATE__Group__3__Impl"
    // InternalGrocery.g:4631:1: rule__DATE__Group__3__Impl : ( '/' ) ;
    public final void rule__DATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4635:1: ( ( '/' ) )
            // InternalGrocery.g:4636:1: ( '/' )
            {
            // InternalGrocery.g:4636:1: ( '/' )
            // InternalGrocery.g:4637:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__3__Impl"


    // $ANTLR start "rule__DATE__Group__4"
    // InternalGrocery.g:4646:1: rule__DATE__Group__4 : rule__DATE__Group__4__Impl ;
    public final void rule__DATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4650:1: ( rule__DATE__Group__4__Impl )
            // InternalGrocery.g:4651:2: rule__DATE__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DATE__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__4"


    // $ANTLR start "rule__DATE__Group__4__Impl"
    // InternalGrocery.g:4657:1: rule__DATE__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4661:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4662:1: ( RULE_INT )
            {
            // InternalGrocery.g:4662:1: ( RULE_INT )
            // InternalGrocery.g:4663:2: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATE__Group__4__Impl"


    // $ANTLR start "rule__ADDRESS__Group__0"
    // InternalGrocery.g:4673:1: rule__ADDRESS__Group__0 : rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 ;
    public final void rule__ADDRESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4677:1: ( rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 )
            // InternalGrocery.g:4678:2: rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ADDRESS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__0"


    // $ANTLR start "rule__ADDRESS__Group__0__Impl"
    // InternalGrocery.g:4685:1: rule__ADDRESS__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__ADDRESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4689:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4690:1: ( RULE_INT )
            {
            // InternalGrocery.g:4690:1: ( RULE_INT )
            // InternalGrocery.g:4691:2: RULE_INT
            {
             before(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__0__Impl"


    // $ANTLR start "rule__ADDRESS__Group__1"
    // InternalGrocery.g:4700:1: rule__ADDRESS__Group__1 : rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 ;
    public final void rule__ADDRESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4704:1: ( rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 )
            // InternalGrocery.g:4705:2: rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ADDRESS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__1"


    // $ANTLR start "rule__ADDRESS__Group__1__Impl"
    // InternalGrocery.g:4712:1: rule__ADDRESS__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4716:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4717:1: ( RULE_STRING )
            {
            // InternalGrocery.g:4717:1: ( RULE_STRING )
            // InternalGrocery.g:4718:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__1__Impl"


    // $ANTLR start "rule__ADDRESS__Group__2"
    // InternalGrocery.g:4727:1: rule__ADDRESS__Group__2 : rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 ;
    public final void rule__ADDRESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4731:1: ( rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 )
            // InternalGrocery.g:4732:2: rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ADDRESS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__2"


    // $ANTLR start "rule__ADDRESS__Group__2__Impl"
    // InternalGrocery.g:4739:1: rule__ADDRESS__Group__2__Impl : ( ',' ) ;
    public final void rule__ADDRESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4743:1: ( ( ',' ) )
            // InternalGrocery.g:4744:1: ( ',' )
            {
            // InternalGrocery.g:4744:1: ( ',' )
            // InternalGrocery.g:4745:2: ','
            {
             before(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__2__Impl"


    // $ANTLR start "rule__ADDRESS__Group__3"
    // InternalGrocery.g:4754:1: rule__ADDRESS__Group__3 : rule__ADDRESS__Group__3__Impl ;
    public final void rule__ADDRESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4758:1: ( rule__ADDRESS__Group__3__Impl )
            // InternalGrocery.g:4759:2: rule__ADDRESS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__3"


    // $ANTLR start "rule__ADDRESS__Group__3__Impl"
    // InternalGrocery.g:4765:1: rule__ADDRESS__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4769:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4770:1: ( RULE_STRING )
            {
            // InternalGrocery.g:4770:1: ( RULE_STRING )
            // InternalGrocery.g:4771:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__3__Impl"


    // $ANTLR start "rule__Grocery__ElementsAssignment"
    // InternalGrocery.g:4781:1: rule__Grocery__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Grocery__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4785:1: ( ( ruleAbstractElement ) )
            // InternalGrocery.g:4786:2: ( ruleAbstractElement )
            {
            // InternalGrocery.g:4786:2: ( ruleAbstractElement )
            // InternalGrocery.g:4787:3: ruleAbstractElement
            {
             before(grammarAccess.getGroceryAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__ElementsAssignment"


    // $ANTLR start "rule__Store__NameAssignment_1"
    // InternalGrocery.g:4796:1: rule__Store__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4800:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4801:2: ( RULE_ID )
            {
            // InternalGrocery.g:4801:2: ( RULE_ID )
            // InternalGrocery.g:4802:3: RULE_ID
            {
             before(grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__NameAssignment_1"


    // $ANTLR start "rule__Store__ElementsAssignment_3"
    // InternalGrocery.g:4811:1: rule__Store__ElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Store__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4815:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4816:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4816:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4817:3: ( RULE_ID )
            {
             before(grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0()); 
            // InternalGrocery.g:4818:3: ( RULE_ID )
            // InternalGrocery.g:4819:4: RULE_ID
            {
             before(grammarAccess.getStoreAccess().getElementsStoreElementsIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getElementsStoreElementsIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ElementsAssignment_3"


    // $ANTLR start "rule__Warehouse__NameAssignment_1"
    // InternalGrocery.g:4830:1: rule__Warehouse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4834:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4835:2: ( RULE_ID )
            {
            // InternalGrocery.g:4835:2: ( RULE_ID )
            // InternalGrocery.g:4836:3: RULE_ID
            {
             before(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__NameAssignment_1"


    // $ANTLR start "rule__Warehouse__AddressAssignment_5"
    // InternalGrocery.g:4845:1: rule__Warehouse__AddressAssignment_5 : ( ruleADDRESS ) ;
    public final void rule__Warehouse__AddressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4849:1: ( ( ruleADDRESS ) )
            // InternalGrocery.g:4850:2: ( ruleADDRESS )
            {
            // InternalGrocery.g:4850:2: ( ruleADDRESS )
            // InternalGrocery.g:4851:3: ruleADDRESS
            {
             before(grammarAccess.getWarehouseAccess().getAddressADDRESSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getAddressADDRESSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__AddressAssignment_5"


    // $ANTLR start "rule__Warehouse__SupplierAssignment_8"
    // InternalGrocery.g:4860:1: rule__Warehouse__SupplierAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Warehouse__SupplierAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4864:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4865:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4865:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4866:3: ( RULE_ID )
            {
             before(grammarAccess.getWarehouseAccess().getSupplierSupplierCrossReference_8_0()); 
            // InternalGrocery.g:4867:3: ( RULE_ID )
            // InternalGrocery.g:4868:4: RULE_ID
            {
             before(grammarAccess.getWarehouseAccess().getSupplierSupplierIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getSupplierSupplierIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getWarehouseAccess().getSupplierSupplierCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__SupplierAssignment_8"


    // $ANTLR start "rule__Shelf__NameAssignment_1"
    // InternalGrocery.g:4879:1: rule__Shelf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shelf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4883:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4884:2: ( RULE_ID )
            {
            // InternalGrocery.g:4884:2: ( RULE_ID )
            // InternalGrocery.g:4885:3: RULE_ID
            {
             before(grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__NameAssignment_1"


    // $ANTLR start "rule__Shelf__ItemsAssignment_3"
    // InternalGrocery.g:4894:1: rule__Shelf__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Shelf__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4898:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4899:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4899:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4900:3: ( RULE_ID )
            {
             before(grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:4901:3: ( RULE_ID )
            // InternalGrocery.g:4902:4: RULE_ID
            {
             before(grammarAccess.getShelfAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__ItemsAssignment_3"


    // $ANTLR start "rule__Backroom__NameAssignment_1"
    // InternalGrocery.g:4913:1: rule__Backroom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Backroom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4917:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4918:2: ( RULE_ID )
            {
            // InternalGrocery.g:4918:2: ( RULE_ID )
            // InternalGrocery.g:4919:3: RULE_ID
            {
             before(grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__NameAssignment_1"


    // $ANTLR start "rule__Backroom__ItemsAssignment_3"
    // InternalGrocery.g:4928:1: rule__Backroom__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Backroom__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4932:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4933:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4933:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4934:3: ( RULE_ID )
            {
             before(grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:4935:3: ( RULE_ID )
            // InternalGrocery.g:4936:4: RULE_ID
            {
             before(grammarAccess.getBackroomAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__ItemsAssignment_3"


    // $ANTLR start "rule__Produce__NameAssignment_1"
    // InternalGrocery.g:4947:1: rule__Produce__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Produce__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4951:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4952:2: ( RULE_ID )
            {
            // InternalGrocery.g:4952:2: ( RULE_ID )
            // InternalGrocery.g:4953:3: RULE_ID
            {
             before(grammarAccess.getProduceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__NameAssignment_1"


    // $ANTLR start "rule__Produce__PriceAssignment_5"
    // InternalGrocery.g:4962:1: rule__Produce__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__Produce__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4966:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4967:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4967:2: ( ruleDECIMAL )
            // InternalGrocery.g:4968:3: ruleDECIMAL
            {
             before(grammarAccess.getProduceAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getProduceAccess().getPriceDECIMALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__PriceAssignment_5"


    // $ANTLR start "rule__Produce__QuantityAssignment_8"
    // InternalGrocery.g:4977:1: rule__Produce__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__Produce__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4981:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4982:2: ( RULE_INT )
            {
            // InternalGrocery.g:4982:2: ( RULE_INT )
            // InternalGrocery.g:4983:3: RULE_INT
            {
             before(grammarAccess.getProduceAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProduceAccess().getQuantityINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__QuantityAssignment_8"


    // $ANTLR start "rule__Produce__QualityAssignment_11"
    // InternalGrocery.g:4992:1: rule__Produce__QualityAssignment_11 : ( rulequalityLevel ) ;
    public final void rule__Produce__QualityAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4996:1: ( ( rulequalityLevel ) )
            // InternalGrocery.g:4997:2: ( rulequalityLevel )
            {
            // InternalGrocery.g:4997:2: ( rulequalityLevel )
            // InternalGrocery.g:4998:3: rulequalityLevel
            {
             before(grammarAccess.getProduceAccess().getQualityQualityLevelEnumRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulequalityLevel();

            state._fsp--;

             after(grammarAccess.getProduceAccess().getQualityQualityLevelEnumRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Produce__QualityAssignment_11"


    // $ANTLR start "rule__PerishableItem__NameAssignment_1"
    // InternalGrocery.g:5007:1: rule__PerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5011:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5012:2: ( RULE_ID )
            {
            // InternalGrocery.g:5012:2: ( RULE_ID )
            // InternalGrocery.g:5013:3: RULE_ID
            {
             before(grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__NameAssignment_1"


    // $ANTLR start "rule__PerishableItem__PriceAssignment_5"
    // InternalGrocery.g:5022:1: rule__PerishableItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__PerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5026:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:5027:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:5027:2: ( ruleDECIMAL )
            // InternalGrocery.g:5028:3: ruleDECIMAL
            {
             before(grammarAccess.getPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__PriceAssignment_5"


    // $ANTLR start "rule__PerishableItem__QuantityAssignment_8"
    // InternalGrocery.g:5037:1: rule__PerishableItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__PerishableItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5041:1: ( ( RULE_INT ) )
            // InternalGrocery.g:5042:2: ( RULE_INT )
            {
            // InternalGrocery.g:5042:2: ( RULE_INT )
            // InternalGrocery.g:5043:3: RULE_INT
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__QuantityAssignment_8"


    // $ANTLR start "rule__PerishableItem__ExperationDateAssignment_11"
    // InternalGrocery.g:5052:1: rule__PerishableItem__ExperationDateAssignment_11 : ( ruleDATE ) ;
    public final void rule__PerishableItem__ExperationDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5056:1: ( ( ruleDATE ) )
            // InternalGrocery.g:5057:2: ( ruleDATE )
            {
            // InternalGrocery.g:5057:2: ( ruleDATE )
            // InternalGrocery.g:5058:3: ruleDATE
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateDATEParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getPerishableItemAccess().getExperationDateDATEParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__ExperationDateAssignment_11"


    // $ANTLR start "rule__NonFoodItem__NameAssignment_1"
    // InternalGrocery.g:5067:1: rule__NonFoodItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonFoodItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5071:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5072:2: ( RULE_ID )
            {
            // InternalGrocery.g:5072:2: ( RULE_ID )
            // InternalGrocery.g:5073:3: RULE_ID
            {
             before(grammarAccess.getNonFoodItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__NameAssignment_1"


    // $ANTLR start "rule__NonFoodItem__PriceAssignment_5"
    // InternalGrocery.g:5082:1: rule__NonFoodItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__NonFoodItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5086:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:5087:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:5087:2: ( ruleDECIMAL )
            // InternalGrocery.g:5088:3: ruleDECIMAL
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getNonFoodItemAccess().getPriceDECIMALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__PriceAssignment_5"


    // $ANTLR start "rule__NonFoodItem__QuantityAssignment_8"
    // InternalGrocery.g:5097:1: rule__NonFoodItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__NonFoodItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5101:1: ( ( RULE_INT ) )
            // InternalGrocery.g:5102:2: ( RULE_INT )
            {
            // InternalGrocery.g:5102:2: ( RULE_INT )
            // InternalGrocery.g:5103:3: RULE_INT
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getQuantityINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__QuantityAssignment_8"


    // $ANTLR start "rule__Driver__NameAssignment_1"
    // InternalGrocery.g:5112:1: rule__Driver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Driver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5116:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5117:2: ( RULE_ID )
            {
            // InternalGrocery.g:5117:2: ( RULE_ID )
            // InternalGrocery.g:5118:3: RULE_ID
            {
             before(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__NameAssignment_1"


    // $ANTLR start "rule__Driver__DriverNameAssignment_5"
    // InternalGrocery.g:5127:1: rule__Driver__DriverNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Driver__DriverNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5131:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5132:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5132:2: ( RULE_STRING )
            // InternalGrocery.g:5133:3: RULE_STRING
            {
             before(grammarAccess.getDriverAccess().getDriverNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DriverNameAssignment_5"


    // $ANTLR start "rule__Driver__VehicleAssignment_6"
    // InternalGrocery.g:5142:1: rule__Driver__VehicleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Driver__VehicleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5146:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5147:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5147:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5148:3: ( RULE_ID )
            {
             before(grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0()); 
            // InternalGrocery.g:5149:3: ( RULE_ID )
            // InternalGrocery.g:5150:4: RULE_ID
            {
             before(grammarAccess.getDriverAccess().getVehicleVehicleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getVehicleVehicleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__VehicleAssignment_6"


    // $ANTLR start "rule__Driver__DeliveryAssignment_7"
    // InternalGrocery.g:5161:1: rule__Driver__DeliveryAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Driver__DeliveryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5165:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5166:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5166:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5167:3: ( RULE_ID )
            {
             before(grammarAccess.getDriverAccess().getDeliveryDeliveryCrossReference_7_0()); 
            // InternalGrocery.g:5168:3: ( RULE_ID )
            // InternalGrocery.g:5169:4: RULE_ID
            {
             before(grammarAccess.getDriverAccess().getDeliveryDeliveryIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDeliveryDeliveryIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getDeliveryDeliveryCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DeliveryAssignment_7"


    // $ANTLR start "rule__Employee__NameAssignment_1"
    // InternalGrocery.g:5180:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5184:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5185:2: ( RULE_ID )
            {
            // InternalGrocery.g:5185:2: ( RULE_ID )
            // InternalGrocery.g:5186:3: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__NameAssignment_1"


    // $ANTLR start "rule__Employee__EmployeeNameAssignment_5"
    // InternalGrocery.g:5195:1: rule__Employee__EmployeeNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Employee__EmployeeNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5199:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5200:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5200:2: ( RULE_STRING )
            // InternalGrocery.g:5201:3: RULE_STRING
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__EmployeeNameAssignment_5"


    // $ANTLR start "rule__Employee__StockMovementAssignment_6"
    // InternalGrocery.g:5210:1: rule__Employee__StockMovementAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Employee__StockMovementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5214:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5215:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5215:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5216:3: ( RULE_ID )
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0()); 
            // InternalGrocery.g:5217:3: ( RULE_ID )
            // InternalGrocery.g:5218:4: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementStockMovementIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getStockMovementStockMovementIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__StockMovementAssignment_6"


    // $ANTLR start "rule__Customer__NameAssignment_1"
    // InternalGrocery.g:5229:1: rule__Customer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Customer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5233:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5234:2: ( RULE_ID )
            {
            // InternalGrocery.g:5234:2: ( RULE_ID )
            // InternalGrocery.g:5235:3: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__NameAssignment_1"


    // $ANTLR start "rule__Customer__CustomerNameAssignment_5"
    // InternalGrocery.g:5244:1: rule__Customer__CustomerNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Customer__CustomerNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5248:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5249:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5249:2: ( RULE_STRING )
            // InternalGrocery.g:5250:3: RULE_STRING
            {
             before(grammarAccess.getCustomerAccess().getCustomerNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__CustomerNameAssignment_5"


    // $ANTLR start "rule__Customer__SaleAssignment_6"
    // InternalGrocery.g:5259:1: rule__Customer__SaleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Customer__SaleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5263:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5264:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5264:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5265:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0()); 
            // InternalGrocery.g:5266:3: ( RULE_ID )
            // InternalGrocery.g:5267:4: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getSaleSaleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getSaleSaleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__SaleAssignment_6"


    // $ANTLR start "rule__Supplier__NameAssignment_1"
    // InternalGrocery.g:5278:1: rule__Supplier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Supplier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5282:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5283:2: ( RULE_ID )
            {
            // InternalGrocery.g:5283:2: ( RULE_ID )
            // InternalGrocery.g:5284:3: RULE_ID
            {
             before(grammarAccess.getSupplierAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSupplierAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__NameAssignment_1"


    // $ANTLR start "rule__Supplier__ItemsAssignment_3"
    // InternalGrocery.g:5293:1: rule__Supplier__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Supplier__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5297:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5298:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5298:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5299:3: ( RULE_ID )
            {
             before(grammarAccess.getSupplierAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:5300:3: ( RULE_ID )
            // InternalGrocery.g:5301:4: RULE_ID
            {
             before(grammarAccess.getSupplierAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSupplierAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSupplierAccess().getItemsItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supplier__ItemsAssignment_3"


    // $ANTLR start "rule__Vehicle__NameAssignment_1"
    // InternalGrocery.g:5312:1: rule__Vehicle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5316:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5317:2: ( RULE_ID )
            {
            // InternalGrocery.g:5317:2: ( RULE_ID )
            // InternalGrocery.g:5318:3: RULE_ID
            {
             before(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__NameAssignment_1"


    // $ANTLR start "rule__Vehicle__PlateNumberAssignment_5"
    // InternalGrocery.g:5327:1: rule__Vehicle__PlateNumberAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Vehicle__PlateNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5331:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5332:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5332:2: ( RULE_STRING )
            // InternalGrocery.g:5333:3: RULE_STRING
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getPlateNumberSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__PlateNumberAssignment_5"


    // $ANTLR start "rule__Vehicle__DeliveryAssignment_6"
    // InternalGrocery.g:5342:1: rule__Vehicle__DeliveryAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Vehicle__DeliveryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5346:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5347:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5347:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5348:3: ( RULE_ID )
            {
             before(grammarAccess.getVehicleAccess().getDeliveryDeliveryCrossReference_6_0()); 
            // InternalGrocery.g:5349:3: ( RULE_ID )
            // InternalGrocery.g:5350:4: RULE_ID
            {
             before(grammarAccess.getVehicleAccess().getDeliveryDeliveryIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getDeliveryDeliveryIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getVehicleAccess().getDeliveryDeliveryCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__DeliveryAssignment_6"


    // $ANTLR start "rule__Delivery__NameAssignment_1"
    // InternalGrocery.g:5361:1: rule__Delivery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delivery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5365:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5366:2: ( RULE_ID )
            {
            // InternalGrocery.g:5366:2: ( RULE_ID )
            // InternalGrocery.g:5367:3: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__NameAssignment_1"


    // $ANTLR start "rule__Delivery__FromWarehouseAssignment_5"
    // InternalGrocery.g:5376:1: rule__Delivery__FromWarehouseAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__FromWarehouseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5380:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5381:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5381:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5382:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0()); 
            // InternalGrocery.g:5383:3: ( RULE_ID )
            // InternalGrocery.g:5384:4: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__FromWarehouseAssignment_5"


    // $ANTLR start "rule__Delivery__ToStoreAssignment_8"
    // InternalGrocery.g:5395:1: rule__Delivery__ToStoreAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__ToStoreAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5399:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5400:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5400:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5401:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0()); 
            // InternalGrocery.g:5402:3: ( RULE_ID )
            // InternalGrocery.g:5403:4: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getToStoreStoreIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getToStoreStoreIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__ToStoreAssignment_8"


    // $ANTLR start "rule__Delivery__ItemsAssignment_9"
    // InternalGrocery.g:5414:1: rule__Delivery__ItemsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5418:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5419:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5419:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5420:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0()); 
            // InternalGrocery.g:5421:3: ( RULE_ID )
            // InternalGrocery.g:5422:4: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__ItemsAssignment_9"


    // $ANTLR start "rule__Sale__NameAssignment_1"
    // InternalGrocery.g:5433:1: rule__Sale__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sale__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5437:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5438:2: ( RULE_ID )
            {
            // InternalGrocery.g:5438:2: ( RULE_ID )
            // InternalGrocery.g:5439:3: RULE_ID
            {
             before(grammarAccess.getSaleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__NameAssignment_1"


    // $ANTLR start "rule__Sale__FromShelfAssignment_5"
    // InternalGrocery.g:5448:1: rule__Sale__FromShelfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Sale__FromShelfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5452:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5453:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5453:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5454:3: ( RULE_ID )
            {
             before(grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0()); 
            // InternalGrocery.g:5455:3: ( RULE_ID )
            // InternalGrocery.g:5456:4: RULE_ID
            {
             before(grammarAccess.getSaleAccess().getFromShelfShelfIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getFromShelfShelfIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__FromShelfAssignment_5"


    // $ANTLR start "rule__Sale__ItemsAssignment_6"
    // InternalGrocery.g:5467:1: rule__Sale__ItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Sale__ItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5471:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5472:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5472:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5473:3: ( RULE_ID )
            {
             before(grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0()); 
            // InternalGrocery.g:5474:3: ( RULE_ID )
            // InternalGrocery.g:5475:4: RULE_ID
            {
             before(grammarAccess.getSaleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__ItemsAssignment_6"


    // $ANTLR start "rule__StockMovement__NameAssignment_1"
    // InternalGrocery.g:5486:1: rule__StockMovement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StockMovement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5490:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5491:2: ( RULE_ID )
            {
            // InternalGrocery.g:5491:2: ( RULE_ID )
            // InternalGrocery.g:5492:3: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__NameAssignment_1"


    // $ANTLR start "rule__StockMovement__FromBackroomAssignment_5"
    // InternalGrocery.g:5501:1: rule__StockMovement__FromBackroomAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__FromBackroomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5505:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5506:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5506:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5507:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0()); 
            // InternalGrocery.g:5508:3: ( RULE_ID )
            // InternalGrocery.g:5509:4: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomBackroomIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getFromBackroomBackroomIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__FromBackroomAssignment_5"


    // $ANTLR start "rule__StockMovement__ToShelfAssignment_8"
    // InternalGrocery.g:5520:1: rule__StockMovement__ToShelfAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__ToShelfAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5524:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5525:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5525:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5526:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0()); 
            // InternalGrocery.g:5527:3: ( RULE_ID )
            // InternalGrocery.g:5528:4: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getToShelfShelfIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getToShelfShelfIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__ToShelfAssignment_8"


    // $ANTLR start "rule__StockMovement__ItemsAssignment_9"
    // InternalGrocery.g:5539:1: rule__StockMovement__ItemsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5543:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5544:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5544:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5545:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0()); 
            // InternalGrocery.g:5546:3: ( RULE_ID )
            // InternalGrocery.g:5547:4: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__ItemsAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000007768F24002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});

}