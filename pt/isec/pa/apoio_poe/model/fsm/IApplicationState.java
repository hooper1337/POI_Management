package pt.isec.pa.apoio_poe.model.fsm;

import pt.isec.pa.apoio_poe.model.data.person.Person;
import java.util.ArrayList;
import java.util.List;

public interface IApplicationState {
    boolean insertData(String file);

    ArrayList<String> checkData();

    boolean editDataProposal(String identifier, String attribute, List<String> newValue);

    boolean editDataProfessor(String email, String advisor);

    boolean editDataStudent(String identifier, String change, String whatToChange);

    boolean deleteData(String identifier);

    boolean chooseType(String type);

    boolean closeState();

    boolean studentTransitioning();

    boolean professorTransitioning();

    boolean proposalTransitioning();

    boolean candidatureTransitioning();

    ArrayList<String> listStudentsWithAutoProposal();

    ArrayList<String> listStudentsWithCandidature();

    ArrayList<String> listStudentsWithoutCandidature();

    String listAutoProposalWithoutCandidatures();

    String listAutoProposalWithCandidatures();

    boolean proposalAttributionTransitioning();

    boolean associateAttribution();

    boolean nonAssociateAttribution();

    boolean chooseStudentToAssociate(String index);

    ArrayList<Person> getTies();

    boolean manualAttribution(String idOfProposal, String idOfStudent);

    boolean manualRemoval(String idOfProposal);

    boolean professorAttributionTransitioning();

    ArrayList<String> listStudentsWithProposalWithoutProfessor();

    ArrayList<String> listStudentsWithProposalAndProfessor();

    String averageProfessorAttributions();

    String minimumProfessorAttributions();

    String maximumProfessorAttributions();

    String specificProfessorAttributions(String email);

    boolean listProposalsWithAttributions();

    boolean listProposalsWithoutAttributions();

    boolean listStudentsWithProposals();

    boolean listStudentsWithoutProposalsWithCandidature();

    ApplicationState getState();

    boolean removeProposalFromCandidature(String id, String proposal);

    boolean removeCandidature(String id);

    boolean editCandidatures(String id, String proposal);

    ArrayList<String> listProposalsFilters(List<String> filters);

    ArrayList<String> listStudentWithProposalAttributed();

    ArrayList<String> listStudentWithoutProposalAttributed();

    boolean manualProfessorAttribution(String idOfProposal, String emailProfessor);

    boolean manualProfessorRemoval(String email, String idOfProposal);

    String getProfessorByEmail(String email);

    ArrayList<String> listProfessorAttributions();

    void exportData();
}