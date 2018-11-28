<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Grocery2Java"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchGrocery2Package():V"/>
		<constant value="__exec__"/>
		<constant value="Grocery2Package"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyGrocery2Package(NTransientLink;):V"/>
		<constant value="__matchGrocery2Package"/>
		<constant value="Grocery"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="g"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="m"/>
		<constant value="Model"/>
		<constant value="Java"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="p"/>
		<constant value="Package"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:3-12:34"/>
		<constant value="13:3-14:29"/>
		<constant value="__applyGrocery2Package"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="model"/>
		<constant value="GroceryPackage"/>
		<constant value="elements"/>
		<constant value="5"/>
		<constant value="Store"/>
		<constant value="J.oclIsTypeOf(J):J"/>
		<constant value="B.not():B"/>
		<constant value="47"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.store2ClassDeclaration(J):J"/>
		<constant value="ownedElements"/>
		<constant value="Shelf"/>
		<constant value="72"/>
		<constant value="J.shelf2ClassDeclaration(J):J"/>
		<constant value="12:24-12:33"/>
		<constant value="12:16-12:33"/>
		<constant value="13:27-13:28"/>
		<constant value="13:18-13:28"/>
		<constant value="14:12-14:28"/>
		<constant value="14:4-14:28"/>
		<constant value="16:12-16:13"/>
		<constant value="16:12-16:22"/>
		<constant value="16:35-16:36"/>
		<constant value="16:49-16:62"/>
		<constant value="16:35-16:63"/>
		<constant value="16:12-16:64"/>
		<constant value="17:4-17:5"/>
		<constant value="17:23-17:33"/>
		<constant value="17:57-17:58"/>
		<constant value="17:23-17:59"/>
		<constant value="17:4-17:60"/>
		<constant value="16:3-18:4"/>
		<constant value="19:13-19:14"/>
		<constant value="19:13-19:23"/>
		<constant value="19:37-19:39"/>
		<constant value="19:52-19:65"/>
		<constant value="19:37-19:66"/>
		<constant value="19:13-19:67"/>
		<constant value="20:4-20:5"/>
		<constant value="20:23-20:33"/>
		<constant value="20:57-20:59"/>
		<constant value="20:23-20:60"/>
		<constant value="20:4-20:61"/>
		<constant value="19:3-21:4"/>
		<constant value="15:2-22:3"/>
		<constant value="s"/>
		<constant value="sh"/>
		<constant value="link"/>
		<constant value="store2ClassDeclaration"/>
		<constant value="MGrocery!Store;"/>
		<constant value="cd"/>
		<constant value="ClassDeclaration"/>
		<constant value="31:3-31:27"/>
		<constant value="shelf2ClassDeclaration"/>
		<constant value="MGrocery!Shelf;"/>
		<constant value="38:3-38:27"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="46"/>
			<findme/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="50"/>
			<dup/>
			<push arg="51"/>
			<load arg="19"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="53"/>
			<push arg="54"/>
			<push arg="55"/>
			<new/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<push arg="58"/>
			<push arg="55"/>
			<new/>
			<pcall arg="56"/>
			<pusht/>
			<pcall arg="59"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="60" begin="19" end="24"/>
			<lne id="61" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="51" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="62">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="63"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="51"/>
			<call arg="64"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="53"/>
			<call arg="65"/>
			<store arg="66"/>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="65"/>
			<store arg="67"/>
			<load arg="66"/>
			<dup/>
			<getasm/>
			<push arg="46"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="66"/>
			<call arg="30"/>
			<set arg="68"/>
			<dup/>
			<getasm/>
			<push arg="69"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="70"/>
			<iterate/>
			<store arg="71"/>
			<load arg="71"/>
			<push arg="72"/>
			<push arg="46"/>
			<findme/>
			<call arg="73"/>
			<call arg="74"/>
			<if arg="75"/>
			<load arg="71"/>
			<call arg="76"/>
			<enditerate/>
			<iterate/>
			<store arg="71"/>
			<load arg="67"/>
			<getasm/>
			<load arg="71"/>
			<call arg="77"/>
			<set arg="78"/>
			<enditerate/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="70"/>
			<iterate/>
			<store arg="71"/>
			<load arg="71"/>
			<push arg="79"/>
			<push arg="46"/>
			<findme/>
			<call arg="73"/>
			<call arg="74"/>
			<if arg="80"/>
			<load arg="71"/>
			<call arg="76"/>
			<enditerate/>
			<iterate/>
			<store arg="71"/>
			<load arg="67"/>
			<getasm/>
			<load arg="71"/>
			<call arg="81"/>
			<set arg="78"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="82" begin="15" end="15"/>
			<lne id="83" begin="13" end="17"/>
			<lne id="60" begin="12" end="18"/>
			<lne id="84" begin="22" end="22"/>
			<lne id="85" begin="20" end="24"/>
			<lne id="86" begin="27" end="27"/>
			<lne id="87" begin="25" end="29"/>
			<lne id="61" begin="19" end="30"/>
			<lne id="88" begin="34" end="34"/>
			<lne id="89" begin="34" end="35"/>
			<lne id="90" begin="38" end="38"/>
			<lne id="91" begin="39" end="41"/>
			<lne id="92" begin="38" end="42"/>
			<lne id="93" begin="31" end="47"/>
			<lne id="94" begin="50" end="50"/>
			<lne id="95" begin="51" end="51"/>
			<lne id="96" begin="52" end="52"/>
			<lne id="97" begin="51" end="53"/>
			<lne id="98" begin="50" end="54"/>
			<lne id="99" begin="31" end="55"/>
			<lne id="100" begin="59" end="59"/>
			<lne id="101" begin="59" end="60"/>
			<lne id="102" begin="63" end="63"/>
			<lne id="103" begin="64" end="66"/>
			<lne id="104" begin="63" end="67"/>
			<lne id="105" begin="56" end="72"/>
			<lne id="106" begin="75" end="75"/>
			<lne id="107" begin="76" end="76"/>
			<lne id="108" begin="77" end="77"/>
			<lne id="109" begin="76" end="78"/>
			<lne id="110" begin="75" end="79"/>
			<lne id="111" begin="56" end="80"/>
			<lne id="112" begin="31" end="80"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="5" name="113" begin="37" end="46"/>
			<lve slot="5" name="113" begin="49" end="54"/>
			<lve slot="5" name="114" begin="62" end="71"/>
			<lve slot="5" name="114" begin="74" end="79"/>
			<lve slot="3" name="53" begin="7" end="80"/>
			<lve slot="4" name="57" begin="11" end="80"/>
			<lve slot="2" name="51" begin="3" end="80"/>
			<lve slot="0" name="17" begin="0" end="80"/>
			<lve slot="1" name="115" begin="0" end="80"/>
		</localvariabletable>
	</operation>
	<operation name="116">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="117"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="116"/>
			<pcall arg="50"/>
			<dup/>
			<push arg="113"/>
			<load arg="19"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="118"/>
			<push arg="119"/>
			<push arg="55"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="56"/>
			<pushf/>
			<pcall arg="59"/>
			<load arg="29"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="120" begin="22" end="23"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="118" begin="18" end="24"/>
			<lve slot="0" name="17" begin="0" end="24"/>
			<lve slot="1" name="113" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="121">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="122"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="121"/>
			<pcall arg="50"/>
			<dup/>
			<push arg="114"/>
			<load arg="19"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="118"/>
			<push arg="119"/>
			<push arg="55"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="56"/>
			<pushf/>
			<pcall arg="59"/>
			<load arg="29"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="123" begin="22" end="23"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="118" begin="18" end="24"/>
			<lve slot="0" name="17" begin="0" end="24"/>
			<lve slot="1" name="114" begin="0" end="24"/>
		</localvariabletable>
	</operation>
</asm>
