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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'supplier'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "'quantity'", "'perishableItem'", "'experationDate'", "'nonFoodItem'", "'driver'", "'name'", "'employee'", "'customer'", "'vehicle'", "'plateNumber'", "'delivery'", "'sale'", "'stock'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=17 && LA1_0<=20)||LA1_0==23||(LA1_0>=25 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=30)||(LA1_0>=32 && LA1_0<=34)) ) {
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


    // $ANTLR start "entryRuleNonPerishableItem"
    // InternalGrocery.g:378:1: entryRuleNonPerishableItem : ruleNonPerishableItem EOF ;
    public final void entryRuleNonPerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:379:1: ( ruleNonPerishableItem EOF )
            // InternalGrocery.g:380:1: ruleNonPerishableItem EOF
            {
             before(grammarAccess.getNonPerishableItemRule()); 
            pushFollow(FOLLOW_1);
            ruleNonPerishableItem();

            state._fsp--;

             after(grammarAccess.getNonPerishableItemRule()); 
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
    // $ANTLR end "entryRuleNonPerishableItem"


    // $ANTLR start "ruleNonPerishableItem"
    // InternalGrocery.g:387:1: ruleNonPerishableItem : ( ( rule__NonPerishableItem__Group__0 ) ) ;
    public final void ruleNonPerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:391:2: ( ( ( rule__NonPerishableItem__Group__0 ) ) )
            // InternalGrocery.g:392:2: ( ( rule__NonPerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:392:2: ( ( rule__NonPerishableItem__Group__0 ) )
            // InternalGrocery.g:393:3: ( rule__NonPerishableItem__Group__0 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:394:3: ( rule__NonPerishableItem__Group__0 )
            // InternalGrocery.g:394:4: rule__NonPerishableItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getGroup()); 

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
    // $ANTLR end "ruleNonPerishableItem"


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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalGrocery.g:727:1: rule__AbstractElement__Alternatives : ( ( ruleBuilding ) | ( ruleMovementElement ) | ( ruleMovement ) | ( ruleItem ) | ( ruleStoreElements ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:731:1: ( ( ruleBuilding ) | ( ruleMovementElement ) | ( ruleMovement ) | ( ruleItem ) | ( ruleStoreElements ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
            case 14:
                {
                alt2=1;
                }
                break;
            case 17:
            case 26:
            case 28:
            case 29:
            case 30:
                {
                alt2=2;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt2=3;
                }
                break;
            case 20:
            case 23:
            case 25:
                {
                alt2=4;
                }
                break;
            case 18:
            case 19:
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
                    // InternalGrocery.g:732:2: ( ruleBuilding )
                    {
                    // InternalGrocery.g:732:2: ( ruleBuilding )
                    // InternalGrocery.g:733:3: ruleBuilding
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
                    // InternalGrocery.g:738:2: ( ruleMovementElement )
                    {
                    // InternalGrocery.g:738:2: ( ruleMovementElement )
                    // InternalGrocery.g:739:3: ruleMovementElement
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
                    // InternalGrocery.g:744:2: ( ruleMovement )
                    {
                    // InternalGrocery.g:744:2: ( ruleMovement )
                    // InternalGrocery.g:745:3: ruleMovement
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
                    // InternalGrocery.g:750:2: ( ruleItem )
                    {
                    // InternalGrocery.g:750:2: ( ruleItem )
                    // InternalGrocery.g:751:3: ruleItem
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
                    // InternalGrocery.g:756:2: ( ruleStoreElements )
                    {
                    // InternalGrocery.g:756:2: ( ruleStoreElements )
                    // InternalGrocery.g:757:3: ruleStoreElements
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
    // InternalGrocery.g:766:1: rule__Building__Alternatives : ( ( ruleStore ) | ( ruleWarehouse ) );
    public final void rule__Building__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:770:1: ( ( ruleStore ) | ( ruleWarehouse ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:771:2: ( ruleStore )
                    {
                    // InternalGrocery.g:771:2: ( ruleStore )
                    // InternalGrocery.g:772:3: ruleStore
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
                    // InternalGrocery.g:777:2: ( ruleWarehouse )
                    {
                    // InternalGrocery.g:777:2: ( ruleWarehouse )
                    // InternalGrocery.g:778:3: ruleWarehouse
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
    // InternalGrocery.g:787:1: rule__StoreElements__Alternatives : ( ( ruleBackroom ) | ( ruleShelf ) );
    public final void rule__StoreElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:791:1: ( ( ruleBackroom ) | ( ruleShelf ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:792:2: ( ruleBackroom )
                    {
                    // InternalGrocery.g:792:2: ( ruleBackroom )
                    // InternalGrocery.g:793:3: ruleBackroom
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
                    // InternalGrocery.g:798:2: ( ruleShelf )
                    {
                    // InternalGrocery.g:798:2: ( ruleShelf )
                    // InternalGrocery.g:799:3: ruleShelf
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
    // InternalGrocery.g:808:1: rule__MovementElement__Alternatives : ( ( rulePerson ) | ( ruleVehicle ) | ( ruleSupplier ) );
    public final void rule__MovementElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:812:1: ( ( rulePerson ) | ( ruleVehicle ) | ( ruleSupplier ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
            case 28:
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 17:
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
                    // InternalGrocery.g:813:2: ( rulePerson )
                    {
                    // InternalGrocery.g:813:2: ( rulePerson )
                    // InternalGrocery.g:814:3: rulePerson
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
                    // InternalGrocery.g:819:2: ( ruleVehicle )
                    {
                    // InternalGrocery.g:819:2: ( ruleVehicle )
                    // InternalGrocery.g:820:3: ruleVehicle
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
                    // InternalGrocery.g:825:2: ( ruleSupplier )
                    {
                    // InternalGrocery.g:825:2: ( ruleSupplier )
                    // InternalGrocery.g:826:3: ruleSupplier
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
    // InternalGrocery.g:835:1: rule__Person__Alternatives : ( ( ruleDriver ) | ( ruleEmployee ) | ( ruleCustomer ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:839:1: ( ( ruleDriver ) | ( ruleEmployee ) | ( ruleCustomer ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
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
                    // InternalGrocery.g:840:2: ( ruleDriver )
                    {
                    // InternalGrocery.g:840:2: ( ruleDriver )
                    // InternalGrocery.g:841:3: ruleDriver
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
                    // InternalGrocery.g:846:2: ( ruleEmployee )
                    {
                    // InternalGrocery.g:846:2: ( ruleEmployee )
                    // InternalGrocery.g:847:3: ruleEmployee
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
                    // InternalGrocery.g:852:2: ( ruleCustomer )
                    {
                    // InternalGrocery.g:852:2: ( ruleCustomer )
                    // InternalGrocery.g:853:3: ruleCustomer
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
    // InternalGrocery.g:862:1: rule__Item__Alternatives : ( ( ruleFoodItem ) | ( ruleNonFoodItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:866:1: ( ( ruleFoodItem ) | ( ruleNonFoodItem ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20||LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGrocery.g:867:2: ( ruleFoodItem )
                    {
                    // InternalGrocery.g:867:2: ( ruleFoodItem )
                    // InternalGrocery.g:868:3: ruleFoodItem
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
                    // InternalGrocery.g:873:2: ( ruleNonFoodItem )
                    {
                    // InternalGrocery.g:873:2: ( ruleNonFoodItem )
                    // InternalGrocery.g:874:3: ruleNonFoodItem
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
    // InternalGrocery.g:883:1: rule__FoodItem__Alternatives : ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) );
    public final void rule__FoodItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:887:1: ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGrocery.g:888:2: ( rulePerishableItem )
                    {
                    // InternalGrocery.g:888:2: ( rulePerishableItem )
                    // InternalGrocery.g:889:3: rulePerishableItem
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
                    // InternalGrocery.g:894:2: ( ruleNonPerishableItem )
                    {
                    // InternalGrocery.g:894:2: ( ruleNonPerishableItem )
                    // InternalGrocery.g:895:3: ruleNonPerishableItem
                    {
                     before(grammarAccess.getFoodItemAccess().getNonPerishableItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonPerishableItem();

                    state._fsp--;

                     after(grammarAccess.getFoodItemAccess().getNonPerishableItemParserRuleCall_1()); 

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
    // InternalGrocery.g:904:1: rule__Movement__Alternatives : ( ( ruleDelivery ) | ( ruleSale ) | ( ruleStockMovement ) );
    public final void rule__Movement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:908:1: ( ( ruleDelivery ) | ( ruleSale ) | ( ruleStockMovement ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
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
                    // InternalGrocery.g:909:2: ( ruleDelivery )
                    {
                    // InternalGrocery.g:909:2: ( ruleDelivery )
                    // InternalGrocery.g:910:3: ruleDelivery
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
                    // InternalGrocery.g:915:2: ( ruleSale )
                    {
                    // InternalGrocery.g:915:2: ( ruleSale )
                    // InternalGrocery.g:916:3: ruleSale
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
                    // InternalGrocery.g:921:2: ( ruleStockMovement )
                    {
                    // InternalGrocery.g:921:2: ( ruleStockMovement )
                    // InternalGrocery.g:922:3: ruleStockMovement
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


    // $ANTLR start "rule__Store__Group__0"
    // InternalGrocery.g:931:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:935:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalGrocery.g:936:2: rule__Store__Group__0__Impl rule__Store__Group__1
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
    // InternalGrocery.g:943:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:947:1: ( ( 'store' ) )
            // InternalGrocery.g:948:1: ( 'store' )
            {
            // InternalGrocery.g:948:1: ( 'store' )
            // InternalGrocery.g:949:2: 'store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalGrocery.g:958:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:962:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalGrocery.g:963:2: rule__Store__Group__1__Impl rule__Store__Group__2
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
    // InternalGrocery.g:970:1: rule__Store__Group__1__Impl : ( ( rule__Store__NameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:974:1: ( ( ( rule__Store__NameAssignment_1 ) ) )
            // InternalGrocery.g:975:1: ( ( rule__Store__NameAssignment_1 ) )
            {
            // InternalGrocery.g:975:1: ( ( rule__Store__NameAssignment_1 ) )
            // InternalGrocery.g:976:2: ( rule__Store__NameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_1()); 
            // InternalGrocery.g:977:2: ( rule__Store__NameAssignment_1 )
            // InternalGrocery.g:977:3: rule__Store__NameAssignment_1
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
    // InternalGrocery.g:985:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:989:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalGrocery.g:990:2: rule__Store__Group__2__Impl rule__Store__Group__3
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
    // InternalGrocery.g:997:1: rule__Store__Group__2__Impl : ( '{' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1001:1: ( ( '{' ) )
            // InternalGrocery.g:1002:1: ( '{' )
            {
            // InternalGrocery.g:1002:1: ( '{' )
            // InternalGrocery.g:1003:2: '{'
            {
             before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:1012:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1016:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalGrocery.g:1017:2: rule__Store__Group__3__Impl rule__Store__Group__4
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
    // InternalGrocery.g:1024:1: rule__Store__Group__3__Impl : ( ( rule__Store__ElementsAssignment_3 )* ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1028:1: ( ( ( rule__Store__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:1029:1: ( ( rule__Store__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:1029:1: ( ( rule__Store__ElementsAssignment_3 )* )
            // InternalGrocery.g:1030:2: ( rule__Store__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:1031:2: ( rule__Store__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrocery.g:1031:3: rule__Store__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Store__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGrocery.g:1039:1: rule__Store__Group__4 : rule__Store__Group__4__Impl ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1043:1: ( rule__Store__Group__4__Impl )
            // InternalGrocery.g:1044:2: rule__Store__Group__4__Impl
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
    // InternalGrocery.g:1050:1: rule__Store__Group__4__Impl : ( '}' ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1054:1: ( ( '}' ) )
            // InternalGrocery.g:1055:1: ( '}' )
            {
            // InternalGrocery.g:1055:1: ( '}' )
            // InternalGrocery.g:1056:2: '}'
            {
             before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:1066:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1070:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalGrocery.g:1071:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
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
    // InternalGrocery.g:1078:1: rule__Warehouse__Group__0__Impl : ( 'warehouse' ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1082:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:1083:1: ( 'warehouse' )
            {
            // InternalGrocery.g:1083:1: ( 'warehouse' )
            // InternalGrocery.g:1084:2: 'warehouse'
            {
             before(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGrocery.g:1093:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1097:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalGrocery.g:1098:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
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
    // InternalGrocery.g:1105:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__NameAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1109:1: ( ( ( rule__Warehouse__NameAssignment_1 ) ) )
            // InternalGrocery.g:1110:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1110:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            // InternalGrocery.g:1111:2: ( rule__Warehouse__NameAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1112:2: ( rule__Warehouse__NameAssignment_1 )
            // InternalGrocery.g:1112:3: rule__Warehouse__NameAssignment_1
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
    // InternalGrocery.g:1120:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1124:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalGrocery.g:1125:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
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
    // InternalGrocery.g:1132:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1136:1: ( ( '{' ) )
            // InternalGrocery.g:1137:1: ( '{' )
            {
            // InternalGrocery.g:1137:1: ( '{' )
            // InternalGrocery.g:1138:2: '{'
            {
             before(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:1147:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1151:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalGrocery.g:1152:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
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
    // InternalGrocery.g:1159:1: rule__Warehouse__Group__3__Impl : ( 'address' ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1163:1: ( ( 'address' ) )
            // InternalGrocery.g:1164:1: ( 'address' )
            {
            // InternalGrocery.g:1164:1: ( 'address' )
            // InternalGrocery.g:1165:2: 'address'
            {
             before(grammarAccess.getWarehouseAccess().getAddressKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGrocery.g:1174:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1178:1: ( rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 )
            // InternalGrocery.g:1179:2: rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5
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
    // InternalGrocery.g:1186:1: rule__Warehouse__Group__4__Impl : ( ':' ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1190:1: ( ( ':' ) )
            // InternalGrocery.g:1191:1: ( ':' )
            {
            // InternalGrocery.g:1191:1: ( ':' )
            // InternalGrocery.g:1192:2: ':'
            {
             before(grammarAccess.getWarehouseAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:1201:1: rule__Warehouse__Group__5 : rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 ;
    public final void rule__Warehouse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1205:1: ( rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 )
            // InternalGrocery.g:1206:2: rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6
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
    // InternalGrocery.g:1213:1: rule__Warehouse__Group__5__Impl : ( ( rule__Warehouse__AddressAssignment_5 ) ) ;
    public final void rule__Warehouse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1217:1: ( ( ( rule__Warehouse__AddressAssignment_5 ) ) )
            // InternalGrocery.g:1218:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            {
            // InternalGrocery.g:1218:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            // InternalGrocery.g:1219:2: ( rule__Warehouse__AddressAssignment_5 )
            {
             before(grammarAccess.getWarehouseAccess().getAddressAssignment_5()); 
            // InternalGrocery.g:1220:2: ( rule__Warehouse__AddressAssignment_5 )
            // InternalGrocery.g:1220:3: rule__Warehouse__AddressAssignment_5
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
    // InternalGrocery.g:1228:1: rule__Warehouse__Group__6 : rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 ;
    public final void rule__Warehouse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1232:1: ( rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 )
            // InternalGrocery.g:1233:2: rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7
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
    // InternalGrocery.g:1240:1: rule__Warehouse__Group__6__Impl : ( 'supplier' ) ;
    public final void rule__Warehouse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1244:1: ( ( 'supplier' ) )
            // InternalGrocery.g:1245:1: ( 'supplier' )
            {
            // InternalGrocery.g:1245:1: ( 'supplier' )
            // InternalGrocery.g:1246:2: 'supplier'
            {
             before(grammarAccess.getWarehouseAccess().getSupplierKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGrocery.g:1255:1: rule__Warehouse__Group__7 : rule__Warehouse__Group__7__Impl rule__Warehouse__Group__8 ;
    public final void rule__Warehouse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1259:1: ( rule__Warehouse__Group__7__Impl rule__Warehouse__Group__8 )
            // InternalGrocery.g:1260:2: rule__Warehouse__Group__7__Impl rule__Warehouse__Group__8
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
    // InternalGrocery.g:1267:1: rule__Warehouse__Group__7__Impl : ( ':' ) ;
    public final void rule__Warehouse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1271:1: ( ( ':' ) )
            // InternalGrocery.g:1272:1: ( ':' )
            {
            // InternalGrocery.g:1272:1: ( ':' )
            // InternalGrocery.g:1273:2: ':'
            {
             before(grammarAccess.getWarehouseAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:1282:1: rule__Warehouse__Group__8 : rule__Warehouse__Group__8__Impl rule__Warehouse__Group__9 ;
    public final void rule__Warehouse__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1286:1: ( rule__Warehouse__Group__8__Impl rule__Warehouse__Group__9 )
            // InternalGrocery.g:1287:2: rule__Warehouse__Group__8__Impl rule__Warehouse__Group__9
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
    // InternalGrocery.g:1294:1: rule__Warehouse__Group__8__Impl : ( ( rule__Warehouse__SupplierAssignment_8 ) ) ;
    public final void rule__Warehouse__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1298:1: ( ( ( rule__Warehouse__SupplierAssignment_8 ) ) )
            // InternalGrocery.g:1299:1: ( ( rule__Warehouse__SupplierAssignment_8 ) )
            {
            // InternalGrocery.g:1299:1: ( ( rule__Warehouse__SupplierAssignment_8 ) )
            // InternalGrocery.g:1300:2: ( rule__Warehouse__SupplierAssignment_8 )
            {
             before(grammarAccess.getWarehouseAccess().getSupplierAssignment_8()); 
            // InternalGrocery.g:1301:2: ( rule__Warehouse__SupplierAssignment_8 )
            // InternalGrocery.g:1301:3: rule__Warehouse__SupplierAssignment_8
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
    // InternalGrocery.g:1309:1: rule__Warehouse__Group__9 : rule__Warehouse__Group__9__Impl ;
    public final void rule__Warehouse__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1313:1: ( rule__Warehouse__Group__9__Impl )
            // InternalGrocery.g:1314:2: rule__Warehouse__Group__9__Impl
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
    // InternalGrocery.g:1320:1: rule__Warehouse__Group__9__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1324:1: ( ( '}' ) )
            // InternalGrocery.g:1325:1: ( '}' )
            {
            // InternalGrocery.g:1325:1: ( '}' )
            // InternalGrocery.g:1326:2: '}'
            {
             before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:1336:1: rule__Shelf__Group__0 : rule__Shelf__Group__0__Impl rule__Shelf__Group__1 ;
    public final void rule__Shelf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1340:1: ( rule__Shelf__Group__0__Impl rule__Shelf__Group__1 )
            // InternalGrocery.g:1341:2: rule__Shelf__Group__0__Impl rule__Shelf__Group__1
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
    // InternalGrocery.g:1348:1: rule__Shelf__Group__0__Impl : ( 'shelf' ) ;
    public final void rule__Shelf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1352:1: ( ( 'shelf' ) )
            // InternalGrocery.g:1353:1: ( 'shelf' )
            {
            // InternalGrocery.g:1353:1: ( 'shelf' )
            // InternalGrocery.g:1354:2: 'shelf'
            {
             before(grammarAccess.getShelfAccess().getShelfKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGrocery.g:1363:1: rule__Shelf__Group__1 : rule__Shelf__Group__1__Impl rule__Shelf__Group__2 ;
    public final void rule__Shelf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1367:1: ( rule__Shelf__Group__1__Impl rule__Shelf__Group__2 )
            // InternalGrocery.g:1368:2: rule__Shelf__Group__1__Impl rule__Shelf__Group__2
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
    // InternalGrocery.g:1375:1: rule__Shelf__Group__1__Impl : ( ( rule__Shelf__NameAssignment_1 ) ) ;
    public final void rule__Shelf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1379:1: ( ( ( rule__Shelf__NameAssignment_1 ) ) )
            // InternalGrocery.g:1380:1: ( ( rule__Shelf__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1380:1: ( ( rule__Shelf__NameAssignment_1 ) )
            // InternalGrocery.g:1381:2: ( rule__Shelf__NameAssignment_1 )
            {
             before(grammarAccess.getShelfAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1382:2: ( rule__Shelf__NameAssignment_1 )
            // InternalGrocery.g:1382:3: rule__Shelf__NameAssignment_1
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
    // InternalGrocery.g:1390:1: rule__Shelf__Group__2 : rule__Shelf__Group__2__Impl rule__Shelf__Group__3 ;
    public final void rule__Shelf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1394:1: ( rule__Shelf__Group__2__Impl rule__Shelf__Group__3 )
            // InternalGrocery.g:1395:2: rule__Shelf__Group__2__Impl rule__Shelf__Group__3
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
    // InternalGrocery.g:1402:1: rule__Shelf__Group__2__Impl : ( '{' ) ;
    public final void rule__Shelf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1406:1: ( ( '{' ) )
            // InternalGrocery.g:1407:1: ( '{' )
            {
            // InternalGrocery.g:1407:1: ( '{' )
            // InternalGrocery.g:1408:2: '{'
            {
             before(grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:1417:1: rule__Shelf__Group__3 : rule__Shelf__Group__3__Impl rule__Shelf__Group__4 ;
    public final void rule__Shelf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1421:1: ( rule__Shelf__Group__3__Impl rule__Shelf__Group__4 )
            // InternalGrocery.g:1422:2: rule__Shelf__Group__3__Impl rule__Shelf__Group__4
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
    // InternalGrocery.g:1429:1: rule__Shelf__Group__3__Impl : ( ( rule__Shelf__ItemsAssignment_3 )* ) ;
    public final void rule__Shelf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1433:1: ( ( ( rule__Shelf__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:1434:1: ( ( rule__Shelf__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:1434:1: ( ( rule__Shelf__ItemsAssignment_3 )* )
            // InternalGrocery.g:1435:2: ( rule__Shelf__ItemsAssignment_3 )*
            {
             before(grammarAccess.getShelfAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:1436:2: ( rule__Shelf__ItemsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrocery.g:1436:3: rule__Shelf__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Shelf__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalGrocery.g:1444:1: rule__Shelf__Group__4 : rule__Shelf__Group__4__Impl ;
    public final void rule__Shelf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1448:1: ( rule__Shelf__Group__4__Impl )
            // InternalGrocery.g:1449:2: rule__Shelf__Group__4__Impl
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
    // InternalGrocery.g:1455:1: rule__Shelf__Group__4__Impl : ( '}' ) ;
    public final void rule__Shelf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1459:1: ( ( '}' ) )
            // InternalGrocery.g:1460:1: ( '}' )
            {
            // InternalGrocery.g:1460:1: ( '}' )
            // InternalGrocery.g:1461:2: '}'
            {
             before(grammarAccess.getShelfAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:1471:1: rule__Backroom__Group__0 : rule__Backroom__Group__0__Impl rule__Backroom__Group__1 ;
    public final void rule__Backroom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1475:1: ( rule__Backroom__Group__0__Impl rule__Backroom__Group__1 )
            // InternalGrocery.g:1476:2: rule__Backroom__Group__0__Impl rule__Backroom__Group__1
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
    // InternalGrocery.g:1483:1: rule__Backroom__Group__0__Impl : ( 'backroom' ) ;
    public final void rule__Backroom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1487:1: ( ( 'backroom' ) )
            // InternalGrocery.g:1488:1: ( 'backroom' )
            {
            // InternalGrocery.g:1488:1: ( 'backroom' )
            // InternalGrocery.g:1489:2: 'backroom'
            {
             before(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGrocery.g:1498:1: rule__Backroom__Group__1 : rule__Backroom__Group__1__Impl rule__Backroom__Group__2 ;
    public final void rule__Backroom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1502:1: ( rule__Backroom__Group__1__Impl rule__Backroom__Group__2 )
            // InternalGrocery.g:1503:2: rule__Backroom__Group__1__Impl rule__Backroom__Group__2
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
    // InternalGrocery.g:1510:1: rule__Backroom__Group__1__Impl : ( ( rule__Backroom__NameAssignment_1 ) ) ;
    public final void rule__Backroom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1514:1: ( ( ( rule__Backroom__NameAssignment_1 ) ) )
            // InternalGrocery.g:1515:1: ( ( rule__Backroom__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1515:1: ( ( rule__Backroom__NameAssignment_1 ) )
            // InternalGrocery.g:1516:2: ( rule__Backroom__NameAssignment_1 )
            {
             before(grammarAccess.getBackroomAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1517:2: ( rule__Backroom__NameAssignment_1 )
            // InternalGrocery.g:1517:3: rule__Backroom__NameAssignment_1
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
    // InternalGrocery.g:1525:1: rule__Backroom__Group__2 : rule__Backroom__Group__2__Impl rule__Backroom__Group__3 ;
    public final void rule__Backroom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1529:1: ( rule__Backroom__Group__2__Impl rule__Backroom__Group__3 )
            // InternalGrocery.g:1530:2: rule__Backroom__Group__2__Impl rule__Backroom__Group__3
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
    // InternalGrocery.g:1537:1: rule__Backroom__Group__2__Impl : ( '{' ) ;
    public final void rule__Backroom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1541:1: ( ( '{' ) )
            // InternalGrocery.g:1542:1: ( '{' )
            {
            // InternalGrocery.g:1542:1: ( '{' )
            // InternalGrocery.g:1543:2: '{'
            {
             before(grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:1552:1: rule__Backroom__Group__3 : rule__Backroom__Group__3__Impl rule__Backroom__Group__4 ;
    public final void rule__Backroom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1556:1: ( rule__Backroom__Group__3__Impl rule__Backroom__Group__4 )
            // InternalGrocery.g:1557:2: rule__Backroom__Group__3__Impl rule__Backroom__Group__4
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
    // InternalGrocery.g:1564:1: rule__Backroom__Group__3__Impl : ( ( rule__Backroom__ItemsAssignment_3 )* ) ;
    public final void rule__Backroom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1568:1: ( ( ( rule__Backroom__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:1569:1: ( ( rule__Backroom__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:1569:1: ( ( rule__Backroom__ItemsAssignment_3 )* )
            // InternalGrocery.g:1570:2: ( rule__Backroom__ItemsAssignment_3 )*
            {
             before(grammarAccess.getBackroomAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:1571:2: ( rule__Backroom__ItemsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGrocery.g:1571:3: rule__Backroom__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Backroom__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalGrocery.g:1579:1: rule__Backroom__Group__4 : rule__Backroom__Group__4__Impl ;
    public final void rule__Backroom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1583:1: ( rule__Backroom__Group__4__Impl )
            // InternalGrocery.g:1584:2: rule__Backroom__Group__4__Impl
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
    // InternalGrocery.g:1590:1: rule__Backroom__Group__4__Impl : ( '}' ) ;
    public final void rule__Backroom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1594:1: ( ( '}' ) )
            // InternalGrocery.g:1595:1: ( '}' )
            {
            // InternalGrocery.g:1595:1: ( '}' )
            // InternalGrocery.g:1596:2: '}'
            {
             before(grammarAccess.getBackroomAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__NonPerishableItem__Group__0"
    // InternalGrocery.g:1606:1: rule__NonPerishableItem__Group__0 : rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 ;
    public final void rule__NonPerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1610:1: ( rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 )
            // InternalGrocery.g:1611:2: rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NonPerishableItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__1();

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
    // $ANTLR end "rule__NonPerishableItem__Group__0"


    // $ANTLR start "rule__NonPerishableItem__Group__0__Impl"
    // InternalGrocery.g:1618:1: rule__NonPerishableItem__Group__0__Impl : ( 'nonPerishableItem' ) ;
    public final void rule__NonPerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1622:1: ( ( 'nonPerishableItem' ) )
            // InternalGrocery.g:1623:1: ( 'nonPerishableItem' )
            {
            // InternalGrocery.g:1623:1: ( 'nonPerishableItem' )
            // InternalGrocery.g:1624:2: 'nonPerishableItem'
            {
             before(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__0__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__1"
    // InternalGrocery.g:1633:1: rule__NonPerishableItem__Group__1 : rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 ;
    public final void rule__NonPerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1637:1: ( rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 )
            // InternalGrocery.g:1638:2: rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NonPerishableItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__2();

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
    // $ANTLR end "rule__NonPerishableItem__Group__1"


    // $ANTLR start "rule__NonPerishableItem__Group__1__Impl"
    // InternalGrocery.g:1645:1: rule__NonPerishableItem__Group__1__Impl : ( ( rule__NonPerishableItem__NameAssignment_1 ) ) ;
    public final void rule__NonPerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1649:1: ( ( ( rule__NonPerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1650:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1650:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1651:2: ( rule__NonPerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1652:2: ( rule__NonPerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1652:3: rule__NonPerishableItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__1__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__2"
    // InternalGrocery.g:1660:1: rule__NonPerishableItem__Group__2 : rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 ;
    public final void rule__NonPerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1664:1: ( rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 )
            // InternalGrocery.g:1665:2: rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NonPerishableItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__3();

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
    // $ANTLR end "rule__NonPerishableItem__Group__2"


    // $ANTLR start "rule__NonPerishableItem__Group__2__Impl"
    // InternalGrocery.g:1672:1: rule__NonPerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonPerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1676:1: ( ( '{' ) )
            // InternalGrocery.g:1677:1: ( '{' )
            {
            // InternalGrocery.g:1677:1: ( '{' )
            // InternalGrocery.g:1678:2: '{'
            {
             before(grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__2__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__3"
    // InternalGrocery.g:1687:1: rule__NonPerishableItem__Group__3 : rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 ;
    public final void rule__NonPerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1691:1: ( rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 )
            // InternalGrocery.g:1692:2: rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__NonPerishableItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__4();

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
    // $ANTLR end "rule__NonPerishableItem__Group__3"


    // $ANTLR start "rule__NonPerishableItem__Group__3__Impl"
    // InternalGrocery.g:1699:1: rule__NonPerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonPerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1703:1: ( ( 'price' ) )
            // InternalGrocery.g:1704:1: ( 'price' )
            {
            // InternalGrocery.g:1704:1: ( 'price' )
            // InternalGrocery.g:1705:2: 'price'
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__3__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__4"
    // InternalGrocery.g:1714:1: rule__NonPerishableItem__Group__4 : rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 ;
    public final void rule__NonPerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1718:1: ( rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 )
            // InternalGrocery.g:1719:2: rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__NonPerishableItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__5();

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
    // $ANTLR end "rule__NonPerishableItem__Group__4"


    // $ANTLR start "rule__NonPerishableItem__Group__4__Impl"
    // InternalGrocery.g:1726:1: rule__NonPerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1730:1: ( ( ':' ) )
            // InternalGrocery.g:1731:1: ( ':' )
            {
            // InternalGrocery.g:1731:1: ( ':' )
            // InternalGrocery.g:1732:2: ':'
            {
             before(grammarAccess.getNonPerishableItemAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__4__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__5"
    // InternalGrocery.g:1741:1: rule__NonPerishableItem__Group__5 : rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 ;
    public final void rule__NonPerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1745:1: ( rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 )
            // InternalGrocery.g:1746:2: rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__NonPerishableItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__6();

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
    // $ANTLR end "rule__NonPerishableItem__Group__5"


    // $ANTLR start "rule__NonPerishableItem__Group__5__Impl"
    // InternalGrocery.g:1753:1: rule__NonPerishableItem__Group__5__Impl : ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__NonPerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1757:1: ( ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1758:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1758:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:1759:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1760:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:1760:3: rule__NonPerishableItem__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_5()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__5__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__6"
    // InternalGrocery.g:1768:1: rule__NonPerishableItem__Group__6 : rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7 ;
    public final void rule__NonPerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1772:1: ( rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7 )
            // InternalGrocery.g:1773:2: rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__NonPerishableItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__7();

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
    // $ANTLR end "rule__NonPerishableItem__Group__6"


    // $ANTLR start "rule__NonPerishableItem__Group__6__Impl"
    // InternalGrocery.g:1780:1: rule__NonPerishableItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__NonPerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1784:1: ( ( 'quantity' ) )
            // InternalGrocery.g:1785:1: ( 'quantity' )
            {
            // InternalGrocery.g:1785:1: ( 'quantity' )
            // InternalGrocery.g:1786:2: 'quantity'
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__6__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__7"
    // InternalGrocery.g:1795:1: rule__NonPerishableItem__Group__7 : rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8 ;
    public final void rule__NonPerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1799:1: ( rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8 )
            // InternalGrocery.g:1800:2: rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__NonPerishableItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__8();

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
    // $ANTLR end "rule__NonPerishableItem__Group__7"


    // $ANTLR start "rule__NonPerishableItem__Group__7__Impl"
    // InternalGrocery.g:1807:1: rule__NonPerishableItem__Group__7__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1811:1: ( ( ':' ) )
            // InternalGrocery.g:1812:1: ( ':' )
            {
            // InternalGrocery.g:1812:1: ( ':' )
            // InternalGrocery.g:1813:2: ':'
            {
             before(grammarAccess.getNonPerishableItemAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__7__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__8"
    // InternalGrocery.g:1822:1: rule__NonPerishableItem__Group__8 : rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9 ;
    public final void rule__NonPerishableItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1826:1: ( rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9 )
            // InternalGrocery.g:1827:2: rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__NonPerishableItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__9();

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
    // $ANTLR end "rule__NonPerishableItem__Group__8"


    // $ANTLR start "rule__NonPerishableItem__Group__8__Impl"
    // InternalGrocery.g:1834:1: rule__NonPerishableItem__Group__8__Impl : ( ( rule__NonPerishableItem__QuantityAssignment_8 ) ) ;
    public final void rule__NonPerishableItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1838:1: ( ( ( rule__NonPerishableItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:1839:1: ( ( rule__NonPerishableItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:1839:1: ( ( rule__NonPerishableItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:1840:2: ( rule__NonPerishableItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:1841:2: ( rule__NonPerishableItem__QuantityAssignment_8 )
            // InternalGrocery.g:1841:3: rule__NonPerishableItem__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getQuantityAssignment_8()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__8__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__9"
    // InternalGrocery.g:1849:1: rule__NonPerishableItem__Group__9 : rule__NonPerishableItem__Group__9__Impl ;
    public final void rule__NonPerishableItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1853:1: ( rule__NonPerishableItem__Group__9__Impl )
            // InternalGrocery.g:1854:2: rule__NonPerishableItem__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__9__Impl();

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
    // $ANTLR end "rule__NonPerishableItem__Group__9"


    // $ANTLR start "rule__NonPerishableItem__Group__9__Impl"
    // InternalGrocery.g:1860:1: rule__NonPerishableItem__Group__9__Impl : ( '}' ) ;
    public final void rule__NonPerishableItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1864:1: ( ( '}' ) )
            // InternalGrocery.g:1865:1: ( '}' )
            {
            // InternalGrocery.g:1865:1: ( '}' )
            // InternalGrocery.g:1866:2: '}'
            {
             before(grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__9__Impl"


    // $ANTLR start "rule__PerishableItem__Group__0"
    // InternalGrocery.g:1876:1: rule__PerishableItem__Group__0 : rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 ;
    public final void rule__PerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1880:1: ( rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 )
            // InternalGrocery.g:1881:2: rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1
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
    // InternalGrocery.g:1888:1: rule__PerishableItem__Group__0__Impl : ( 'perishableItem' ) ;
    public final void rule__PerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1892:1: ( ( 'perishableItem' ) )
            // InternalGrocery.g:1893:1: ( 'perishableItem' )
            {
            // InternalGrocery.g:1893:1: ( 'perishableItem' )
            // InternalGrocery.g:1894:2: 'perishableItem'
            {
             before(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGrocery.g:1903:1: rule__PerishableItem__Group__1 : rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 ;
    public final void rule__PerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1907:1: ( rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 )
            // InternalGrocery.g:1908:2: rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2
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
    // InternalGrocery.g:1915:1: rule__PerishableItem__Group__1__Impl : ( ( rule__PerishableItem__NameAssignment_1 ) ) ;
    public final void rule__PerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1919:1: ( ( ( rule__PerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1920:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1920:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1921:2: ( rule__PerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1922:2: ( rule__PerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1922:3: rule__PerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1930:1: rule__PerishableItem__Group__2 : rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 ;
    public final void rule__PerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1934:1: ( rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 )
            // InternalGrocery.g:1935:2: rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3
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
    // InternalGrocery.g:1942:1: rule__PerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__PerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1946:1: ( ( '{' ) )
            // InternalGrocery.g:1947:1: ( '{' )
            {
            // InternalGrocery.g:1947:1: ( '{' )
            // InternalGrocery.g:1948:2: '{'
            {
             before(grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:1957:1: rule__PerishableItem__Group__3 : rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 ;
    public final void rule__PerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1961:1: ( rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 )
            // InternalGrocery.g:1962:2: rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4
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
    // InternalGrocery.g:1969:1: rule__PerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__PerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1973:1: ( ( 'price' ) )
            // InternalGrocery.g:1974:1: ( 'price' )
            {
            // InternalGrocery.g:1974:1: ( 'price' )
            // InternalGrocery.g:1975:2: 'price'
            {
             before(grammarAccess.getPerishableItemAccess().getPriceKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGrocery.g:1984:1: rule__PerishableItem__Group__4 : rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 ;
    public final void rule__PerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1988:1: ( rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 )
            // InternalGrocery.g:1989:2: rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5
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
    // InternalGrocery.g:1996:1: rule__PerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2000:1: ( ( ':' ) )
            // InternalGrocery.g:2001:1: ( ':' )
            {
            // InternalGrocery.g:2001:1: ( ':' )
            // InternalGrocery.g:2002:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2011:1: rule__PerishableItem__Group__5 : rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 ;
    public final void rule__PerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2015:1: ( rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 )
            // InternalGrocery.g:2016:2: rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6
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
    // InternalGrocery.g:2023:1: rule__PerishableItem__Group__5__Impl : ( ( rule__PerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__PerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2027:1: ( ( ( rule__PerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:2028:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:2028:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:2029:2: ( rule__PerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:2030:2: ( rule__PerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:2030:3: rule__PerishableItem__PriceAssignment_5
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
    // InternalGrocery.g:2038:1: rule__PerishableItem__Group__6 : rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 ;
    public final void rule__PerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2042:1: ( rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 )
            // InternalGrocery.g:2043:2: rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7
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
    // InternalGrocery.g:2050:1: rule__PerishableItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__PerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2054:1: ( ( 'quantity' ) )
            // InternalGrocery.g:2055:1: ( 'quantity' )
            {
            // InternalGrocery.g:2055:1: ( 'quantity' )
            // InternalGrocery.g:2056:2: 'quantity'
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGrocery.g:2065:1: rule__PerishableItem__Group__7 : rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8 ;
    public final void rule__PerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2069:1: ( rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8 )
            // InternalGrocery.g:2070:2: rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8
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
    // InternalGrocery.g:2077:1: rule__PerishableItem__Group__7__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2081:1: ( ( ':' ) )
            // InternalGrocery.g:2082:1: ( ':' )
            {
            // InternalGrocery.g:2082:1: ( ':' )
            // InternalGrocery.g:2083:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2092:1: rule__PerishableItem__Group__8 : rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9 ;
    public final void rule__PerishableItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2096:1: ( rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9 )
            // InternalGrocery.g:2097:2: rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:2104:1: rule__PerishableItem__Group__8__Impl : ( ( rule__PerishableItem__QuantityAssignment_8 ) ) ;
    public final void rule__PerishableItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2108:1: ( ( ( rule__PerishableItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:2109:1: ( ( rule__PerishableItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:2109:1: ( ( rule__PerishableItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:2110:2: ( rule__PerishableItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:2111:2: ( rule__PerishableItem__QuantityAssignment_8 )
            // InternalGrocery.g:2111:3: rule__PerishableItem__QuantityAssignment_8
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
    // InternalGrocery.g:2119:1: rule__PerishableItem__Group__9 : rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10 ;
    public final void rule__PerishableItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2123:1: ( rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10 )
            // InternalGrocery.g:2124:2: rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10
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
    // InternalGrocery.g:2131:1: rule__PerishableItem__Group__9__Impl : ( 'experationDate' ) ;
    public final void rule__PerishableItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2135:1: ( ( 'experationDate' ) )
            // InternalGrocery.g:2136:1: ( 'experationDate' )
            {
            // InternalGrocery.g:2136:1: ( 'experationDate' )
            // InternalGrocery.g:2137:2: 'experationDate'
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGrocery.g:2146:1: rule__PerishableItem__Group__10 : rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11 ;
    public final void rule__PerishableItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2150:1: ( rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11 )
            // InternalGrocery.g:2151:2: rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11
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
    // InternalGrocery.g:2158:1: rule__PerishableItem__Group__10__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2162:1: ( ( ':' ) )
            // InternalGrocery.g:2163:1: ( ':' )
            {
            // InternalGrocery.g:2163:1: ( ':' )
            // InternalGrocery.g:2164:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_10()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2173:1: rule__PerishableItem__Group__11 : rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12 ;
    public final void rule__PerishableItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2177:1: ( rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12 )
            // InternalGrocery.g:2178:2: rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12
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
    // InternalGrocery.g:2185:1: rule__PerishableItem__Group__11__Impl : ( ( rule__PerishableItem__ExperationDateAssignment_11 ) ) ;
    public final void rule__PerishableItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2189:1: ( ( ( rule__PerishableItem__ExperationDateAssignment_11 ) ) )
            // InternalGrocery.g:2190:1: ( ( rule__PerishableItem__ExperationDateAssignment_11 ) )
            {
            // InternalGrocery.g:2190:1: ( ( rule__PerishableItem__ExperationDateAssignment_11 ) )
            // InternalGrocery.g:2191:2: ( rule__PerishableItem__ExperationDateAssignment_11 )
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_11()); 
            // InternalGrocery.g:2192:2: ( rule__PerishableItem__ExperationDateAssignment_11 )
            // InternalGrocery.g:2192:3: rule__PerishableItem__ExperationDateAssignment_11
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
    // InternalGrocery.g:2200:1: rule__PerishableItem__Group__12 : rule__PerishableItem__Group__12__Impl ;
    public final void rule__PerishableItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2204:1: ( rule__PerishableItem__Group__12__Impl )
            // InternalGrocery.g:2205:2: rule__PerishableItem__Group__12__Impl
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
    // InternalGrocery.g:2211:1: rule__PerishableItem__Group__12__Impl : ( '}' ) ;
    public final void rule__PerishableItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2215:1: ( ( '}' ) )
            // InternalGrocery.g:2216:1: ( '}' )
            {
            // InternalGrocery.g:2216:1: ( '}' )
            // InternalGrocery.g:2217:2: '}'
            {
             before(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:2227:1: rule__NonFoodItem__Group__0 : rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1 ;
    public final void rule__NonFoodItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2231:1: ( rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1 )
            // InternalGrocery.g:2232:2: rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1
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
    // InternalGrocery.g:2239:1: rule__NonFoodItem__Group__0__Impl : ( 'nonFoodItem' ) ;
    public final void rule__NonFoodItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2243:1: ( ( 'nonFoodItem' ) )
            // InternalGrocery.g:2244:1: ( 'nonFoodItem' )
            {
            // InternalGrocery.g:2244:1: ( 'nonFoodItem' )
            // InternalGrocery.g:2245:2: 'nonFoodItem'
            {
             before(grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGrocery.g:2254:1: rule__NonFoodItem__Group__1 : rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2 ;
    public final void rule__NonFoodItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2258:1: ( rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2 )
            // InternalGrocery.g:2259:2: rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2
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
    // InternalGrocery.g:2266:1: rule__NonFoodItem__Group__1__Impl : ( ( rule__NonFoodItem__NameAssignment_1 ) ) ;
    public final void rule__NonFoodItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2270:1: ( ( ( rule__NonFoodItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:2271:1: ( ( rule__NonFoodItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2271:1: ( ( rule__NonFoodItem__NameAssignment_1 ) )
            // InternalGrocery.g:2272:2: ( rule__NonFoodItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonFoodItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2273:2: ( rule__NonFoodItem__NameAssignment_1 )
            // InternalGrocery.g:2273:3: rule__NonFoodItem__NameAssignment_1
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
    // InternalGrocery.g:2281:1: rule__NonFoodItem__Group__2 : rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3 ;
    public final void rule__NonFoodItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2285:1: ( rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3 )
            // InternalGrocery.g:2286:2: rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3
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
    // InternalGrocery.g:2293:1: rule__NonFoodItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonFoodItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2297:1: ( ( '{' ) )
            // InternalGrocery.g:2298:1: ( '{' )
            {
            // InternalGrocery.g:2298:1: ( '{' )
            // InternalGrocery.g:2299:2: '{'
            {
             before(grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:2308:1: rule__NonFoodItem__Group__3 : rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4 ;
    public final void rule__NonFoodItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2312:1: ( rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4 )
            // InternalGrocery.g:2313:2: rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4
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
    // InternalGrocery.g:2320:1: rule__NonFoodItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonFoodItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2324:1: ( ( 'price' ) )
            // InternalGrocery.g:2325:1: ( 'price' )
            {
            // InternalGrocery.g:2325:1: ( 'price' )
            // InternalGrocery.g:2326:2: 'price'
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGrocery.g:2335:1: rule__NonFoodItem__Group__4 : rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5 ;
    public final void rule__NonFoodItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2339:1: ( rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5 )
            // InternalGrocery.g:2340:2: rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5
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
    // InternalGrocery.g:2347:1: rule__NonFoodItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonFoodItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2351:1: ( ( ':' ) )
            // InternalGrocery.g:2352:1: ( ':' )
            {
            // InternalGrocery.g:2352:1: ( ':' )
            // InternalGrocery.g:2353:2: ':'
            {
             before(grammarAccess.getNonFoodItemAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2362:1: rule__NonFoodItem__Group__5 : rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6 ;
    public final void rule__NonFoodItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2366:1: ( rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6 )
            // InternalGrocery.g:2367:2: rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6
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
    // InternalGrocery.g:2374:1: rule__NonFoodItem__Group__5__Impl : ( ( rule__NonFoodItem__PriceAssignment_5 ) ) ;
    public final void rule__NonFoodItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2378:1: ( ( ( rule__NonFoodItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:2379:1: ( ( rule__NonFoodItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:2379:1: ( ( rule__NonFoodItem__PriceAssignment_5 ) )
            // InternalGrocery.g:2380:2: ( rule__NonFoodItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:2381:2: ( rule__NonFoodItem__PriceAssignment_5 )
            // InternalGrocery.g:2381:3: rule__NonFoodItem__PriceAssignment_5
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
    // InternalGrocery.g:2389:1: rule__NonFoodItem__Group__6 : rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7 ;
    public final void rule__NonFoodItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2393:1: ( rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7 )
            // InternalGrocery.g:2394:2: rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7
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
    // InternalGrocery.g:2401:1: rule__NonFoodItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__NonFoodItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2405:1: ( ( 'quantity' ) )
            // InternalGrocery.g:2406:1: ( 'quantity' )
            {
            // InternalGrocery.g:2406:1: ( 'quantity' )
            // InternalGrocery.g:2407:2: 'quantity'
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGrocery.g:2416:1: rule__NonFoodItem__Group__7 : rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8 ;
    public final void rule__NonFoodItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2420:1: ( rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8 )
            // InternalGrocery.g:2421:2: rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8
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
    // InternalGrocery.g:2428:1: rule__NonFoodItem__Group__7__Impl : ( ':' ) ;
    public final void rule__NonFoodItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2432:1: ( ( ':' ) )
            // InternalGrocery.g:2433:1: ( ':' )
            {
            // InternalGrocery.g:2433:1: ( ':' )
            // InternalGrocery.g:2434:2: ':'
            {
             before(grammarAccess.getNonFoodItemAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2443:1: rule__NonFoodItem__Group__8 : rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9 ;
    public final void rule__NonFoodItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2447:1: ( rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9 )
            // InternalGrocery.g:2448:2: rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9
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
    // InternalGrocery.g:2455:1: rule__NonFoodItem__Group__8__Impl : ( ( rule__NonFoodItem__QuantityAssignment_8 ) ) ;
    public final void rule__NonFoodItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2459:1: ( ( ( rule__NonFoodItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:2460:1: ( ( rule__NonFoodItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:2460:1: ( ( rule__NonFoodItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:2461:2: ( rule__NonFoodItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:2462:2: ( rule__NonFoodItem__QuantityAssignment_8 )
            // InternalGrocery.g:2462:3: rule__NonFoodItem__QuantityAssignment_8
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
    // InternalGrocery.g:2470:1: rule__NonFoodItem__Group__9 : rule__NonFoodItem__Group__9__Impl ;
    public final void rule__NonFoodItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2474:1: ( rule__NonFoodItem__Group__9__Impl )
            // InternalGrocery.g:2475:2: rule__NonFoodItem__Group__9__Impl
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
    // InternalGrocery.g:2481:1: rule__NonFoodItem__Group__9__Impl : ( '}' ) ;
    public final void rule__NonFoodItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2485:1: ( ( '}' ) )
            // InternalGrocery.g:2486:1: ( '}' )
            {
            // InternalGrocery.g:2486:1: ( '}' )
            // InternalGrocery.g:2487:2: '}'
            {
             before(grammarAccess.getNonFoodItemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:2497:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2501:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalGrocery.g:2502:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
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
    // InternalGrocery.g:2509:1: rule__Driver__Group__0__Impl : ( 'driver' ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2513:1: ( ( 'driver' ) )
            // InternalGrocery.g:2514:1: ( 'driver' )
            {
            // InternalGrocery.g:2514:1: ( 'driver' )
            // InternalGrocery.g:2515:2: 'driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGrocery.g:2524:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2528:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalGrocery.g:2529:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
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
    // InternalGrocery.g:2536:1: rule__Driver__Group__1__Impl : ( ( rule__Driver__NameAssignment_1 ) ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2540:1: ( ( ( rule__Driver__NameAssignment_1 ) ) )
            // InternalGrocery.g:2541:1: ( ( rule__Driver__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2541:1: ( ( rule__Driver__NameAssignment_1 ) )
            // InternalGrocery.g:2542:2: ( rule__Driver__NameAssignment_1 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2543:2: ( rule__Driver__NameAssignment_1 )
            // InternalGrocery.g:2543:3: rule__Driver__NameAssignment_1
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
    // InternalGrocery.g:2551:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2555:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalGrocery.g:2556:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:2563:1: rule__Driver__Group__2__Impl : ( '{' ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2567:1: ( ( '{' ) )
            // InternalGrocery.g:2568:1: ( '{' )
            {
            // InternalGrocery.g:2568:1: ( '{' )
            // InternalGrocery.g:2569:2: '{'
            {
             before(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:2578:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2582:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalGrocery.g:2583:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
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
    // InternalGrocery.g:2590:1: rule__Driver__Group__3__Impl : ( 'name' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2594:1: ( ( 'name' ) )
            // InternalGrocery.g:2595:1: ( 'name' )
            {
            // InternalGrocery.g:2595:1: ( 'name' )
            // InternalGrocery.g:2596:2: 'name'
            {
             before(grammarAccess.getDriverAccess().getNameKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGrocery.g:2605:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2609:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalGrocery.g:2610:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:2617:1: rule__Driver__Group__4__Impl : ( ':' ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2621:1: ( ( ':' ) )
            // InternalGrocery.g:2622:1: ( ':' )
            {
            // InternalGrocery.g:2622:1: ( ':' )
            // InternalGrocery.g:2623:2: ':'
            {
             before(grammarAccess.getDriverAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2632:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2636:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalGrocery.g:2637:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalGrocery.g:2644:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__DriverNameAssignment_5 ) ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2648:1: ( ( ( rule__Driver__DriverNameAssignment_5 ) ) )
            // InternalGrocery.g:2649:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            {
            // InternalGrocery.g:2649:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            // InternalGrocery.g:2650:2: ( rule__Driver__DriverNameAssignment_5 )
            {
             before(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 
            // InternalGrocery.g:2651:2: ( rule__Driver__DriverNameAssignment_5 )
            // InternalGrocery.g:2651:3: rule__Driver__DriverNameAssignment_5
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
    // InternalGrocery.g:2659:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl rule__Driver__Group__7 ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2663:1: ( rule__Driver__Group__6__Impl rule__Driver__Group__7 )
            // InternalGrocery.g:2664:2: rule__Driver__Group__6__Impl rule__Driver__Group__7
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
    // InternalGrocery.g:2671:1: rule__Driver__Group__6__Impl : ( ( rule__Driver__VehicleAssignment_6 )* ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2675:1: ( ( ( rule__Driver__VehicleAssignment_6 )* ) )
            // InternalGrocery.g:2676:1: ( ( rule__Driver__VehicleAssignment_6 )* )
            {
            // InternalGrocery.g:2676:1: ( ( rule__Driver__VehicleAssignment_6 )* )
            // InternalGrocery.g:2677:2: ( rule__Driver__VehicleAssignment_6 )*
            {
             before(grammarAccess.getDriverAccess().getVehicleAssignment_6()); 
            // InternalGrocery.g:2678:2: ( rule__Driver__VehicleAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGrocery.g:2678:3: rule__Driver__VehicleAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Driver__VehicleAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

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
    // InternalGrocery.g:2686:1: rule__Driver__Group__7 : rule__Driver__Group__7__Impl ;
    public final void rule__Driver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2690:1: ( rule__Driver__Group__7__Impl )
            // InternalGrocery.g:2691:2: rule__Driver__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__7__Impl();

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
    // InternalGrocery.g:2697:1: rule__Driver__Group__7__Impl : ( '}' ) ;
    public final void rule__Driver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2701:1: ( ( '}' ) )
            // InternalGrocery.g:2702:1: ( '}' )
            {
            // InternalGrocery.g:2702:1: ( '}' )
            // InternalGrocery.g:2703:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__Employee__Group__0"
    // InternalGrocery.g:2713:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2717:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalGrocery.g:2718:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
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
    // InternalGrocery.g:2725:1: rule__Employee__Group__0__Impl : ( 'employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2729:1: ( ( 'employee' ) )
            // InternalGrocery.g:2730:1: ( 'employee' )
            {
            // InternalGrocery.g:2730:1: ( 'employee' )
            // InternalGrocery.g:2731:2: 'employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGrocery.g:2740:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2744:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalGrocery.g:2745:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
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
    // InternalGrocery.g:2752:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2756:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalGrocery.g:2757:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2757:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalGrocery.g:2758:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2759:2: ( rule__Employee__NameAssignment_1 )
            // InternalGrocery.g:2759:3: rule__Employee__NameAssignment_1
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
    // InternalGrocery.g:2767:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2771:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalGrocery.g:2772:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:2779:1: rule__Employee__Group__2__Impl : ( '{' ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2783:1: ( ( '{' ) )
            // InternalGrocery.g:2784:1: ( '{' )
            {
            // InternalGrocery.g:2784:1: ( '{' )
            // InternalGrocery.g:2785:2: '{'
            {
             before(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:2794:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2798:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalGrocery.g:2799:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
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
    // InternalGrocery.g:2806:1: rule__Employee__Group__3__Impl : ( 'name' ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2810:1: ( ( 'name' ) )
            // InternalGrocery.g:2811:1: ( 'name' )
            {
            // InternalGrocery.g:2811:1: ( 'name' )
            // InternalGrocery.g:2812:2: 'name'
            {
             before(grammarAccess.getEmployeeAccess().getNameKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGrocery.g:2821:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2825:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalGrocery.g:2826:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:2833:1: rule__Employee__Group__4__Impl : ( ':' ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2837:1: ( ( ':' ) )
            // InternalGrocery.g:2838:1: ( ':' )
            {
            // InternalGrocery.g:2838:1: ( ':' )
            // InternalGrocery.g:2839:2: ':'
            {
             before(grammarAccess.getEmployeeAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2848:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2852:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalGrocery.g:2853:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
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
    // InternalGrocery.g:2860:1: rule__Employee__Group__5__Impl : ( ( rule__Employee__EmployeeNameAssignment_5 ) ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2864:1: ( ( ( rule__Employee__EmployeeNameAssignment_5 ) ) )
            // InternalGrocery.g:2865:1: ( ( rule__Employee__EmployeeNameAssignment_5 ) )
            {
            // InternalGrocery.g:2865:1: ( ( rule__Employee__EmployeeNameAssignment_5 ) )
            // InternalGrocery.g:2866:2: ( rule__Employee__EmployeeNameAssignment_5 )
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeNameAssignment_5()); 
            // InternalGrocery.g:2867:2: ( rule__Employee__EmployeeNameAssignment_5 )
            // InternalGrocery.g:2867:3: rule__Employee__EmployeeNameAssignment_5
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
    // InternalGrocery.g:2875:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl rule__Employee__Group__7 ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2879:1: ( rule__Employee__Group__6__Impl rule__Employee__Group__7 )
            // InternalGrocery.g:2880:2: rule__Employee__Group__6__Impl rule__Employee__Group__7
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
    // InternalGrocery.g:2887:1: rule__Employee__Group__6__Impl : ( ( rule__Employee__StockMovementAssignment_6 )* ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2891:1: ( ( ( rule__Employee__StockMovementAssignment_6 )* ) )
            // InternalGrocery.g:2892:1: ( ( rule__Employee__StockMovementAssignment_6 )* )
            {
            // InternalGrocery.g:2892:1: ( ( rule__Employee__StockMovementAssignment_6 )* )
            // InternalGrocery.g:2893:2: ( rule__Employee__StockMovementAssignment_6 )*
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementAssignment_6()); 
            // InternalGrocery.g:2894:2: ( rule__Employee__StockMovementAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGrocery.g:2894:3: rule__Employee__StockMovementAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Employee__StockMovementAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGrocery.g:2902:1: rule__Employee__Group__7 : rule__Employee__Group__7__Impl ;
    public final void rule__Employee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2906:1: ( rule__Employee__Group__7__Impl )
            // InternalGrocery.g:2907:2: rule__Employee__Group__7__Impl
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
    // InternalGrocery.g:2913:1: rule__Employee__Group__7__Impl : ( '}' ) ;
    public final void rule__Employee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2917:1: ( ( '}' ) )
            // InternalGrocery.g:2918:1: ( '}' )
            {
            // InternalGrocery.g:2918:1: ( '}' )
            // InternalGrocery.g:2919:2: '}'
            {
             before(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:2929:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2933:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalGrocery.g:2934:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
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
    // InternalGrocery.g:2941:1: rule__Customer__Group__0__Impl : ( 'customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2945:1: ( ( 'customer' ) )
            // InternalGrocery.g:2946:1: ( 'customer' )
            {
            // InternalGrocery.g:2946:1: ( 'customer' )
            // InternalGrocery.g:2947:2: 'customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGrocery.g:2956:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2960:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalGrocery.g:2961:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
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
    // InternalGrocery.g:2968:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__NameAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2972:1: ( ( ( rule__Customer__NameAssignment_1 ) ) )
            // InternalGrocery.g:2973:1: ( ( rule__Customer__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2973:1: ( ( rule__Customer__NameAssignment_1 ) )
            // InternalGrocery.g:2974:2: ( rule__Customer__NameAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2975:2: ( rule__Customer__NameAssignment_1 )
            // InternalGrocery.g:2975:3: rule__Customer__NameAssignment_1
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
    // InternalGrocery.g:2983:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2987:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalGrocery.g:2988:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:2995:1: rule__Customer__Group__2__Impl : ( '{' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2999:1: ( ( '{' ) )
            // InternalGrocery.g:3000:1: ( '{' )
            {
            // InternalGrocery.g:3000:1: ( '{' )
            // InternalGrocery.g:3001:2: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:3010:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3014:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalGrocery.g:3015:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
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
    // InternalGrocery.g:3022:1: rule__Customer__Group__3__Impl : ( 'name' ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3026:1: ( ( 'name' ) )
            // InternalGrocery.g:3027:1: ( 'name' )
            {
            // InternalGrocery.g:3027:1: ( 'name' )
            // InternalGrocery.g:3028:2: 'name'
            {
             before(grammarAccess.getCustomerAccess().getNameKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGrocery.g:3037:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl rule__Customer__Group__5 ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3041:1: ( rule__Customer__Group__4__Impl rule__Customer__Group__5 )
            // InternalGrocery.g:3042:2: rule__Customer__Group__4__Impl rule__Customer__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:3049:1: rule__Customer__Group__4__Impl : ( ':' ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3053:1: ( ( ':' ) )
            // InternalGrocery.g:3054:1: ( ':' )
            {
            // InternalGrocery.g:3054:1: ( ':' )
            // InternalGrocery.g:3055:2: ':'
            {
             before(grammarAccess.getCustomerAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:3064:1: rule__Customer__Group__5 : rule__Customer__Group__5__Impl rule__Customer__Group__6 ;
    public final void rule__Customer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3068:1: ( rule__Customer__Group__5__Impl rule__Customer__Group__6 )
            // InternalGrocery.g:3069:2: rule__Customer__Group__5__Impl rule__Customer__Group__6
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
    // InternalGrocery.g:3076:1: rule__Customer__Group__5__Impl : ( ( rule__Customer__CustomerNameAssignment_5 ) ) ;
    public final void rule__Customer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3080:1: ( ( ( rule__Customer__CustomerNameAssignment_5 ) ) )
            // InternalGrocery.g:3081:1: ( ( rule__Customer__CustomerNameAssignment_5 ) )
            {
            // InternalGrocery.g:3081:1: ( ( rule__Customer__CustomerNameAssignment_5 ) )
            // InternalGrocery.g:3082:2: ( rule__Customer__CustomerNameAssignment_5 )
            {
             before(grammarAccess.getCustomerAccess().getCustomerNameAssignment_5()); 
            // InternalGrocery.g:3083:2: ( rule__Customer__CustomerNameAssignment_5 )
            // InternalGrocery.g:3083:3: rule__Customer__CustomerNameAssignment_5
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
    // InternalGrocery.g:3091:1: rule__Customer__Group__6 : rule__Customer__Group__6__Impl rule__Customer__Group__7 ;
    public final void rule__Customer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3095:1: ( rule__Customer__Group__6__Impl rule__Customer__Group__7 )
            // InternalGrocery.g:3096:2: rule__Customer__Group__6__Impl rule__Customer__Group__7
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
    // InternalGrocery.g:3103:1: rule__Customer__Group__6__Impl : ( ( rule__Customer__SaleAssignment_6 )* ) ;
    public final void rule__Customer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3107:1: ( ( ( rule__Customer__SaleAssignment_6 )* ) )
            // InternalGrocery.g:3108:1: ( ( rule__Customer__SaleAssignment_6 )* )
            {
            // InternalGrocery.g:3108:1: ( ( rule__Customer__SaleAssignment_6 )* )
            // InternalGrocery.g:3109:2: ( rule__Customer__SaleAssignment_6 )*
            {
             before(grammarAccess.getCustomerAccess().getSaleAssignment_6()); 
            // InternalGrocery.g:3110:2: ( rule__Customer__SaleAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGrocery.g:3110:3: rule__Customer__SaleAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Customer__SaleAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGrocery.g:3118:1: rule__Customer__Group__7 : rule__Customer__Group__7__Impl ;
    public final void rule__Customer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3122:1: ( rule__Customer__Group__7__Impl )
            // InternalGrocery.g:3123:2: rule__Customer__Group__7__Impl
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
    // InternalGrocery.g:3129:1: rule__Customer__Group__7__Impl : ( '}' ) ;
    public final void rule__Customer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3133:1: ( ( '}' ) )
            // InternalGrocery.g:3134:1: ( '}' )
            {
            // InternalGrocery.g:3134:1: ( '}' )
            // InternalGrocery.g:3135:2: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:3145:1: rule__Supplier__Group__0 : rule__Supplier__Group__0__Impl rule__Supplier__Group__1 ;
    public final void rule__Supplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3149:1: ( rule__Supplier__Group__0__Impl rule__Supplier__Group__1 )
            // InternalGrocery.g:3150:2: rule__Supplier__Group__0__Impl rule__Supplier__Group__1
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
    // InternalGrocery.g:3157:1: rule__Supplier__Group__0__Impl : ( 'supplier' ) ;
    public final void rule__Supplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3161:1: ( ( 'supplier' ) )
            // InternalGrocery.g:3162:1: ( 'supplier' )
            {
            // InternalGrocery.g:3162:1: ( 'supplier' )
            // InternalGrocery.g:3163:2: 'supplier'
            {
             before(grammarAccess.getSupplierAccess().getSupplierKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGrocery.g:3172:1: rule__Supplier__Group__1 : rule__Supplier__Group__1__Impl rule__Supplier__Group__2 ;
    public final void rule__Supplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3176:1: ( rule__Supplier__Group__1__Impl rule__Supplier__Group__2 )
            // InternalGrocery.g:3177:2: rule__Supplier__Group__1__Impl rule__Supplier__Group__2
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
    // InternalGrocery.g:3184:1: rule__Supplier__Group__1__Impl : ( ( rule__Supplier__NameAssignment_1 ) ) ;
    public final void rule__Supplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3188:1: ( ( ( rule__Supplier__NameAssignment_1 ) ) )
            // InternalGrocery.g:3189:1: ( ( rule__Supplier__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3189:1: ( ( rule__Supplier__NameAssignment_1 ) )
            // InternalGrocery.g:3190:2: ( rule__Supplier__NameAssignment_1 )
            {
             before(grammarAccess.getSupplierAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3191:2: ( rule__Supplier__NameAssignment_1 )
            // InternalGrocery.g:3191:3: rule__Supplier__NameAssignment_1
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
    // InternalGrocery.g:3199:1: rule__Supplier__Group__2 : rule__Supplier__Group__2__Impl rule__Supplier__Group__3 ;
    public final void rule__Supplier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3203:1: ( rule__Supplier__Group__2__Impl rule__Supplier__Group__3 )
            // InternalGrocery.g:3204:2: rule__Supplier__Group__2__Impl rule__Supplier__Group__3
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
    // InternalGrocery.g:3211:1: rule__Supplier__Group__2__Impl : ( '{' ) ;
    public final void rule__Supplier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3215:1: ( ( '{' ) )
            // InternalGrocery.g:3216:1: ( '{' )
            {
            // InternalGrocery.g:3216:1: ( '{' )
            // InternalGrocery.g:3217:2: '{'
            {
             before(grammarAccess.getSupplierAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:3226:1: rule__Supplier__Group__3 : rule__Supplier__Group__3__Impl rule__Supplier__Group__4 ;
    public final void rule__Supplier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3230:1: ( rule__Supplier__Group__3__Impl rule__Supplier__Group__4 )
            // InternalGrocery.g:3231:2: rule__Supplier__Group__3__Impl rule__Supplier__Group__4
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
    // InternalGrocery.g:3238:1: rule__Supplier__Group__3__Impl : ( ( rule__Supplier__ItemsAssignment_3 )* ) ;
    public final void rule__Supplier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3242:1: ( ( ( rule__Supplier__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:3243:1: ( ( rule__Supplier__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:3243:1: ( ( rule__Supplier__ItemsAssignment_3 )* )
            // InternalGrocery.g:3244:2: ( rule__Supplier__ItemsAssignment_3 )*
            {
             before(grammarAccess.getSupplierAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:3245:2: ( rule__Supplier__ItemsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrocery.g:3245:3: rule__Supplier__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Supplier__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalGrocery.g:3253:1: rule__Supplier__Group__4 : rule__Supplier__Group__4__Impl ;
    public final void rule__Supplier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3257:1: ( rule__Supplier__Group__4__Impl )
            // InternalGrocery.g:3258:2: rule__Supplier__Group__4__Impl
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
    // InternalGrocery.g:3264:1: rule__Supplier__Group__4__Impl : ( '}' ) ;
    public final void rule__Supplier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3268:1: ( ( '}' ) )
            // InternalGrocery.g:3269:1: ( '}' )
            {
            // InternalGrocery.g:3269:1: ( '}' )
            // InternalGrocery.g:3270:2: '}'
            {
             before(grammarAccess.getSupplierAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:3280:1: rule__Vehicle__Group__0 : rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 ;
    public final void rule__Vehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3284:1: ( rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 )
            // InternalGrocery.g:3285:2: rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1
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
    // InternalGrocery.g:3292:1: rule__Vehicle__Group__0__Impl : ( 'vehicle' ) ;
    public final void rule__Vehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3296:1: ( ( 'vehicle' ) )
            // InternalGrocery.g:3297:1: ( 'vehicle' )
            {
            // InternalGrocery.g:3297:1: ( 'vehicle' )
            // InternalGrocery.g:3298:2: 'vehicle'
            {
             before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGrocery.g:3307:1: rule__Vehicle__Group__1 : rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 ;
    public final void rule__Vehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3311:1: ( rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 )
            // InternalGrocery.g:3312:2: rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2
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
    // InternalGrocery.g:3319:1: rule__Vehicle__Group__1__Impl : ( ( rule__Vehicle__NameAssignment_1 ) ) ;
    public final void rule__Vehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3323:1: ( ( ( rule__Vehicle__NameAssignment_1 ) ) )
            // InternalGrocery.g:3324:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3324:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            // InternalGrocery.g:3325:2: ( rule__Vehicle__NameAssignment_1 )
            {
             before(grammarAccess.getVehicleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3326:2: ( rule__Vehicle__NameAssignment_1 )
            // InternalGrocery.g:3326:3: rule__Vehicle__NameAssignment_1
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
    // InternalGrocery.g:3334:1: rule__Vehicle__Group__2 : rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 ;
    public final void rule__Vehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3338:1: ( rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 )
            // InternalGrocery.g:3339:2: rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGrocery.g:3346:1: rule__Vehicle__Group__2__Impl : ( '{' ) ;
    public final void rule__Vehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3350:1: ( ( '{' ) )
            // InternalGrocery.g:3351:1: ( '{' )
            {
            // InternalGrocery.g:3351:1: ( '{' )
            // InternalGrocery.g:3352:2: '{'
            {
             before(grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:3361:1: rule__Vehicle__Group__3 : rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 ;
    public final void rule__Vehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3365:1: ( rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 )
            // InternalGrocery.g:3366:2: rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4
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
    // InternalGrocery.g:3373:1: rule__Vehicle__Group__3__Impl : ( 'plateNumber' ) ;
    public final void rule__Vehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3377:1: ( ( 'plateNumber' ) )
            // InternalGrocery.g:3378:1: ( 'plateNumber' )
            {
            // InternalGrocery.g:3378:1: ( 'plateNumber' )
            // InternalGrocery.g:3379:2: 'plateNumber'
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGrocery.g:3388:1: rule__Vehicle__Group__4 : rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 ;
    public final void rule__Vehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3392:1: ( rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 )
            // InternalGrocery.g:3393:2: rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:3400:1: rule__Vehicle__Group__4__Impl : ( ':' ) ;
    public final void rule__Vehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3404:1: ( ( ':' ) )
            // InternalGrocery.g:3405:1: ( ':' )
            {
            // InternalGrocery.g:3405:1: ( ':' )
            // InternalGrocery.g:3406:2: ':'
            {
             before(grammarAccess.getVehicleAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:3415:1: rule__Vehicle__Group__5 : rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 ;
    public final void rule__Vehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3419:1: ( rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 )
            // InternalGrocery.g:3420:2: rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6
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
    // InternalGrocery.g:3427:1: rule__Vehicle__Group__5__Impl : ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) ;
    public final void rule__Vehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3431:1: ( ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) )
            // InternalGrocery.g:3432:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            {
            // InternalGrocery.g:3432:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            // InternalGrocery.g:3433:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 
            // InternalGrocery.g:3434:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            // InternalGrocery.g:3434:3: rule__Vehicle__PlateNumberAssignment_5
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
    // InternalGrocery.g:3442:1: rule__Vehicle__Group__6 : rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7 ;
    public final void rule__Vehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3446:1: ( rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7 )
            // InternalGrocery.g:3447:2: rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7
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
    // InternalGrocery.g:3454:1: rule__Vehicle__Group__6__Impl : ( ( rule__Vehicle__ItemsAssignment_6 )* ) ;
    public final void rule__Vehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3458:1: ( ( ( rule__Vehicle__ItemsAssignment_6 )* ) )
            // InternalGrocery.g:3459:1: ( ( rule__Vehicle__ItemsAssignment_6 )* )
            {
            // InternalGrocery.g:3459:1: ( ( rule__Vehicle__ItemsAssignment_6 )* )
            // InternalGrocery.g:3460:2: ( rule__Vehicle__ItemsAssignment_6 )*
            {
             before(grammarAccess.getVehicleAccess().getItemsAssignment_6()); 
            // InternalGrocery.g:3461:2: ( rule__Vehicle__ItemsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrocery.g:3461:3: rule__Vehicle__ItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vehicle__ItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getVehicleAccess().getItemsAssignment_6()); 

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
    // InternalGrocery.g:3469:1: rule__Vehicle__Group__7 : rule__Vehicle__Group__7__Impl ;
    public final void rule__Vehicle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3473:1: ( rule__Vehicle__Group__7__Impl )
            // InternalGrocery.g:3474:2: rule__Vehicle__Group__7__Impl
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
    // InternalGrocery.g:3480:1: rule__Vehicle__Group__7__Impl : ( '}' ) ;
    public final void rule__Vehicle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3484:1: ( ( '}' ) )
            // InternalGrocery.g:3485:1: ( '}' )
            {
            // InternalGrocery.g:3485:1: ( '}' )
            // InternalGrocery.g:3486:2: '}'
            {
             before(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:3496:1: rule__Delivery__Group__0 : rule__Delivery__Group__0__Impl rule__Delivery__Group__1 ;
    public final void rule__Delivery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3500:1: ( rule__Delivery__Group__0__Impl rule__Delivery__Group__1 )
            // InternalGrocery.g:3501:2: rule__Delivery__Group__0__Impl rule__Delivery__Group__1
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
    // InternalGrocery.g:3508:1: rule__Delivery__Group__0__Impl : ( 'delivery' ) ;
    public final void rule__Delivery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3512:1: ( ( 'delivery' ) )
            // InternalGrocery.g:3513:1: ( 'delivery' )
            {
            // InternalGrocery.g:3513:1: ( 'delivery' )
            // InternalGrocery.g:3514:2: 'delivery'
            {
             before(grammarAccess.getDeliveryAccess().getDeliveryKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGrocery.g:3523:1: rule__Delivery__Group__1 : rule__Delivery__Group__1__Impl rule__Delivery__Group__2 ;
    public final void rule__Delivery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3527:1: ( rule__Delivery__Group__1__Impl rule__Delivery__Group__2 )
            // InternalGrocery.g:3528:2: rule__Delivery__Group__1__Impl rule__Delivery__Group__2
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
    // InternalGrocery.g:3535:1: rule__Delivery__Group__1__Impl : ( ( rule__Delivery__NameAssignment_1 ) ) ;
    public final void rule__Delivery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3539:1: ( ( ( rule__Delivery__NameAssignment_1 ) ) )
            // InternalGrocery.g:3540:1: ( ( rule__Delivery__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3540:1: ( ( rule__Delivery__NameAssignment_1 ) )
            // InternalGrocery.g:3541:2: ( rule__Delivery__NameAssignment_1 )
            {
             before(grammarAccess.getDeliveryAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3542:2: ( rule__Delivery__NameAssignment_1 )
            // InternalGrocery.g:3542:3: rule__Delivery__NameAssignment_1
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
    // InternalGrocery.g:3550:1: rule__Delivery__Group__2 : rule__Delivery__Group__2__Impl rule__Delivery__Group__3 ;
    public final void rule__Delivery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3554:1: ( rule__Delivery__Group__2__Impl rule__Delivery__Group__3 )
            // InternalGrocery.g:3555:2: rule__Delivery__Group__2__Impl rule__Delivery__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalGrocery.g:3562:1: rule__Delivery__Group__2__Impl : ( '{' ) ;
    public final void rule__Delivery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3566:1: ( ( '{' ) )
            // InternalGrocery.g:3567:1: ( '{' )
            {
            // InternalGrocery.g:3567:1: ( '{' )
            // InternalGrocery.g:3568:2: '{'
            {
             before(grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:3577:1: rule__Delivery__Group__3 : rule__Delivery__Group__3__Impl rule__Delivery__Group__4 ;
    public final void rule__Delivery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3581:1: ( rule__Delivery__Group__3__Impl rule__Delivery__Group__4 )
            // InternalGrocery.g:3582:2: rule__Delivery__Group__3__Impl rule__Delivery__Group__4
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
    // InternalGrocery.g:3589:1: rule__Delivery__Group__3__Impl : ( 'warehouse' ) ;
    public final void rule__Delivery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3593:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:3594:1: ( 'warehouse' )
            {
            // InternalGrocery.g:3594:1: ( 'warehouse' )
            // InternalGrocery.g:3595:2: 'warehouse'
            {
             before(grammarAccess.getDeliveryAccess().getWarehouseKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGrocery.g:3604:1: rule__Delivery__Group__4 : rule__Delivery__Group__4__Impl rule__Delivery__Group__5 ;
    public final void rule__Delivery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3608:1: ( rule__Delivery__Group__4__Impl rule__Delivery__Group__5 )
            // InternalGrocery.g:3609:2: rule__Delivery__Group__4__Impl rule__Delivery__Group__5
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
    // InternalGrocery.g:3616:1: rule__Delivery__Group__4__Impl : ( ':' ) ;
    public final void rule__Delivery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3620:1: ( ( ':' ) )
            // InternalGrocery.g:3621:1: ( ':' )
            {
            // InternalGrocery.g:3621:1: ( ':' )
            // InternalGrocery.g:3622:2: ':'
            {
             before(grammarAccess.getDeliveryAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:3631:1: rule__Delivery__Group__5 : rule__Delivery__Group__5__Impl rule__Delivery__Group__6 ;
    public final void rule__Delivery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3635:1: ( rule__Delivery__Group__5__Impl rule__Delivery__Group__6 )
            // InternalGrocery.g:3636:2: rule__Delivery__Group__5__Impl rule__Delivery__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalGrocery.g:3643:1: rule__Delivery__Group__5__Impl : ( ( rule__Delivery__FromWarehouseAssignment_5 ) ) ;
    public final void rule__Delivery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3647:1: ( ( ( rule__Delivery__FromWarehouseAssignment_5 ) ) )
            // InternalGrocery.g:3648:1: ( ( rule__Delivery__FromWarehouseAssignment_5 ) )
            {
            // InternalGrocery.g:3648:1: ( ( rule__Delivery__FromWarehouseAssignment_5 ) )
            // InternalGrocery.g:3649:2: ( rule__Delivery__FromWarehouseAssignment_5 )
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseAssignment_5()); 
            // InternalGrocery.g:3650:2: ( rule__Delivery__FromWarehouseAssignment_5 )
            // InternalGrocery.g:3650:3: rule__Delivery__FromWarehouseAssignment_5
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
    // InternalGrocery.g:3658:1: rule__Delivery__Group__6 : rule__Delivery__Group__6__Impl rule__Delivery__Group__7 ;
    public final void rule__Delivery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3662:1: ( rule__Delivery__Group__6__Impl rule__Delivery__Group__7 )
            // InternalGrocery.g:3663:2: rule__Delivery__Group__6__Impl rule__Delivery__Group__7
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
    // InternalGrocery.g:3670:1: rule__Delivery__Group__6__Impl : ( 'store' ) ;
    public final void rule__Delivery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3674:1: ( ( 'store' ) )
            // InternalGrocery.g:3675:1: ( 'store' )
            {
            // InternalGrocery.g:3675:1: ( 'store' )
            // InternalGrocery.g:3676:2: 'store'
            {
             before(grammarAccess.getDeliveryAccess().getStoreKeyword_6()); 
            match(input,11,FOLLOW_2); 
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
    // InternalGrocery.g:3685:1: rule__Delivery__Group__7 : rule__Delivery__Group__7__Impl rule__Delivery__Group__8 ;
    public final void rule__Delivery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3689:1: ( rule__Delivery__Group__7__Impl rule__Delivery__Group__8 )
            // InternalGrocery.g:3690:2: rule__Delivery__Group__7__Impl rule__Delivery__Group__8
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
    // InternalGrocery.g:3697:1: rule__Delivery__Group__7__Impl : ( ':' ) ;
    public final void rule__Delivery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3701:1: ( ( ':' ) )
            // InternalGrocery.g:3702:1: ( ':' )
            {
            // InternalGrocery.g:3702:1: ( ':' )
            // InternalGrocery.g:3703:2: ':'
            {
             before(grammarAccess.getDeliveryAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:3712:1: rule__Delivery__Group__8 : rule__Delivery__Group__8__Impl rule__Delivery__Group__9 ;
    public final void rule__Delivery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3716:1: ( rule__Delivery__Group__8__Impl rule__Delivery__Group__9 )
            // InternalGrocery.g:3717:2: rule__Delivery__Group__8__Impl rule__Delivery__Group__9
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
    // InternalGrocery.g:3724:1: rule__Delivery__Group__8__Impl : ( ( rule__Delivery__ToStoreAssignment_8 ) ) ;
    public final void rule__Delivery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3728:1: ( ( ( rule__Delivery__ToStoreAssignment_8 ) ) )
            // InternalGrocery.g:3729:1: ( ( rule__Delivery__ToStoreAssignment_8 ) )
            {
            // InternalGrocery.g:3729:1: ( ( rule__Delivery__ToStoreAssignment_8 ) )
            // InternalGrocery.g:3730:2: ( rule__Delivery__ToStoreAssignment_8 )
            {
             before(grammarAccess.getDeliveryAccess().getToStoreAssignment_8()); 
            // InternalGrocery.g:3731:2: ( rule__Delivery__ToStoreAssignment_8 )
            // InternalGrocery.g:3731:3: rule__Delivery__ToStoreAssignment_8
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
    // InternalGrocery.g:3739:1: rule__Delivery__Group__9 : rule__Delivery__Group__9__Impl rule__Delivery__Group__10 ;
    public final void rule__Delivery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3743:1: ( rule__Delivery__Group__9__Impl rule__Delivery__Group__10 )
            // InternalGrocery.g:3744:2: rule__Delivery__Group__9__Impl rule__Delivery__Group__10
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
    // InternalGrocery.g:3751:1: rule__Delivery__Group__9__Impl : ( ( rule__Delivery__ItemsAssignment_9 )* ) ;
    public final void rule__Delivery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3755:1: ( ( ( rule__Delivery__ItemsAssignment_9 )* ) )
            // InternalGrocery.g:3756:1: ( ( rule__Delivery__ItemsAssignment_9 )* )
            {
            // InternalGrocery.g:3756:1: ( ( rule__Delivery__ItemsAssignment_9 )* )
            // InternalGrocery.g:3757:2: ( rule__Delivery__ItemsAssignment_9 )*
            {
             before(grammarAccess.getDeliveryAccess().getItemsAssignment_9()); 
            // InternalGrocery.g:3758:2: ( rule__Delivery__ItemsAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGrocery.g:3758:3: rule__Delivery__ItemsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Delivery__ItemsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGrocery.g:3766:1: rule__Delivery__Group__10 : rule__Delivery__Group__10__Impl ;
    public final void rule__Delivery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3770:1: ( rule__Delivery__Group__10__Impl )
            // InternalGrocery.g:3771:2: rule__Delivery__Group__10__Impl
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
    // InternalGrocery.g:3777:1: rule__Delivery__Group__10__Impl : ( '}' ) ;
    public final void rule__Delivery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3781:1: ( ( '}' ) )
            // InternalGrocery.g:3782:1: ( '}' )
            {
            // InternalGrocery.g:3782:1: ( '}' )
            // InternalGrocery.g:3783:2: '}'
            {
             before(grammarAccess.getDeliveryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:3793:1: rule__Sale__Group__0 : rule__Sale__Group__0__Impl rule__Sale__Group__1 ;
    public final void rule__Sale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3797:1: ( rule__Sale__Group__0__Impl rule__Sale__Group__1 )
            // InternalGrocery.g:3798:2: rule__Sale__Group__0__Impl rule__Sale__Group__1
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
    // InternalGrocery.g:3805:1: rule__Sale__Group__0__Impl : ( 'sale' ) ;
    public final void rule__Sale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3809:1: ( ( 'sale' ) )
            // InternalGrocery.g:3810:1: ( 'sale' )
            {
            // InternalGrocery.g:3810:1: ( 'sale' )
            // InternalGrocery.g:3811:2: 'sale'
            {
             before(grammarAccess.getSaleAccess().getSaleKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGrocery.g:3820:1: rule__Sale__Group__1 : rule__Sale__Group__1__Impl rule__Sale__Group__2 ;
    public final void rule__Sale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3824:1: ( rule__Sale__Group__1__Impl rule__Sale__Group__2 )
            // InternalGrocery.g:3825:2: rule__Sale__Group__1__Impl rule__Sale__Group__2
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
    // InternalGrocery.g:3832:1: rule__Sale__Group__1__Impl : ( ( rule__Sale__NameAssignment_1 ) ) ;
    public final void rule__Sale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3836:1: ( ( ( rule__Sale__NameAssignment_1 ) ) )
            // InternalGrocery.g:3837:1: ( ( rule__Sale__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3837:1: ( ( rule__Sale__NameAssignment_1 ) )
            // InternalGrocery.g:3838:2: ( rule__Sale__NameAssignment_1 )
            {
             before(grammarAccess.getSaleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3839:2: ( rule__Sale__NameAssignment_1 )
            // InternalGrocery.g:3839:3: rule__Sale__NameAssignment_1
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
    // InternalGrocery.g:3847:1: rule__Sale__Group__2 : rule__Sale__Group__2__Impl rule__Sale__Group__3 ;
    public final void rule__Sale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3851:1: ( rule__Sale__Group__2__Impl rule__Sale__Group__3 )
            // InternalGrocery.g:3852:2: rule__Sale__Group__2__Impl rule__Sale__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:3859:1: rule__Sale__Group__2__Impl : ( '{' ) ;
    public final void rule__Sale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3863:1: ( ( '{' ) )
            // InternalGrocery.g:3864:1: ( '{' )
            {
            // InternalGrocery.g:3864:1: ( '{' )
            // InternalGrocery.g:3865:2: '{'
            {
             before(grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:3874:1: rule__Sale__Group__3 : rule__Sale__Group__3__Impl rule__Sale__Group__4 ;
    public final void rule__Sale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3878:1: ( rule__Sale__Group__3__Impl rule__Sale__Group__4 )
            // InternalGrocery.g:3879:2: rule__Sale__Group__3__Impl rule__Sale__Group__4
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
    // InternalGrocery.g:3886:1: rule__Sale__Group__3__Impl : ( 'shelf' ) ;
    public final void rule__Sale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3890:1: ( ( 'shelf' ) )
            // InternalGrocery.g:3891:1: ( 'shelf' )
            {
            // InternalGrocery.g:3891:1: ( 'shelf' )
            // InternalGrocery.g:3892:2: 'shelf'
            {
             before(grammarAccess.getSaleAccess().getShelfKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGrocery.g:3901:1: rule__Sale__Group__4 : rule__Sale__Group__4__Impl rule__Sale__Group__5 ;
    public final void rule__Sale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3905:1: ( rule__Sale__Group__4__Impl rule__Sale__Group__5 )
            // InternalGrocery.g:3906:2: rule__Sale__Group__4__Impl rule__Sale__Group__5
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
    // InternalGrocery.g:3913:1: rule__Sale__Group__4__Impl : ( ':' ) ;
    public final void rule__Sale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3917:1: ( ( ':' ) )
            // InternalGrocery.g:3918:1: ( ':' )
            {
            // InternalGrocery.g:3918:1: ( ':' )
            // InternalGrocery.g:3919:2: ':'
            {
             before(grammarAccess.getSaleAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:3928:1: rule__Sale__Group__5 : rule__Sale__Group__5__Impl rule__Sale__Group__6 ;
    public final void rule__Sale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3932:1: ( rule__Sale__Group__5__Impl rule__Sale__Group__6 )
            // InternalGrocery.g:3933:2: rule__Sale__Group__5__Impl rule__Sale__Group__6
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
    // InternalGrocery.g:3940:1: rule__Sale__Group__5__Impl : ( ( rule__Sale__FromShelfAssignment_5 ) ) ;
    public final void rule__Sale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3944:1: ( ( ( rule__Sale__FromShelfAssignment_5 ) ) )
            // InternalGrocery.g:3945:1: ( ( rule__Sale__FromShelfAssignment_5 ) )
            {
            // InternalGrocery.g:3945:1: ( ( rule__Sale__FromShelfAssignment_5 ) )
            // InternalGrocery.g:3946:2: ( rule__Sale__FromShelfAssignment_5 )
            {
             before(grammarAccess.getSaleAccess().getFromShelfAssignment_5()); 
            // InternalGrocery.g:3947:2: ( rule__Sale__FromShelfAssignment_5 )
            // InternalGrocery.g:3947:3: rule__Sale__FromShelfAssignment_5
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
    // InternalGrocery.g:3955:1: rule__Sale__Group__6 : rule__Sale__Group__6__Impl rule__Sale__Group__7 ;
    public final void rule__Sale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3959:1: ( rule__Sale__Group__6__Impl rule__Sale__Group__7 )
            // InternalGrocery.g:3960:2: rule__Sale__Group__6__Impl rule__Sale__Group__7
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
    // InternalGrocery.g:3967:1: rule__Sale__Group__6__Impl : ( ( rule__Sale__ItemsAssignment_6 )* ) ;
    public final void rule__Sale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3971:1: ( ( ( rule__Sale__ItemsAssignment_6 )* ) )
            // InternalGrocery.g:3972:1: ( ( rule__Sale__ItemsAssignment_6 )* )
            {
            // InternalGrocery.g:3972:1: ( ( rule__Sale__ItemsAssignment_6 )* )
            // InternalGrocery.g:3973:2: ( rule__Sale__ItemsAssignment_6 )*
            {
             before(grammarAccess.getSaleAccess().getItemsAssignment_6()); 
            // InternalGrocery.g:3974:2: ( rule__Sale__ItemsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGrocery.g:3974:3: rule__Sale__ItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Sale__ItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGrocery.g:3982:1: rule__Sale__Group__7 : rule__Sale__Group__7__Impl ;
    public final void rule__Sale__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3986:1: ( rule__Sale__Group__7__Impl )
            // InternalGrocery.g:3987:2: rule__Sale__Group__7__Impl
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
    // InternalGrocery.g:3993:1: rule__Sale__Group__7__Impl : ( '}' ) ;
    public final void rule__Sale__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3997:1: ( ( '}' ) )
            // InternalGrocery.g:3998:1: ( '}' )
            {
            // InternalGrocery.g:3998:1: ( '}' )
            // InternalGrocery.g:3999:2: '}'
            {
             before(grammarAccess.getSaleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:4009:1: rule__StockMovement__Group__0 : rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1 ;
    public final void rule__StockMovement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4013:1: ( rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1 )
            // InternalGrocery.g:4014:2: rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1
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
    // InternalGrocery.g:4021:1: rule__StockMovement__Group__0__Impl : ( 'stock' ) ;
    public final void rule__StockMovement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4025:1: ( ( 'stock' ) )
            // InternalGrocery.g:4026:1: ( 'stock' )
            {
            // InternalGrocery.g:4026:1: ( 'stock' )
            // InternalGrocery.g:4027:2: 'stock'
            {
             before(grammarAccess.getStockMovementAccess().getStockKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGrocery.g:4036:1: rule__StockMovement__Group__1 : rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2 ;
    public final void rule__StockMovement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4040:1: ( rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2 )
            // InternalGrocery.g:4041:2: rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2
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
    // InternalGrocery.g:4048:1: rule__StockMovement__Group__1__Impl : ( ( rule__StockMovement__NameAssignment_1 ) ) ;
    public final void rule__StockMovement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4052:1: ( ( ( rule__StockMovement__NameAssignment_1 ) ) )
            // InternalGrocery.g:4053:1: ( ( rule__StockMovement__NameAssignment_1 ) )
            {
            // InternalGrocery.g:4053:1: ( ( rule__StockMovement__NameAssignment_1 ) )
            // InternalGrocery.g:4054:2: ( rule__StockMovement__NameAssignment_1 )
            {
             before(grammarAccess.getStockMovementAccess().getNameAssignment_1()); 
            // InternalGrocery.g:4055:2: ( rule__StockMovement__NameAssignment_1 )
            // InternalGrocery.g:4055:3: rule__StockMovement__NameAssignment_1
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
    // InternalGrocery.g:4063:1: rule__StockMovement__Group__2 : rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3 ;
    public final void rule__StockMovement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4067:1: ( rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3 )
            // InternalGrocery.g:4068:2: rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalGrocery.g:4075:1: rule__StockMovement__Group__2__Impl : ( '{' ) ;
    public final void rule__StockMovement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4079:1: ( ( '{' ) )
            // InternalGrocery.g:4080:1: ( '{' )
            {
            // InternalGrocery.g:4080:1: ( '{' )
            // InternalGrocery.g:4081:2: '{'
            {
             before(grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGrocery.g:4090:1: rule__StockMovement__Group__3 : rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4 ;
    public final void rule__StockMovement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4094:1: ( rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4 )
            // InternalGrocery.g:4095:2: rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4
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
    // InternalGrocery.g:4102:1: rule__StockMovement__Group__3__Impl : ( 'backroom' ) ;
    public final void rule__StockMovement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4106:1: ( ( 'backroom' ) )
            // InternalGrocery.g:4107:1: ( 'backroom' )
            {
            // InternalGrocery.g:4107:1: ( 'backroom' )
            // InternalGrocery.g:4108:2: 'backroom'
            {
             before(grammarAccess.getStockMovementAccess().getBackroomKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGrocery.g:4117:1: rule__StockMovement__Group__4 : rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5 ;
    public final void rule__StockMovement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4121:1: ( rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5 )
            // InternalGrocery.g:4122:2: rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5
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
    // InternalGrocery.g:4129:1: rule__StockMovement__Group__4__Impl : ( ':' ) ;
    public final void rule__StockMovement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4133:1: ( ( ':' ) )
            // InternalGrocery.g:4134:1: ( ':' )
            {
            // InternalGrocery.g:4134:1: ( ':' )
            // InternalGrocery.g:4135:2: ':'
            {
             before(grammarAccess.getStockMovementAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:4144:1: rule__StockMovement__Group__5 : rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6 ;
    public final void rule__StockMovement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4148:1: ( rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6 )
            // InternalGrocery.g:4149:2: rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:4156:1: rule__StockMovement__Group__5__Impl : ( ( rule__StockMovement__FromBackroomAssignment_5 ) ) ;
    public final void rule__StockMovement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4160:1: ( ( ( rule__StockMovement__FromBackroomAssignment_5 ) ) )
            // InternalGrocery.g:4161:1: ( ( rule__StockMovement__FromBackroomAssignment_5 ) )
            {
            // InternalGrocery.g:4161:1: ( ( rule__StockMovement__FromBackroomAssignment_5 ) )
            // InternalGrocery.g:4162:2: ( rule__StockMovement__FromBackroomAssignment_5 )
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomAssignment_5()); 
            // InternalGrocery.g:4163:2: ( rule__StockMovement__FromBackroomAssignment_5 )
            // InternalGrocery.g:4163:3: rule__StockMovement__FromBackroomAssignment_5
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
    // InternalGrocery.g:4171:1: rule__StockMovement__Group__6 : rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7 ;
    public final void rule__StockMovement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4175:1: ( rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7 )
            // InternalGrocery.g:4176:2: rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7
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
    // InternalGrocery.g:4183:1: rule__StockMovement__Group__6__Impl : ( 'shelf' ) ;
    public final void rule__StockMovement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4187:1: ( ( 'shelf' ) )
            // InternalGrocery.g:4188:1: ( 'shelf' )
            {
            // InternalGrocery.g:4188:1: ( 'shelf' )
            // InternalGrocery.g:4189:2: 'shelf'
            {
             before(grammarAccess.getStockMovementAccess().getShelfKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGrocery.g:4198:1: rule__StockMovement__Group__7 : rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8 ;
    public final void rule__StockMovement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4202:1: ( rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8 )
            // InternalGrocery.g:4203:2: rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8
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
    // InternalGrocery.g:4210:1: rule__StockMovement__Group__7__Impl : ( ':' ) ;
    public final void rule__StockMovement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4214:1: ( ( ':' ) )
            // InternalGrocery.g:4215:1: ( ':' )
            {
            // InternalGrocery.g:4215:1: ( ':' )
            // InternalGrocery.g:4216:2: ':'
            {
             before(grammarAccess.getStockMovementAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:4225:1: rule__StockMovement__Group__8 : rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9 ;
    public final void rule__StockMovement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4229:1: ( rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9 )
            // InternalGrocery.g:4230:2: rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9
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
    // InternalGrocery.g:4237:1: rule__StockMovement__Group__8__Impl : ( ( rule__StockMovement__ToShelfAssignment_8 ) ) ;
    public final void rule__StockMovement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4241:1: ( ( ( rule__StockMovement__ToShelfAssignment_8 ) ) )
            // InternalGrocery.g:4242:1: ( ( rule__StockMovement__ToShelfAssignment_8 ) )
            {
            // InternalGrocery.g:4242:1: ( ( rule__StockMovement__ToShelfAssignment_8 ) )
            // InternalGrocery.g:4243:2: ( rule__StockMovement__ToShelfAssignment_8 )
            {
             before(grammarAccess.getStockMovementAccess().getToShelfAssignment_8()); 
            // InternalGrocery.g:4244:2: ( rule__StockMovement__ToShelfAssignment_8 )
            // InternalGrocery.g:4244:3: rule__StockMovement__ToShelfAssignment_8
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
    // InternalGrocery.g:4252:1: rule__StockMovement__Group__9 : rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10 ;
    public final void rule__StockMovement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4256:1: ( rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10 )
            // InternalGrocery.g:4257:2: rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10
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
    // InternalGrocery.g:4264:1: rule__StockMovement__Group__9__Impl : ( ( rule__StockMovement__ItemsAssignment_9 )* ) ;
    public final void rule__StockMovement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4268:1: ( ( ( rule__StockMovement__ItemsAssignment_9 )* ) )
            // InternalGrocery.g:4269:1: ( ( rule__StockMovement__ItemsAssignment_9 )* )
            {
            // InternalGrocery.g:4269:1: ( ( rule__StockMovement__ItemsAssignment_9 )* )
            // InternalGrocery.g:4270:2: ( rule__StockMovement__ItemsAssignment_9 )*
            {
             before(grammarAccess.getStockMovementAccess().getItemsAssignment_9()); 
            // InternalGrocery.g:4271:2: ( rule__StockMovement__ItemsAssignment_9 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGrocery.g:4271:3: rule__StockMovement__ItemsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StockMovement__ItemsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGrocery.g:4279:1: rule__StockMovement__Group__10 : rule__StockMovement__Group__10__Impl ;
    public final void rule__StockMovement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4283:1: ( rule__StockMovement__Group__10__Impl )
            // InternalGrocery.g:4284:2: rule__StockMovement__Group__10__Impl
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
    // InternalGrocery.g:4290:1: rule__StockMovement__Group__10__Impl : ( '}' ) ;
    public final void rule__StockMovement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4294:1: ( ( '}' ) )
            // InternalGrocery.g:4295:1: ( '}' )
            {
            // InternalGrocery.g:4295:1: ( '}' )
            // InternalGrocery.g:4296:2: '}'
            {
             before(grammarAccess.getStockMovementAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGrocery.g:4306:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4310:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalGrocery.g:4311:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalGrocery.g:4318:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4322:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4323:1: ( RULE_INT )
            {
            // InternalGrocery.g:4323:1: ( RULE_INT )
            // InternalGrocery.g:4324:2: RULE_INT
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
    // InternalGrocery.g:4333:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4337:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalGrocery.g:4338:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalGrocery.g:4345:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4349:1: ( ( '.' ) )
            // InternalGrocery.g:4350:1: ( '.' )
            {
            // InternalGrocery.g:4350:1: ( '.' )
            // InternalGrocery.g:4351:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGrocery.g:4360:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4364:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalGrocery.g:4365:2: rule__DECIMAL__Group__2__Impl
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
    // InternalGrocery.g:4371:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4375:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4376:1: ( RULE_INT )
            {
            // InternalGrocery.g:4376:1: ( RULE_INT )
            // InternalGrocery.g:4377:2: RULE_INT
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
    // InternalGrocery.g:4387:1: rule__DATE__Group__0 : rule__DATE__Group__0__Impl rule__DATE__Group__1 ;
    public final void rule__DATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4391:1: ( rule__DATE__Group__0__Impl rule__DATE__Group__1 )
            // InternalGrocery.g:4392:2: rule__DATE__Group__0__Impl rule__DATE__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGrocery.g:4399:1: rule__DATE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4403:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4404:1: ( RULE_INT )
            {
            // InternalGrocery.g:4404:1: ( RULE_INT )
            // InternalGrocery.g:4405:2: RULE_INT
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
    // InternalGrocery.g:4414:1: rule__DATE__Group__1 : rule__DATE__Group__1__Impl rule__DATE__Group__2 ;
    public final void rule__DATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4418:1: ( rule__DATE__Group__1__Impl rule__DATE__Group__2 )
            // InternalGrocery.g:4419:2: rule__DATE__Group__1__Impl rule__DATE__Group__2
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
    // InternalGrocery.g:4426:1: rule__DATE__Group__1__Impl : ( '/' ) ;
    public final void rule__DATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4430:1: ( ( '/' ) )
            // InternalGrocery.g:4431:1: ( '/' )
            {
            // InternalGrocery.g:4431:1: ( '/' )
            // InternalGrocery.g:4432:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGrocery.g:4441:1: rule__DATE__Group__2 : rule__DATE__Group__2__Impl rule__DATE__Group__3 ;
    public final void rule__DATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4445:1: ( rule__DATE__Group__2__Impl rule__DATE__Group__3 )
            // InternalGrocery.g:4446:2: rule__DATE__Group__2__Impl rule__DATE__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalGrocery.g:4453:1: rule__DATE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4457:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4458:1: ( RULE_INT )
            {
            // InternalGrocery.g:4458:1: ( RULE_INT )
            // InternalGrocery.g:4459:2: RULE_INT
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
    // InternalGrocery.g:4468:1: rule__DATE__Group__3 : rule__DATE__Group__3__Impl rule__DATE__Group__4 ;
    public final void rule__DATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4472:1: ( rule__DATE__Group__3__Impl rule__DATE__Group__4 )
            // InternalGrocery.g:4473:2: rule__DATE__Group__3__Impl rule__DATE__Group__4
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
    // InternalGrocery.g:4480:1: rule__DATE__Group__3__Impl : ( '/' ) ;
    public final void rule__DATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4484:1: ( ( '/' ) )
            // InternalGrocery.g:4485:1: ( '/' )
            {
            // InternalGrocery.g:4485:1: ( '/' )
            // InternalGrocery.g:4486:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGrocery.g:4495:1: rule__DATE__Group__4 : rule__DATE__Group__4__Impl ;
    public final void rule__DATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4499:1: ( rule__DATE__Group__4__Impl )
            // InternalGrocery.g:4500:2: rule__DATE__Group__4__Impl
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
    // InternalGrocery.g:4506:1: rule__DATE__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4510:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4511:1: ( RULE_INT )
            {
            // InternalGrocery.g:4511:1: ( RULE_INT )
            // InternalGrocery.g:4512:2: RULE_INT
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
    // InternalGrocery.g:4522:1: rule__ADDRESS__Group__0 : rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 ;
    public final void rule__ADDRESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4526:1: ( rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 )
            // InternalGrocery.g:4527:2: rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:4534:1: rule__ADDRESS__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__ADDRESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4538:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4539:1: ( RULE_INT )
            {
            // InternalGrocery.g:4539:1: ( RULE_INT )
            // InternalGrocery.g:4540:2: RULE_INT
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
    // InternalGrocery.g:4549:1: rule__ADDRESS__Group__1 : rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 ;
    public final void rule__ADDRESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4553:1: ( rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 )
            // InternalGrocery.g:4554:2: rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalGrocery.g:4561:1: rule__ADDRESS__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4565:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4566:1: ( RULE_STRING )
            {
            // InternalGrocery.g:4566:1: ( RULE_STRING )
            // InternalGrocery.g:4567:2: RULE_STRING
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
    // InternalGrocery.g:4576:1: rule__ADDRESS__Group__2 : rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 ;
    public final void rule__ADDRESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4580:1: ( rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 )
            // InternalGrocery.g:4581:2: rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:4588:1: rule__ADDRESS__Group__2__Impl : ( ',' ) ;
    public final void rule__ADDRESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4592:1: ( ( ',' ) )
            // InternalGrocery.g:4593:1: ( ',' )
            {
            // InternalGrocery.g:4593:1: ( ',' )
            // InternalGrocery.g:4594:2: ','
            {
             before(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGrocery.g:4603:1: rule__ADDRESS__Group__3 : rule__ADDRESS__Group__3__Impl ;
    public final void rule__ADDRESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4607:1: ( rule__ADDRESS__Group__3__Impl )
            // InternalGrocery.g:4608:2: rule__ADDRESS__Group__3__Impl
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
    // InternalGrocery.g:4614:1: rule__ADDRESS__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4618:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4619:1: ( RULE_STRING )
            {
            // InternalGrocery.g:4619:1: ( RULE_STRING )
            // InternalGrocery.g:4620:2: RULE_STRING
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
    // InternalGrocery.g:4630:1: rule__Grocery__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Grocery__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4634:1: ( ( ruleAbstractElement ) )
            // InternalGrocery.g:4635:2: ( ruleAbstractElement )
            {
            // InternalGrocery.g:4635:2: ( ruleAbstractElement )
            // InternalGrocery.g:4636:3: ruleAbstractElement
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
    // InternalGrocery.g:4645:1: rule__Store__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4649:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4650:2: ( RULE_ID )
            {
            // InternalGrocery.g:4650:2: ( RULE_ID )
            // InternalGrocery.g:4651:3: RULE_ID
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
    // InternalGrocery.g:4660:1: rule__Store__ElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Store__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4664:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4665:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4665:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4666:3: ( RULE_ID )
            {
             before(grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0()); 
            // InternalGrocery.g:4667:3: ( RULE_ID )
            // InternalGrocery.g:4668:4: RULE_ID
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
    // InternalGrocery.g:4679:1: rule__Warehouse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4683:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4684:2: ( RULE_ID )
            {
            // InternalGrocery.g:4684:2: ( RULE_ID )
            // InternalGrocery.g:4685:3: RULE_ID
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
    // InternalGrocery.g:4694:1: rule__Warehouse__AddressAssignment_5 : ( ruleADDRESS ) ;
    public final void rule__Warehouse__AddressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4698:1: ( ( ruleADDRESS ) )
            // InternalGrocery.g:4699:2: ( ruleADDRESS )
            {
            // InternalGrocery.g:4699:2: ( ruleADDRESS )
            // InternalGrocery.g:4700:3: ruleADDRESS
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
    // InternalGrocery.g:4709:1: rule__Warehouse__SupplierAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Warehouse__SupplierAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4713:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4714:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4714:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4715:3: ( RULE_ID )
            {
             before(grammarAccess.getWarehouseAccess().getSupplierSupplierCrossReference_8_0()); 
            // InternalGrocery.g:4716:3: ( RULE_ID )
            // InternalGrocery.g:4717:4: RULE_ID
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
    // InternalGrocery.g:4728:1: rule__Shelf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shelf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4732:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4733:2: ( RULE_ID )
            {
            // InternalGrocery.g:4733:2: ( RULE_ID )
            // InternalGrocery.g:4734:3: RULE_ID
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
    // InternalGrocery.g:4743:1: rule__Shelf__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Shelf__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4747:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4748:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4748:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4749:3: ( RULE_ID )
            {
             before(grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:4750:3: ( RULE_ID )
            // InternalGrocery.g:4751:4: RULE_ID
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
    // InternalGrocery.g:4762:1: rule__Backroom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Backroom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4766:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4767:2: ( RULE_ID )
            {
            // InternalGrocery.g:4767:2: ( RULE_ID )
            // InternalGrocery.g:4768:3: RULE_ID
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
    // InternalGrocery.g:4777:1: rule__Backroom__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Backroom__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4781:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4782:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4782:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4783:3: ( RULE_ID )
            {
             before(grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:4784:3: ( RULE_ID )
            // InternalGrocery.g:4785:4: RULE_ID
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


    // $ANTLR start "rule__NonPerishableItem__NameAssignment_1"
    // InternalGrocery.g:4796:1: rule__NonPerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonPerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4800:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4801:2: ( RULE_ID )
            {
            // InternalGrocery.g:4801:2: ( RULE_ID )
            // InternalGrocery.g:4802:3: RULE_ID
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NonPerishableItem__NameAssignment_1"


    // $ANTLR start "rule__NonPerishableItem__PriceAssignment_5"
    // InternalGrocery.g:4811:1: rule__NonPerishableItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__NonPerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4815:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4816:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4816:2: ( ruleDECIMAL )
            // InternalGrocery.g:4817:3: ruleDECIMAL
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__NonPerishableItem__PriceAssignment_5"


    // $ANTLR start "rule__NonPerishableItem__QuantityAssignment_8"
    // InternalGrocery.g:4826:1: rule__NonPerishableItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__NonPerishableItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4830:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4831:2: ( RULE_INT )
            {
            // InternalGrocery.g:4831:2: ( RULE_INT )
            // InternalGrocery.g:4832:3: RULE_INT
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__NonPerishableItem__QuantityAssignment_8"


    // $ANTLR start "rule__PerishableItem__NameAssignment_1"
    // InternalGrocery.g:4841:1: rule__PerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4845:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4846:2: ( RULE_ID )
            {
            // InternalGrocery.g:4846:2: ( RULE_ID )
            // InternalGrocery.g:4847:3: RULE_ID
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
    // InternalGrocery.g:4856:1: rule__PerishableItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__PerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4860:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4861:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4861:2: ( ruleDECIMAL )
            // InternalGrocery.g:4862:3: ruleDECIMAL
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
    // InternalGrocery.g:4871:1: rule__PerishableItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__PerishableItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4875:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4876:2: ( RULE_INT )
            {
            // InternalGrocery.g:4876:2: ( RULE_INT )
            // InternalGrocery.g:4877:3: RULE_INT
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
    // InternalGrocery.g:4886:1: rule__PerishableItem__ExperationDateAssignment_11 : ( ruleDATE ) ;
    public final void rule__PerishableItem__ExperationDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4890:1: ( ( ruleDATE ) )
            // InternalGrocery.g:4891:2: ( ruleDATE )
            {
            // InternalGrocery.g:4891:2: ( ruleDATE )
            // InternalGrocery.g:4892:3: ruleDATE
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
    // InternalGrocery.g:4901:1: rule__NonFoodItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonFoodItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4905:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4906:2: ( RULE_ID )
            {
            // InternalGrocery.g:4906:2: ( RULE_ID )
            // InternalGrocery.g:4907:3: RULE_ID
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
    // InternalGrocery.g:4916:1: rule__NonFoodItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__NonFoodItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4920:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4921:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4921:2: ( ruleDECIMAL )
            // InternalGrocery.g:4922:3: ruleDECIMAL
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
    // InternalGrocery.g:4931:1: rule__NonFoodItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__NonFoodItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4935:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4936:2: ( RULE_INT )
            {
            // InternalGrocery.g:4936:2: ( RULE_INT )
            // InternalGrocery.g:4937:3: RULE_INT
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
    // InternalGrocery.g:4946:1: rule__Driver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Driver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4950:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4951:2: ( RULE_ID )
            {
            // InternalGrocery.g:4951:2: ( RULE_ID )
            // InternalGrocery.g:4952:3: RULE_ID
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
    // InternalGrocery.g:4961:1: rule__Driver__DriverNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Driver__DriverNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4965:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4966:2: ( RULE_STRING )
            {
            // InternalGrocery.g:4966:2: ( RULE_STRING )
            // InternalGrocery.g:4967:3: RULE_STRING
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
    // InternalGrocery.g:4976:1: rule__Driver__VehicleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Driver__VehicleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4980:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4981:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4981:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4982:3: ( RULE_ID )
            {
             before(grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0()); 
            // InternalGrocery.g:4983:3: ( RULE_ID )
            // InternalGrocery.g:4984:4: RULE_ID
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


    // $ANTLR start "rule__Employee__NameAssignment_1"
    // InternalGrocery.g:4995:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4999:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5000:2: ( RULE_ID )
            {
            // InternalGrocery.g:5000:2: ( RULE_ID )
            // InternalGrocery.g:5001:3: RULE_ID
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
    // InternalGrocery.g:5010:1: rule__Employee__EmployeeNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Employee__EmployeeNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5014:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5015:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5015:2: ( RULE_STRING )
            // InternalGrocery.g:5016:3: RULE_STRING
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
    // InternalGrocery.g:5025:1: rule__Employee__StockMovementAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Employee__StockMovementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5029:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5030:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5030:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5031:3: ( RULE_ID )
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0()); 
            // InternalGrocery.g:5032:3: ( RULE_ID )
            // InternalGrocery.g:5033:4: RULE_ID
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
    // InternalGrocery.g:5044:1: rule__Customer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Customer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5048:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5049:2: ( RULE_ID )
            {
            // InternalGrocery.g:5049:2: ( RULE_ID )
            // InternalGrocery.g:5050:3: RULE_ID
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
    // InternalGrocery.g:5059:1: rule__Customer__CustomerNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Customer__CustomerNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5063:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5064:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5064:2: ( RULE_STRING )
            // InternalGrocery.g:5065:3: RULE_STRING
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
    // InternalGrocery.g:5074:1: rule__Customer__SaleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Customer__SaleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5078:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5079:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5079:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5080:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0()); 
            // InternalGrocery.g:5081:3: ( RULE_ID )
            // InternalGrocery.g:5082:4: RULE_ID
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
    // InternalGrocery.g:5093:1: rule__Supplier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Supplier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5097:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5098:2: ( RULE_ID )
            {
            // InternalGrocery.g:5098:2: ( RULE_ID )
            // InternalGrocery.g:5099:3: RULE_ID
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
    // InternalGrocery.g:5108:1: rule__Supplier__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Supplier__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5112:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5113:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5113:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5114:3: ( RULE_ID )
            {
             before(grammarAccess.getSupplierAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:5115:3: ( RULE_ID )
            // InternalGrocery.g:5116:4: RULE_ID
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
    // InternalGrocery.g:5127:1: rule__Vehicle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5131:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5132:2: ( RULE_ID )
            {
            // InternalGrocery.g:5132:2: ( RULE_ID )
            // InternalGrocery.g:5133:3: RULE_ID
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
    // InternalGrocery.g:5142:1: rule__Vehicle__PlateNumberAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Vehicle__PlateNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5146:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5147:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5147:2: ( RULE_STRING )
            // InternalGrocery.g:5148:3: RULE_STRING
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


    // $ANTLR start "rule__Vehicle__ItemsAssignment_6"
    // InternalGrocery.g:5157:1: rule__Vehicle__ItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Vehicle__ItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5161:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5162:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5162:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5163:3: ( RULE_ID )
            {
             before(grammarAccess.getVehicleAccess().getItemsItemCrossReference_6_0()); 
            // InternalGrocery.g:5164:3: ( RULE_ID )
            // InternalGrocery.g:5165:4: RULE_ID
            {
             before(grammarAccess.getVehicleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getVehicleAccess().getItemsItemCrossReference_6_0()); 

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
    // $ANTLR end "rule__Vehicle__ItemsAssignment_6"


    // $ANTLR start "rule__Delivery__NameAssignment_1"
    // InternalGrocery.g:5176:1: rule__Delivery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delivery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5180:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5181:2: ( RULE_ID )
            {
            // InternalGrocery.g:5181:2: ( RULE_ID )
            // InternalGrocery.g:5182:3: RULE_ID
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
    // InternalGrocery.g:5191:1: rule__Delivery__FromWarehouseAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__FromWarehouseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5195:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5196:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5196:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5197:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0()); 
            // InternalGrocery.g:5198:3: ( RULE_ID )
            // InternalGrocery.g:5199:4: RULE_ID
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
    // InternalGrocery.g:5210:1: rule__Delivery__ToStoreAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__ToStoreAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5214:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5215:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5215:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5216:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0()); 
            // InternalGrocery.g:5217:3: ( RULE_ID )
            // InternalGrocery.g:5218:4: RULE_ID
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
    // InternalGrocery.g:5229:1: rule__Delivery__ItemsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5233:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5234:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5234:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5235:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0()); 
            // InternalGrocery.g:5236:3: ( RULE_ID )
            // InternalGrocery.g:5237:4: RULE_ID
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
    // InternalGrocery.g:5248:1: rule__Sale__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sale__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5252:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5253:2: ( RULE_ID )
            {
            // InternalGrocery.g:5253:2: ( RULE_ID )
            // InternalGrocery.g:5254:3: RULE_ID
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
    // InternalGrocery.g:5263:1: rule__Sale__FromShelfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Sale__FromShelfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5267:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5268:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5268:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5269:3: ( RULE_ID )
            {
             before(grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0()); 
            // InternalGrocery.g:5270:3: ( RULE_ID )
            // InternalGrocery.g:5271:4: RULE_ID
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
    // InternalGrocery.g:5282:1: rule__Sale__ItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Sale__ItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5286:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5287:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5287:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5288:3: ( RULE_ID )
            {
             before(grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0()); 
            // InternalGrocery.g:5289:3: ( RULE_ID )
            // InternalGrocery.g:5290:4: RULE_ID
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
    // InternalGrocery.g:5301:1: rule__StockMovement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StockMovement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5305:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5306:2: ( RULE_ID )
            {
            // InternalGrocery.g:5306:2: ( RULE_ID )
            // InternalGrocery.g:5307:3: RULE_ID
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
    // InternalGrocery.g:5316:1: rule__StockMovement__FromBackroomAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__FromBackroomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5320:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5321:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5321:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5322:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0()); 
            // InternalGrocery.g:5323:3: ( RULE_ID )
            // InternalGrocery.g:5324:4: RULE_ID
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
    // InternalGrocery.g:5335:1: rule__StockMovement__ToShelfAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__ToShelfAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5339:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5340:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5340:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5341:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0()); 
            // InternalGrocery.g:5342:3: ( RULE_ID )
            // InternalGrocery.g:5343:4: RULE_ID
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
    // InternalGrocery.g:5354:1: rule__StockMovement__ItemsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5358:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5359:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5359:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5360:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0()); 
            // InternalGrocery.g:5361:3: ( RULE_ID )
            // InternalGrocery.g:5362:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000007769E4802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});

}