package OntologiaOrcamentoFederal;

import OntologiaOrcamentoFederal.impl.*;


import java.util.Collection;

import org.protege.owl.codegeneration.CodeGenerationFactory;
import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.FactoryHelper;
import org.protege.owl.codegeneration.impl.ProtegeJavaMapping;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.protege.owl.codegeneration.inference.SimpleInference;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * A class that serves as the entry point to the generated code providing access
 * to existing individuals in the ontology and the ability to create new individuals in the ontology.<p>
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: MyFactory<br>
 * @version generated on Tue Apr 18 15:42:56 BOT 2017 by kennedy
 */
public class MyFactory implements CodeGenerationFactory {
    private OWLOntology ontology;
    private ProtegeJavaMapping javaMapping = new ProtegeJavaMapping();
    private FactoryHelper delegate;
    private CodeGenerationInference inference;

    public MyFactory(OWLOntology ontology) {
	    this(ontology, new SimpleInference(ontology));
    }
    
    public MyFactory(OWLOntology ontology, CodeGenerationInference inference) {
        this.ontology = ontology;
        this.inference = inference;
        javaMapping.initialize(ontology, inference);
        delegate = new FactoryHelper(ontology, inference);
    }

    public OWLOntology getOwlOntology() {
        return ontology;
    }
    
    public void saveOwlOntology() throws OWLOntologyStorageException {
        ontology.getOWLOntologyManager().saveOntology(ontology);
    }
    
    public void flushOwlReasoner() {
        delegate.flushOwlReasoner();
    }
    
    public boolean canAs(WrappedIndividual resource, Class<? extends WrappedIndividual> javaInterface) {
    	return javaMapping.canAs(resource, javaInterface);
    }
    
    public  <X extends WrappedIndividual> X as(WrappedIndividual resource, Class<? extends X> javaInterface) {
    	return javaMapping.as(resource, javaInterface);
    }
    
    public Class<?> getJavaInterfaceFromOwlClass(OWLClass cls) {
        return javaMapping.getJavaInterfaceFromOwlClass(cls);
    }
    
    public OWLClass getOwlClassFromJavaInterface(Class<?> javaInterface) {
	    return javaMapping.getOwlClassFromJavaInterface(javaInterface);
    }
    
    public CodeGenerationInference getInference() {
        return inference;
    }

    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Acao
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Acao", Acao.class, DefaultAcao.class);
    }

    /**
     * Creates an instance of type Acao.  Modifies the underlying ontology.
     */
    public Acao createAcao(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ACAO, DefaultAcao.class);
    }

    /**
     * Gets an instance of type Acao with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Acao getAcao(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ACAO, DefaultAcao.class);
    }

    /**
     * Gets all instances of Acao from the ontology.
     */
    public Collection<? extends Acao> getAllAcaoInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ACAO, DefaultAcao.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Atividade
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Atividade", Atividade.class, DefaultAtividade.class);
    }

    /**
     * Creates an instance of type Atividade.  Modifies the underlying ontology.
     */
    public Atividade createAtividade(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ATIVIDADE, DefaultAtividade.class);
    }

    /**
     * Gets an instance of type Atividade with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Atividade getAtividade(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ATIVIDADE, DefaultAtividade.class);
    }

    /**
     * Gets all instances of Atividade from the ontology.
     */
    public Collection<? extends Atividade> getAllAtividadeInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ATIVIDADE, DefaultAtividade.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#CategoriaEconomica
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#CategoriaEconomica", CategoriaEconomica.class, DefaultCategoriaEconomica.class);
    }

    /**
     * Creates an instance of type CategoriaEconomica.  Modifies the underlying ontology.
     */
    public CategoriaEconomica createCategoriaEconomica(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_CATEGORIAECONOMICA, DefaultCategoriaEconomica.class);
    }

    /**
     * Gets an instance of type CategoriaEconomica with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public CategoriaEconomica getCategoriaEconomica(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_CATEGORIAECONOMICA, DefaultCategoriaEconomica.class);
    }

    /**
     * Gets all instances of CategoriaEconomica from the ontology.
     */
    public Collection<? extends CategoriaEconomica> getAllCategoriaEconomicaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_CATEGORIAECONOMICA, DefaultCategoriaEconomica.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Classificador
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Classificador", Classificador.class, DefaultClassificador.class);
    }

    /**
     * Creates an instance of type Classificador.  Modifies the underlying ontology.
     */
    public Classificador createClassificador(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_CLASSIFICADOR, DefaultClassificador.class);
    }

    /**
     * Gets an instance of type Classificador with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Classificador getClassificador(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_CLASSIFICADOR, DefaultClassificador.class);
    }

    /**
     * Gets all instances of Classificador from the ontology.
     */
    public Collection<? extends Classificador> getAllClassificadorInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_CLASSIFICADOR, DefaultClassificador.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#ElementoDespesa
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#ElementoDespesa", ElementoDespesa.class, DefaultElementoDespesa.class);
    }

    /**
     * Creates an instance of type ElementoDespesa.  Modifies the underlying ontology.
     */
    public ElementoDespesa createElementoDespesa(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ELEMENTODESPESA, DefaultElementoDespesa.class);
    }

    /**
     * Gets an instance of type ElementoDespesa with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public ElementoDespesa getElementoDespesa(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ELEMENTODESPESA, DefaultElementoDespesa.class);
    }

    /**
     * Gets all instances of ElementoDespesa from the ontology.
     */
    public Collection<? extends ElementoDespesa> getAllElementoDespesaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ELEMENTODESPESA, DefaultElementoDespesa.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Esfera
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Esfera", Esfera.class, DefaultEsfera.class);
    }

    /**
     * Creates an instance of type Esfera.  Modifies the underlying ontology.
     */
    public Esfera createEsfera(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ESFERA, DefaultEsfera.class);
    }

    /**
     * Gets an instance of type Esfera with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Esfera getEsfera(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ESFERA, DefaultEsfera.class);
    }

    /**
     * Gets all instances of Esfera from the ontology.
     */
    public Collection<? extends Esfera> getAllEsferaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ESFERA, DefaultEsfera.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Exercicio
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Exercicio", Exercicio.class, DefaultExercicio.class);
    }

    /**
     * Creates an instance of type Exercicio.  Modifies the underlying ontology.
     */
    public Exercicio createExercicio(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_EXERCICIO, DefaultExercicio.class);
    }

    /**
     * Gets an instance of type Exercicio with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Exercicio getExercicio(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_EXERCICIO, DefaultExercicio.class);
    }

    /**
     * Gets all instances of Exercicio from the ontology.
     */
    public Collection<? extends Exercicio> getAllExercicioInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_EXERCICIO, DefaultExercicio.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#FonteRecursos
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#FonteRecursos", FonteRecursos.class, DefaultFonteRecursos.class);
    }

    /**
     * Creates an instance of type FonteRecursos.  Modifies the underlying ontology.
     */
    public FonteRecursos createFonteRecursos(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_FONTERECURSOS, DefaultFonteRecursos.class);
    }

    /**
     * Gets an instance of type FonteRecursos with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public FonteRecursos getFonteRecursos(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_FONTERECURSOS, DefaultFonteRecursos.class);
    }

    /**
     * Gets all instances of FonteRecursos from the ontology.
     */
    public Collection<? extends FonteRecursos> getAllFonteRecursosInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_FONTERECURSOS, DefaultFonteRecursos.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Funcao
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Funcao", Funcao.class, DefaultFuncao.class);
    }

    /**
     * Creates an instance of type Funcao.  Modifies the underlying ontology.
     */
    public Funcao createFuncao(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_FUNCAO, DefaultFuncao.class);
    }

    /**
     * Gets an instance of type Funcao with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Funcao getFuncao(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_FUNCAO, DefaultFuncao.class);
    }

    /**
     * Gets all instances of Funcao from the ontology.
     */
    public Collection<? extends Funcao> getAllFuncaoInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_FUNCAO, DefaultFuncao.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#GrupoNatDespesa
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#GrupoNatDespesa", GrupoNatDespesa.class, DefaultGrupoNatDespesa.class);
    }

    /**
     * Creates an instance of type GrupoNatDespesa.  Modifies the underlying ontology.
     */
    public GrupoNatDespesa createGrupoNatDespesa(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_GRUPONATDESPESA, DefaultGrupoNatDespesa.class);
    }

    /**
     * Gets an instance of type GrupoNatDespesa with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public GrupoNatDespesa getGrupoNatDespesa(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_GRUPONATDESPESA, DefaultGrupoNatDespesa.class);
    }

    /**
     * Gets all instances of GrupoNatDespesa from the ontology.
     */
    public Collection<? extends GrupoNatDespesa> getAllGrupoNatDespesaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_GRUPONATDESPESA, DefaultGrupoNatDespesa.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#IdentificadorUSO
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#IdentificadorUSO", IdentificadorUSO.class, DefaultIdentificadorUSO.class);
    }

    /**
     * Creates an instance of type IdentificadorUSO.  Modifies the underlying ontology.
     */
    public IdentificadorUSO createIdentificadorUSO(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_IDENTIFICADORUSO, DefaultIdentificadorUSO.class);
    }

    /**
     * Gets an instance of type IdentificadorUSO with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public IdentificadorUSO getIdentificadorUSO(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_IDENTIFICADORUSO, DefaultIdentificadorUSO.class);
    }

    /**
     * Gets all instances of IdentificadorUSO from the ontology.
     */
    public Collection<? extends IdentificadorUSO> getAllIdentificadorUSOInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_IDENTIFICADORUSO, DefaultIdentificadorUSO.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#ItemDespesa
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#ItemDespesa", ItemDespesa.class, DefaultItemDespesa.class);
    }

    /**
     * Creates an instance of type ItemDespesa.  Modifies the underlying ontology.
     */
    public ItemDespesa createItemDespesa(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ITEMDESPESA, DefaultItemDespesa.class);
    }

    /**
     * Gets an instance of type ItemDespesa with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public ItemDespesa getItemDespesa(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ITEMDESPESA, DefaultItemDespesa.class);
    }

    /**
     * Gets all instances of ItemDespesa from the ontology.
     */
    public Collection<? extends ItemDespesa> getAllItemDespesaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ITEMDESPESA, DefaultItemDespesa.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#ModalidadeAplicacao
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#ModalidadeAplicacao", ModalidadeAplicacao.class, DefaultModalidadeAplicacao.class);
    }

    /**
     * Creates an instance of type ModalidadeAplicacao.  Modifies the underlying ontology.
     */
    public ModalidadeAplicacao createModalidadeAplicacao(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_MODALIDADEAPLICACAO, DefaultModalidadeAplicacao.class);
    }

    /**
     * Gets an instance of type ModalidadeAplicacao with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public ModalidadeAplicacao getModalidadeAplicacao(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_MODALIDADEAPLICACAO, DefaultModalidadeAplicacao.class);
    }

    /**
     * Gets all instances of ModalidadeAplicacao from the ontology.
     */
    public Collection<? extends ModalidadeAplicacao> getAllModalidadeAplicacaoInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_MODALIDADEAPLICACAO, DefaultModalidadeAplicacao.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#OperacaoEspecial
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#OperacaoEspecial", OperacaoEspecial.class, DefaultOperacaoEspecial.class);
    }

    /**
     * Creates an instance of type OperacaoEspecial.  Modifies the underlying ontology.
     */
    public OperacaoEspecial createOperacaoEspecial(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_OPERACAOESPECIAL, DefaultOperacaoEspecial.class);
    }

    /**
     * Gets an instance of type OperacaoEspecial with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public OperacaoEspecial getOperacaoEspecial(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_OPERACAOESPECIAL, DefaultOperacaoEspecial.class);
    }

    /**
     * Gets all instances of OperacaoEspecial from the ontology.
     */
    public Collection<? extends OperacaoEspecial> getAllOperacaoEspecialInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_OPERACAOESPECIAL, DefaultOperacaoEspecial.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Orgao
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Orgao", Orgao.class, DefaultOrgao.class);
    }

    /**
     * Creates an instance of type Orgao.  Modifies the underlying ontology.
     */
    public Orgao createOrgao(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ORGAO, DefaultOrgao.class);
    }

    /**
     * Gets an instance of type Orgao with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Orgao getOrgao(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ORGAO, DefaultOrgao.class);
    }

    /**
     * Gets all instances of Orgao from the ontology.
     */
    public Collection<? extends Orgao> getAllOrgaoInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ORGAO, DefaultOrgao.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#PlanoOrcamentario
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#PlanoOrcamentario", PlanoOrcamentario.class, DefaultPlanoOrcamentario.class);
    }

    /**
     * Creates an instance of type PlanoOrcamentario.  Modifies the underlying ontology.
     */
    public PlanoOrcamentario createPlanoOrcamentario(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PLANOORCAMENTARIO, DefaultPlanoOrcamentario.class);
    }

    /**
     * Gets an instance of type PlanoOrcamentario with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public PlanoOrcamentario getPlanoOrcamentario(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PLANOORCAMENTARIO, DefaultPlanoOrcamentario.class);
    }

    /**
     * Gets all instances of PlanoOrcamentario from the ontology.
     */
    public Collection<? extends PlanoOrcamentario> getAllPlanoOrcamentarioInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PLANOORCAMENTARIO, DefaultPlanoOrcamentario.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Programa
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Programa", Programa.class, DefaultPrograma.class);
    }

    /**
     * Creates an instance of type Programa.  Modifies the underlying ontology.
     */
    public Programa createPrograma(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PROGRAMA, DefaultPrograma.class);
    }

    /**
     * Gets an instance of type Programa with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Programa getPrograma(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PROGRAMA, DefaultPrograma.class);
    }

    /**
     * Gets all instances of Programa from the ontology.
     */
    public Collection<? extends Programa> getAllProgramaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PROGRAMA, DefaultPrograma.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Projeto
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Projeto", Projeto.class, DefaultProjeto.class);
    }

    /**
     * Creates an instance of type Projeto.  Modifies the underlying ontology.
     */
    public Projeto createProjeto(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PROJETO, DefaultProjeto.class);
    }

    /**
     * Gets an instance of type Projeto with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Projeto getProjeto(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PROJETO, DefaultProjeto.class);
    }

    /**
     * Gets all instances of Projeto from the ontology.
     */
    public Collection<? extends Projeto> getAllProjetoInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PROJETO, DefaultProjeto.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#ResultadoPrimario
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#ResultadoPrimario", ResultadoPrimario.class, DefaultResultadoPrimario.class);
    }

    /**
     * Creates an instance of type ResultadoPrimario.  Modifies the underlying ontology.
     */
    public ResultadoPrimario createResultadoPrimario(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_RESULTADOPRIMARIO, DefaultResultadoPrimario.class);
    }

    /**
     * Gets an instance of type ResultadoPrimario with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public ResultadoPrimario getResultadoPrimario(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_RESULTADOPRIMARIO, DefaultResultadoPrimario.class);
    }

    /**
     * Gets all instances of ResultadoPrimario from the ontology.
     */
    public Collection<? extends ResultadoPrimario> getAllResultadoPrimarioInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_RESULTADOPRIMARIO, DefaultResultadoPrimario.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Subfuncao
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Subfuncao", Subfuncao.class, DefaultSubfuncao.class);
    }

    /**
     * Creates an instance of type Subfuncao.  Modifies the underlying ontology.
     */
    public Subfuncao createSubfuncao(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SUBFUNCAO, DefaultSubfuncao.class);
    }

    /**
     * Gets an instance of type Subfuncao with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Subfuncao getSubfuncao(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SUBFUNCAO, DefaultSubfuncao.class);
    }

    /**
     * Gets all instances of Subfuncao from the ontology.
     */
    public Collection<? extends Subfuncao> getAllSubfuncaoInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SUBFUNCAO, DefaultSubfuncao.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#Subtitulo
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#Subtitulo", Subtitulo.class, DefaultSubtitulo.class);
    }

    /**
     * Creates an instance of type Subtitulo.  Modifies the underlying ontology.
     */
    public Subtitulo createSubtitulo(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SUBTITULO, DefaultSubtitulo.class);
    }

    /**
     * Gets an instance of type Subtitulo with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Subtitulo getSubtitulo(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SUBTITULO, DefaultSubtitulo.class);
    }

    /**
     * Gets all instances of Subtitulo from the ontology.
     */
    public Collection<? extends Subtitulo> getAllSubtituloInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SUBTITULO, DefaultSubtitulo.class);
    }


    /* ***************************************************
     * Class https://github.com/kennedyrs/orcamento-federal#UnidadeOrcamentaria
     */

    {
        javaMapping.add("https://github.com/kennedyrs/orcamento-federal#UnidadeOrcamentaria", UnidadeOrcamentaria.class, DefaultUnidadeOrcamentaria.class);
    }

    /**
     * Creates an instance of type UnidadeOrcamentaria.  Modifies the underlying ontology.
     */
    public UnidadeOrcamentaria createUnidadeOrcamentaria(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_UNIDADEORCAMENTARIA, DefaultUnidadeOrcamentaria.class);
    }

    /**
     * Gets an instance of type UnidadeOrcamentaria with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public UnidadeOrcamentaria getUnidadeOrcamentaria(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_UNIDADEORCAMENTARIA, DefaultUnidadeOrcamentaria.class);
    }

    /**
     * Gets all instances of UnidadeOrcamentaria from the ontology.
     */
    public Collection<? extends UnidadeOrcamentaria> getAllUnidadeOrcamentariaInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_UNIDADEORCAMENTARIA, DefaultUnidadeOrcamentaria.class);
    }


}