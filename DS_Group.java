
import java.util.Scanner;

class Words{
    String name;
    String definition;
    Words(String name,String definition){
        this.name=name;
        this.definition=definition;
    }
}
class Main1 {
    static Scanner sc = new Scanner(System.in);
    static LL l1 = new LL();
    static LL fav = new LL();

    public static void main(String[] args) throws Exception {
        add_Words();
        LL.Node temp = l1.first;

        System.out.println("|>        Dictionary         <|");
        do {
            try {
                System.out.println("───────────────────────────────");
                System.out.println("|\t\t\tMENU\t\t\t             |");
                System.out.println("───────────────────────────────");
                System.out.println("|\t1. Search for a word\t     |");
                System.out.println("|\t2. Add a new word\t\t      |");
                System.out.println("|\t3. Edit definition\t\t     |");
                System.out.println("|\t4. Delete a word\t\t       |");
                System.out.println("|\t5. Display all words\t     |");
                System.out.println("|\t6. Add word to Favourites  |");
                System.out.println("|\t7. Display Favourites\t    |");
                System.out.println("|\t8. Display Homonyms\t\t    |");
                System.out.println("|\t9. Exit\t\t\t\t\t          |");
                System.out.println("───────────────────────────────");
                System.out.print("|> Enter choice: ");
                int x = sc.nextInt();

                sc.nextLine();
                switch (x) {
                    case 1:
                        search();
                        break;
                    case 2:
                        add_Word();
                        break;
                    case 3:
                        edit();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        display(l1);
                        break;
                    case 6:
                        add_Favourites();
                        break;
                    case 7:
                        display_fav();
                        break;
                    case 8:
                        display_homonyms();
                        break;
                    case 9:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("enter a valid choice");
                sc.nextLine();
            }
        }
        while (true);
    }

    static void add_Words() {
        l1.add("bat", "a flying mammal");
        l1.add("bat", "a piece of sports equipment used in baseball");
        l1.add("bass", "a type of fish");
        l1.add("bass", "low-frequency sound or voice");
        l1.add("lead", "to guide or show the way");
        l1.add("lead", "a type of heavy metal");
        l1.add("row", "a line of things arranged side by side");
        l1.add("row", "to paddle a boat");
        l1.add("tear", "a drop of liquid from the eye");
        l1.add("tear", "to rip or pull apart");
        l1.add("wound", "an injury to the body");
        l1.add("wound", "past tense of 'wind' (to twist or turn)");
        l1.add("bark", "the outer covering of a tree");
        l1.add("bark", "the sound a dog makes");
        l1.add("close", "near in distance or time");
        l1.add("close", "to shut or seal");
        l1.add("content", "the information or material within something");
        l1.add("content", "satisfied or pleased");
        l1.add("minute", "a unit of time");
        l1.add("minute", "very small or tiny");
        l1.add("beautiful", "possessing qualities that delight the senses and please the mind. It is visually appealing and attractive.");
        l1.add("gorgeous", "possessing qualities that delight the senses and please the mind. It is visually appealing and attractive.");
        l1.add("courageous", "displaying bravery and the ability to confront challenges, often despite fear or adversity.");
        l1.add("valiant", "displaying bravery and the ability to confront challenges, often despite fear or adversity.");
        l1.add("confused", "being uncertain or unclear about something, often leading to a lack of understanding or direction.");
        l1.add("bewildered", "being uncertain or unclear about something, often leading to a lack of understanding or direction.");
        l1.add("intelligent", "possessing a high level of mental capacity, understanding, and the ability to learn and apply knowledge.");
        l1.add("smart", "possessing a high level of mental capacity, understanding, and the ability to learn and apply knowledge.");
        l1.add("calm", "experiencing a peaceful and tranquil state of mind, often in the face of challenges or stress.");
        l1.add("serene", "experiencing a peaceful and tranquil state of mind, often in the face of challenges or stress.");
        l1.add("begin", "to initiate or start a particular course of action or event. It marks the initial phase of an activity.");
        l1.add("commence", "to initiate or start a particular course of action or event. It marks the initial phase of an activity.");
        l1.add("happy", "experiencing or showing feelings of contentment and pleasure. It represents a positive emotional state.");
        l1.add("joyful", "experiencing or showing feelings of contentment and pleasure. It represents a positive emotional state.");
        l1.add("famous", "being widely recognized and acclaimed for one's achievements or qualities. It involves widespread renown.");
        l1.add("renowned", "being widely recognized and acclaimed for one's achievements or qualities. It involves widespread renown.");
        l1.add("angry", "feeling strong displeasure and often displaying a visible or emotional reaction to a perceived injustice.");
        l1.add("irate", "feeling strong displeasure and often displaying a visible or emotional reaction to a perceived injustice.");
        l1.add("hurry", "to move or act with a sense of urgency or haste, often due to time constraints or a pressing situation.");
        l1.add("rush", "to move or act with a sense of urgency or haste, often due to time constraints or a pressing situation.");

        l1.add("Banana", "A long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.");
        l1.add("Cat", " Small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws. It is widely kept as a pet or for catching mice, and many breeds have been developed");
        l1.add("Apple", "A round fruit with thin red or green skin and a crisp white flesh.");
        l1.add("Aplomb", "Self-confidence or assurance, especially in a demanding situation.");
        l1.add("Amiable", "Having  displaying a friendly and pleasant manner.");
        l1.add("Astronomy", "The scientific study of celestial objects, space, and the universe.");
        l1.add("Aardvark", "A nocturnal burrowing mammal with a long snout and sticky tongue, feeding on ants.");
        l1.add("Acumen", "The ability to make good judgments and quick decisions.");
        l1.add("Alacrity", "Cheerful readiness or willingness.");
        l1.add("Aloof", "Not friendly or forthcoming; cool and distant.");
        l1.add("Ambiguous", "Open to more than one interpretation; not having a clear meaning.");
        l1.add("Amorphous", "Without a clearly defined shape or form.");
        l1.add("Aberration", "A departure from what is normal, usual, or expected.");
        l1.add("Abscond", "To leave hurriedly and secretly, typically to avoid detection or arrest.");
        l1.add("Abyss", "A deep or seemingly bottomless chasm.");
        l1.add("Adamant", "Refusing to be persuaded or to change one's mind.");
        l1.add("Aesthetic", "Concerned with beauty or the appreciation of beauty.");
        l1.add("Affable", "Friendly, good-natured, and easy to talk to.");
        l1.add("Agile", "Able to move quickly and easily.");
        l1.add("Alleviate", "To make (suffering, deficiency, or a problem) less severe.");
        l1.add("Allure", "The quality of being powerfully and mysteriously attractive or fascinating.");
        l1.add("Amass", "To gather together or accumulate a large quantity of something.");
        l1.add("Benevolent", "Well meaning and kindly.");
        l1.add("Belligerent", "Hostile and aggressive.");
        l1.add("Boisterous", "Noisy, energetic, and cheerful; rowdy.");
        l1.add("Bucolic", "Relating to the pleasant aspects of the countryside and country life.");
        l1.add("Beneath", "In a lower position; below.");
        l1.add("Blatant", "Done openly and unashamedly.");
        l1.add("Brevity", "Concise and exact use of words in writing or speech.");
        l1.add("Bizarre", "Very strange or unusual, especially so as to cause interest or amusement.");
        l1.add("Berate", "Scold or criticize angrily.");
        l1.add("Bliss", "Perfect happiness; great joy.");
        l1.add("Bewilder", "Cause someone to become perplexed and confused.");
        l1.add("Boycott", "Withdraw from commercial or social relations with (a country, organization, or person) as a punishment or protest.");
        l1.add("Bravado", "A bold manner or a show of boldness intended to impress or intimidate.");
        l1.add("Brouhaha", "A noisy and overexcited reaction or response to something.");
        l1.add("Burgeon", "Begin to grow or increase rapidly; flourish.");
        l1.add("Bemuse", "Puzzle, confuse, or bewilder (someone).");
        l1.add("Bland", "Lacking strong features or characteristics and therefore uninteresting.");
        l1.add("Ubiquitous", "Present, appearing, or found everywhere.");
        l1.add("Ultimate", "Being or happening at the end of a process; final.");
        l1.add("Umbrage", "Offense or annoyance.");
        l1.add("Unanimous", "Fully in agreement.");
        l1.add("Unassuming", "Not pretentious or arrogant; modest.");
        l1.add("Uncanny", "Strange or mysterious, especially in an unsettling way.");
        l1.add("Undermine", "Erode the base or foundation of (a rock formation).");
        l1.add("Unique", "Being the only one of its kind; unlike anything else.");
        l1.add("Unprecedented", "Never done or known before.");
        l1.add("Voracious", "Wanting or devouring great quantities of food.");
        l1.add("Unrelenting", "Not yielding in strength, severity, or determination.");
        l1.add("Unravel", "Undo (twisted, knitted, or woven threads).");
        l1.add("Unveil", "Remove a veil or covering from, especially uncover (a new monument or work of art) as part of a public ceremony.");
        l1.add("Upbraid", "Find fault with (someone); scold.");
        l1.add("Uproarious", "Characterized by or provoking loud noise or uproar.");
        l1.add("Usurp", "Take (a position of power or importance) illegally or by force.");
        l1.add("Utilitarian", "Designed to be useful or practical rather than attractive.");
        l1.add("Vacillate", "Alternate or waver between different opinions or actions; be indecisive.");
        l1.add("Vehement", "Showing strong feeling; forceful, passionate, or intense.");
        l1.add("Venerate", "Regard with great respect; revere.");
        l1.add("Verbose", "Using or expressed in more words than are needed.");
        l1.add("Vex", "Make (someone) feel annoyed, frustrated, or worried, especially with trivial matters.");
        l1.add("Viable", "Capable of working successfully; feasible.");
        l1.add("Vigilant", "Keeping careful watch for possible danger or difficulties.");
        l1.add("Wane", "Have a progressively smaller part of its visible surface illuminated, so that it appears to decrease in size.");
        l1.add("Whimsical", "Playfully quaint or fanciful, especially in an appealing and amusing way.");
        l1.add("Wistful", "Having or showing a feeling of vague or regretful longing.");
        l1.add("Wrangle", "Have a long, complicated dispute or argument.");
        l1.add("Xenophobia", "Dislike of or prejudice against people from other countries.");
        l1.add("Yield", "Produce or provide (a natural, agricultural, or industrial product).");
        l1.add("Yearn", "Have an intense feeling of longing for something.");
        l1.add("Zany", "Amusingly unconventional and idiosyncratic.");
        l1.add("Zeal", "Great energy or enthusiasm in pursuit of a cause or an objective.");
        l1.add("Zenith", "The time at which something is most powerful or successful.");
        l1.add("Cacophony ", "A harsh, discordant mixture of sounds.");
        l1.add("Candid ", "Honest and straightforward in speech or behavior.");
        l1.add("Capacious ", "Having a lot of space inside; roomy.");
        l1.add("Capitulate ", "To surrender or give in to an opponent's terms.");
        l1.add("Carnivorous ", "Feeding on flesh or meat.");
        l1.add("Catalyst ", "A substance that speeds up a chemical reaction without being consumed in the process.");
        l1.add("Cautious ", "Showing care and consideration in avoiding potential risks or problems.");
        l1.add("Celestial ", "Relating to the sky or the heavens; divine or celestial bodies like stars and planets.");
        l1.add("Censure ", "Strong criticism or disapproval.");
        l1.add("Chronic ", "Persisting over a long period of time or characterized by a long duration.");
        l1.add("Circumspect ", "Cautious and watchful; considering all possible consequences before acting.");
        l1.add("Clandestine ", "Done in secrecy or concealed to hide motives.");
        l1.add("Coalesce ", "To come together to form a single mass or whole; to blend or merge.");
        l1.add("Cognitive ", "Relating to mental processes such as perception, memory, and reasoning.");
        l1.add("Collaborate ", "To work together on a project or task, often implying cooperation and joint effort.");
        l1.add("Comprehensive ", "Covering or including a wide range; thorough and complete.");
        l1.add("Concur ", "To agree or share an opinion.");
        l1.add("Confluence ", "The act of flowing together; a meeting or merging of things.");
        l1.add("Congenial ", "Pleasant and friendly; having a compatible or agreeable nature.");
        l1.add("Conscientious ", "Showing great care, diligence, and attention to detail.");
        l1.add("Contemplate ", "To think deeply and carefully about something.");
        l1.add("Contrite ", "Feeling regret and sorrow for one's sins or mistakes; remorseful.");
        l1.add("Conundrum ", "A confusing and difficult problem or question.");
        l1.add("Diligent ", "Showing careful and persistent effort; hardworking and thorough.");
        l1.add("Diverse ", "Composed of different elements, varied in type or character.");
        l1.add("Dynamics ", "The forces or properties that stimulate growth, development, or change within a system.");
        l1.add("Dystopia ", "An imagined place or state where everything is unpleasant, undesirable, or oppressive.");
        l1.add("Delectable ", "Extremely pleasing to the senses, especially taste and smell; delicious.");
        l1.add("Defenestration ", "The act of throwing someone out of a window, historically associated with political incidents.");
        l1.add("Demure ", "Reserved, modest, and shy in a way that reflects a sense of proper behavior.");
        l1.add("Dichotomy ", "A division or contrast between two things that are represented as being entirely different.");
        l1.add("Didactic ", "Intended to teach or instruct, often in a moralizing or pedantic manner.");
        l1.add("Diffident ", "Lacking self-confidence, shy, and hesitant due to a lack of self-assurance.");
        l1.add("Diligence ", "Careful and persistent effort, often in completing tasks or achieving goals.");
        l1.add("Disparate ", "Essentially different or distinct; not comparable due to significant differences.");
        l1.add("Dogmatic ", "Expressing strong and unwavering beliefs or opinions, often without sufficient evidence.");
        l1.add("Dormant ", "In a state of rest or inactivity, but capable of becoming active at a later time.");
        l1.add("Dwindle ", "To gradually become smaller, weaker, or less in number.");
        l1.add("Dynamic ", "Characterized by change, energy, or motion; constantly evolving or active.");
        l1.add("Dysfunctional ", "Not operating normally or properly; impaired in function.");
        l1.add("Dystrophy ", "A disorder that results in the wasting away or degeneration of body tissues or organs.");
        l1.add("Decipher ", "To interpret or convert coded or unclear information into understandable form.");
        l1.add("Deference ", "Respectful submission to the opinion, wishes, or judgment of another person.");
        l1.add("Eloquent ", "Fluent and persuasive in speech or writing; expressing ideas in a compelling and articulate manner.");
        l1.add("Empathy ", "The ability to understand and share the feelings of another person; showing compassion and sensitivity.");
        l1.add("Ephemeral ", "Lasting for a very short time; transient or fleeting.");
        l1.add("Equanimity ", "Calmness and composure, especially in difficult situations; maintaining emotional balance.");
        l1.add("Esoteric ", "Understood or known by only a small group of people with a specialized knowledge or interest.");
        l1.add("Ethereal ", "Delicate, airy, and otherworldly; extremely light or subtle in a way that seems almost spiritual.");
        l1.add("Exacerbate ", "To make a situation, problem, or feeling worse; to intensify or worsen");
        l1.add("Exemplify ", "To serve as a typical or representative example of something; to demonstrate or illustrate.");
        l1.add("Exuberant ", "Full of energy, excitement, and enthusiasm; lively and animated.");
        l1.add("Ebullient ", "Overflowing with enthusiasm, excitement, or positive emotions; exuberant.");
        l1.add("Eccentric ", "Unconventional, peculiar, or deviating from the norm; having unusual behaviors or ideas.");
        l1.add("Efficacious ", "Capable of producing the desired effect or result; effective in achieving a specific goal.");
        l1.add("Egalitarian ", "Believing in and advocating for equality and fairness for all people, regardless of their background or status.");
        l1.add("Elicit ", "To draw out or evoke a response, emotion, or information from someone through questioning or actions.");
        l1.add("Elucidate ", "To make something clear or explain in detail; to shed light on a complex or unclear topic.");
        l1.add("Emulate ", "To imitate, mimic, or follow as an example in order to achieve similar results.");
        l1.add("Enigmatic ", "Mysterious, puzzling, and difficult to understand; having an aura of mystery.");
        l1.add("Epiphany ", "A sudden realization or insight that leads to a deep understanding or new perspective.");
        l1.add("Equivocate ", "To use ambiguous or vague language to avoid making a direct statement or commitment.");
        l1.add("Eradicate ", "To completely remove or eliminate something, such as a disease, problem, or obstacle.");
        l1.add("Fervent ", "Having intense passion, enthusiasm, or emotion; showing strong and sincere feelings.");
        l1.add("Formidable ", "Inspiring fear or respect due to being impressive, powerful, or difficult to overcome.");
        l1.add("Furtive ", "Done in a secretive or sneaky manner; attempting to avoid attention or discovery.");
        l1.add("Fragile ", "Easily breakable, delicate, or sensitive; lacking robustness or strength.");
        l1.add("Frenetic ", "Frantic, frenzied, and filled with chaotic energy or activity.");
        l1.add("Fickle ", "Changing one's mind or loyalties frequently and unpredictably; not reliable or consistent.");
        l1.add("Fortuitous ", "Happening by chance or luck, often in a positive and unexpected way.");
        l1.add("Fluctuate ", "To change or vary irregularly, often between high and low points.");
        l1.add("Forsake ", "To abandon, renounce, or give up something or someone, often out of necessity or choice.");
        l1.add("Flamboyant ", "Flashy, showy, or extravagantly colorful; characterized by striking or bold appearance.");
        l1.add("Forbearance ", "Patience, self-control, and tolerance, especially in the face of provocation or difficulties.");
        l1.add("Felicitous ", "Well-suited, appropriate, and pleasing in a particular context; fortunate or well-chosen.");
        l1.add("Facade ", "The front of a building; also, a superficial or deceptive appearance that hides true intentions or feelings.");
        l1.add("Flourish ", "To grow or develop in a healthy or vigorous way; to thrive and prosper");
        l1.add("Galvanize ", "To shock or excite someone into taking action; to stimulate with a sudden burst of energy or motivation.");
        l1.add("Garrulous ", "Talkative and chatty, often to an excessive or annoying degree.");
        l1.add("Gravity ", "The force that attracts two masses toward each other; seriousness or significance, often relating to a situation or demeanor.");
        l1.add("Grandiose ", "Impressive in a showy and exaggerated way; characterized by extravagant ambition or pretentiousness.");
        l1.add("Gratuitous ", "Given or done without any good reason; unnecessary or unwarranted.");
        l1.add("Gist ", "The main point or essential part of something; the core idea or essence.");
        l1.add("Guile ", "Deceptive cunning or skillful deceit; the use of clever strategies to achieve one's goals while hiding one's true intentions.");
        l1.add("Gumption ", "Initiative, resourcefulness, and practical intelligence; the ability to take action and make wise decisions.");
        l1.add("Gullible ", "Easily deceived or tricked due to being too trusting or naive.");
        l1.add("Genial ", "Friendly, kind, and warmly cheerful in manner or disposition.");
        l1.add("Genuflect ", "To kneel on one knee as a sign of respect or worship.");
        l1.add("Gratify ", "To give pleasure or satisfaction to someone; to fulfill desires or wishes.");
        l1.add("Gravitate ", "To be naturally drawn or attracted toward something; to move or tend to move in a certain direction.");
        l1.add("Grievance ", "A real or perceived injustice or complaint; a reason for feeling wronged.");
        l1.add("Grandiloquent ", "Using high-sounding or impressive language to impress or exaggerate; overly pompous or bombastic in speech.");
        l1.add("Gourmand ", "A person who enjoys eating and often eats in large quantities; a lover of good food.");
        l1.add("Gregarious ", "Fond of company; sociable and enjoying the company of others.");
        l1.add("Grueling ", "Extremely tiring and demanding; requiring great effort and stamina.");
        l1.add("Guileless ", "Innocent and without deception; sincere and straightforward in behavior.");
        l1.add("Hapless ", "Unfortunate or unlucky; marked by a lack of success or favorable circumstances.");
        l1.add("Harmony ", "A pleasing arrangement of parts that creates a sense of unity and balance; agreement or compatibility between elements.");
        l1.add("Hypothetical ", "Based on a suggested idea or theory rather than being proven or confirmed; speculative or assumed.");
        l1.add("Hedonistic ", "Devoted to the pursuit of pleasure and self-indulgence, often without regard for moral or ethical considerations.");
        l1.add("Hesitant ", "Showing a reluctance or uncertainty to act, speak, or decide; hesitant.");
        l1.add("Hubris ", "Excessive pride or self-confidence that often leads to arrogance and a disregard for others; a sense of superiority.");
        l1.add("Humble ", "Having a modest and unpretentious attitude; not thinking too highly of oneself.");
        l1.add("Herald ", "To announce or indicate the approach of something; a person or thing that serves as a sign or symbol of something to come.");
        l1.add("Hermetic ", "Airtight or tightly sealed; also used to describe something that is isolated, secret, or hidden from outside influences.");
        l1.add("Hypocrisy ", "Pretending to have beliefs, virtues, or qualities that one does not actually possess; the practice of saying one thing and doing another.");
        l1.add("Herculean ", "Requiring tremendous effort, strength, or courage; extremely difficult or challenging.");
        l1.add("Heinous ", "Extremely wicked, atrocious, or shockingly evil; morally reprehensible.");
        l1.add("Homogeneous ", "Consisting of elements that are similar or of the same kind; uniform in structure or composition.");
        l1.add("Hyperbole ", "Exaggerated statements or claims not meant to be taken literally; an intentional overstatement.");
        l1.add("Hilarity ", "Great amusement, cheerfulness, and merriment; a state of extreme laughter and enjoyment.");
        l1.add("Harangue ", "A lengthy and aggressive speech or verbal attack, often delivered in a forceful and critical manner.");
        l1.add("Hackneyed ", "Overused, clichéd, and lacking originality; no longer effective or interesting due to excessive repetition.");
        l1.add("Histrionic ", "Excessively dramatic or theatrical in behavior, speech, or mannerisms; seeking attention in a melodramatic way.");
        l1.add("Humanitarian ", "Concerned with promoting the well-being and rights of all humans; characterized by compassion and empathy for others.");
        l1.add("Obfuscate", "To make something unclear or difficult to understand.");
        l1.add("Ominous", "Giving the impression that something bad is about to happen.");
        l1.add("Opaque", "Not able to be seen through; not transparent.");
        l1.add("Obsolete", "No longer in use or relevant.");
        l1.add("Odious", "Extremely unpleasant or repulsive.");
        l1.add("Omnipotent", "Having unlimited or great power.");
        l1.add("Ostracize", "Exclude or reject someone from a group.");
        l1.add("Opulent", "Showing great wealth and luxury.");
        l1.add("Overt", "Done openly or publicly; not hidden.");
        l1.add("Ornate", "Elaborately decorated; highly detailed.");
        l1.add("Optimistic", "Having a positive outlook or expectation.");
        l1.add("Onomatopoeia", "A word that imitates the sound it represents (e.g., 'buzz,' 'bang').");
        l1.add("Ostentatious", "Designed to impress or attract attention.");
        l1.add("Opportune", "Well-suited for a particular purpose; timely.");
        l1.add("Outlandish", "Unconventional, strange, or bizarre.");
        l1.add("Overwhelm", "To be overcome by a large amount or intensity.");
        l1.add("Oblique", "Not explicit or done openly; indirect.");
        l1.add("Oracle", "A person or thing that provides wise counsel or prophetic predictions.");
        l1.add("Outspoken", "Frank and candid in expressing one's opinions.");
        l1.add("Pensive", "Deeply thoughtful or contemplative.");
        l1.add("Palatable", "Having a pleasant or agreeable taste.");
        l1.add("Pernicious", "Having a harmful effect, especially in a gradual or subtle way.");
        l1.add("Plausible", "Seeming reasonable or probable.");
        l1.add("Prudent", "Showing careful and sensible judgment.");
        l1.add("Prolific", "Producing many works, results, or offspring.");
        l1.add("Pugnacious", "Eager to fight or argue.");
        l1.add("Placid", "Calm and peaceful, with little movement or activity.");
        l1.add("Pernickety", "Fussy or difficult to please, especially about trivial matters.");
        l1.add("Precarious", "Not securely held or in position; dangerously uncertain.");
        l1.add("Profound", "Having great depth or seriousness.");
        l1.add("Pedantic", "Excessively concerned with minor details or rules.");
        l1.add("Perceptive", "Having an ability to understand or notice things quickly.");
        l1.add("Parsimonious", "Unwilling to spend money or use resources; stingy.");
        l1.add("Phenomenal", "Remarkable or extraordinary, especially in a positive way.");
        l1.add("Pervasive", "Spreading widely throughout an area or group.");
        l1.add("Pragmatic", "Dealing with things in a practical and sensible way.");
        l1.add("Pithy", "Concise and forcefully expressive.");
        l1.add("Procrastinate", "Delay or postpone action; put off doing something.");
        l1.add("Ponder", "Think about something carefully, especially before making a decision.");
        l1.add("Qubit", "The fundamental unit of quantum information.");
        l1.add("Quintessential", "Representing the most perfect or typical example of a quality.");
        l1.add("Quell", "To suppress or extinguish something, usually a rebellion or emotion.");
        l1.add("Quixotic", "Exceedingly idealistic, unrealistic, and impractical.");
        l1.add("Quagmire", "A difficult or complex situation; a marshy area of land.");
        l1.add("Quorum", "The minimum number of members required to conduct an official meeting.");
        l1.add("Quench", "To satisfy one's thirst or desire; to extinguish or suppress.");
        l1.add("Quibble", "A minor objection or criticism; to argue or complain about trivial matters.");
        l1.add("Quota", "A predetermined share or portion, especially in terms of numbers or quantities.");
        l1.add("Query", "A question or inquiry; to ask for information or clarification.");
        l1.add("Queasy", "Feeling nauseous or uneasy; causing discomfort or unease.");
        l1.add("Quandary", "A state of uncertainty or dilemma; a difficult choice between options.");
        l1.add("Quip", "A clever or witty remark; to make a clever remark.");
        l1.add("Quietude", "A state of calmness or tranquility; quietness.");
        l1.add("Quiescent", "Being inactive or at rest; temporarily quiet or still.");
        l1.add("Quicken", "To accelerate or stimulate; to become more intense or lively.");
        l1.add("Quirk", "An unusual or unexpected aspect of someone's character or behavior.");
        l1.add("Quintet", "A group of five people or things, especially in music.");
        l1.add("Quaver", "To shake or tremble; a musical note with a short duration.");
        l1.add("Resilient", "Able to withstand or recover from difficult conditions.");
        l1.add("Retrograde", "Moving backward or declining in quality.");
        l1.add("Rambunctious", "Energetic in a noisy and lively way.");
        l1.add("Reticent", "Reserved or hesitant, especially in speech.");
        l1.add("Reverberate", "To echo or resound repeatedly.");
        l1.add("Rhapsody", "An exalted or ecstatic expression of feeling.");
        l1.add("Raucous", "Loud, harsh, and disorderly.");
        l1.add("Rigorous", "Thorough, strict, and demanding high standards.");
        l1.add("Reclusive", "Avoiding the company of others; solitary.");
        l1.add("Rambler", "A person who walks for pleasure or wanders without a definite destination.");
        l1.add("Rejuvenate", "To make someone or something feel younger or fresher.");
        l1.add("Rapid", "Happening in a short time; fast or quick.");
        l1.add("Repudiate", "To reject, deny, or disown.");
        l1.add("Rendezvous", "A meeting or gathering at a prearranged time and place.");
        l1.add("Resplendent", "Shining or glowing with great brightness.");
        l1.add("Reticulate", "Having a net-like or intricate pattern.");
        l1.add("Robust", "Strong, healthy, and vigorous.");
        l1.add("Ravenous", "Fiercely eager or hungry.");
        l1.add("Reverent", "Feeling deep respect or admiration.");
        l1.add("Serendipity", "The occurrence of pleasant events by chance.");
        l1.add("Surreptitious", "Done in a secretive or stealthy manner.");
        l1.add("Sycophant", "A person who acts obsequiously to gain advantage.");
        l1.add("Sardonic", "Mocking or cynical in a scornful way.");
        l1.add("Supercilious", "Behaving as if one is superior to others.");
        l1.add("Sanguine", "Optimistic or positive, especially in a difficult situation.");
        l1.add("Sycamore", "A type of tree with distinctive winged seeds.");
        l1.add("Sesquipedalian", "A long word, characterized by long words.");
        l1.add("Serendipitous", "Occurring by chance in a happy or beneficial way.");
        l1.add("Sophistry", "The use of clever but false arguments.");
        l1.add("Salubrious", "Health-giving; promoting health or well-being.");
        l1.add("Sibilant", "A hissing sound.");
        l1.add("Soliloquy", "An act of speaking one's thoughts aloud when alone.");
        l1.add("Sardine", "A small oily fish often packed in tight rows in cans.");
        l1.add("Stalwart", "Loyal, reliable, and hardworking.");
        l1.add("Somnambulist", "A sleepwalker.");
        l1.add("Sycophancy", "Excessive flattery or praise for self-gain.");
        l1.add("Soporific", "Tending to induce drowsiness or sleep.");
        l1.add("Strident", "Loud and harsh; grating.");
        l1.add("Serene", "Calm, peaceful, and untroubled.");
        l1.add("Tangible", "Perceptible by touch; capable of being touched or felt.");
        l1.add("Turbulent", "Characterized by conflict, disorder, or confusion.");
        l1.add("Tenacious", "Persistent and determined, especially in the face of adversity.");
        l1.add("Translucent", "Allowing light to pass through, but not transparent.");
        l1.add("Trepidation", "A feeling of fear or agitation about something that may happen.");
        l1.add("Tantamount", "Equivalent in value, significance, or effect.");
        l1.add("Timorous", "Showing fear or nervousness.");
        l1.add("Taciturn", "Reserved or uncommunicative in speech; saying little.");
        l1.add("Truncate", "To shorten by cutting off a part; to make something shorter.");
        l1.add("Thwart", "To prevent someone's efforts or plans from succeeding.");
        l1.add("Trivial", "Of little value or importance; insignificant.");
        l1.add("Tumultuous", "Marked by confusion, disorder, or upheaval.");
        l1.add("Transitory", "Lasting only for a short time; temporary.");
        l1.add("Terrestrial", "Relating to the Earth or its inhabitants; earthly.");
        l1.add("Tranquil", "Calm and peaceful; free from disturbance.");
        l1.add("Tactile", "Relating to the sense of touch.");
        l1.add("Trenchant", "Sharp, perceptive, and effective in expression or style.");
        l1.add("Torpid", "Inactive, sluggish, or lethargic.");
        l1.add("Traverse", "To travel across or through; to navigate.");
        l1.add("Terse", "Concise and to the point; brief and clear in expression.");
        l1.add("Iconic:", "Widely recognized and admired for its significance or representation.");
        l1.add("Illuminate", " To light up or make something clearer and more understandable.");
        l1.add("Immerse:", "To fully involve or engross oneself in an activity or experience");
        l1.add("Incandescent:", " Emitting a bright, glowing light due to high temperature.");
        l1.add("Indulge: ", "To allow oneself to enjoy or partake in something pleasurable.");
        l1.add("Inquisitive:", " Curious and eager to learn or explore new things.");
        l1.add("Insatiable:", " Impossible to satisfy or quench, especially regarding desires or appetites.");
        l1.add("Intrinsic:", " Belonging naturally; inherent and essential to the nature of something.");
        l1.add("Inundate: ", "To overwhelm or flood with a large amount of something.");
        l1.add("Irresistible:", " Too attractive or appealing to be resisted or refused.");
        l1.add("Itinerary: ", "A planned route or journey, including destinations and travel details.");
        l1.add("Iridescent:", " Displaying a play of colors that seem to change as the angle of view changes");
        l1.add("Impeccable:", " Flawless and without any errors or faults.");
        l1.add("Juxtapose:", " To place two things together to highlight their differences or similarities.");
        l1.add("Jaded: ", "Tired, worn out, or lacking enthusiasm due to overexposure or experience.");
        l1.add("Jargon:", " Specialized or technical language used by a particular group or profession");
        l1.add("Juncture: ", "A critical point or moment of decision.");
        l1.add("Joviality: ", "A state of high-spiritedness and happiness.");
        l1.add("Jeopardy: ", "Danger or risk of harm or loss.");
        l1.add("Juxtaposition:", " The act of placing two things together for contrasting effect.");
        l1.add("Jocund: ", "Full of high spirits and lively merriment.");
        l1.add("Jabber: ", "To talk rapidly and incoherently.");
        l1.add("Judicious: ", "Having or exercising good judgment and discretion.");
        l1.add("Jettison: ", "To discard or cast off something unwanted or unnecessary.");
        l1.add("Kaleidoscope:", " A constantly changing pattern or sequence of elements; a colorful, shifting display.");
        l1.add("Kindle: ", "To ignite or arouse; to spark interest, enthusiasm, or emotion.");
        l1.add("Kinetic: ", "Relating to motion; possessing energy due to movement.");
        l1.add("Keen: ", "Intensely sharp or perceptive; eager, enthusiastic, or deeply interested.");
        l1.add("Knoll: ", "A small, rounded hill; a mound or eminence in a landscape.");
        l1.add("Kernel: ", "The central, essential, or most important part of something; a seed's core.");
        l1.add("Knack: ", "A special skill or talent for doing something easily and naturally.");
        l1.add("Knight: ", "A title historically given to a mounted warrior of high social rank.");
        l1.add("Ken: ", "One's range of knowledge or perception; understanding or awareness.");
        l1.add("Kiosk: ", "A small structure or booth used for information, vending, or advertising purposes.");
        l1.add("Karaoke: ", "An entertainment activity where people sing along to pre-recorded music with lyrics displayed.");
        l1.add("Kudos: ", "Praise, recognition, or admiration for an achievement or accomplishment.");
        l1.add("Kaleidoscopic:", " Marked by a constantly changing, diverse, or colorful array of elements.");
        l1.add("Keystone: ", "The central, integral part that holds a structure together or forms its apex.");
        l1.add("Kibitz: ", "To offer unsolicited advice, especially while watching a game");
        l1.add("Luminous:", " Emitting or reflecting light; bright, shining, or glowing.");
        l1.add("Lethargic: ", "Sluggish, drowsy, lacking energy or enthusiasm.");
        l1.add("Labyrinth:", " A complex network of paths or passages; a maze.");
        l1.add("Loquacious: ", "Talkative, chatty, fond of excessive talking.");
        l1.add("Luminance:", " The intensity of light emitted from or reflected by a surface.");
        l1.add("Lethal: ", "Causing or capable of causing death or great harm.");
        l1.add("Lugubrious:", " Mournful, sad, often to an exaggerated degree.");
        l1.add("Lachrymose: ", "Tearful, weepy, prone to shedding tears.");
        l1.add("Lexicon: ", "The vocabulary of a person, language, or branch of knowledge.");
        l1.add("Laconic: ", "Using few words, concise to the point of appearing rude or mysterious.");
        l1.add("Languid: ", "lacking in vigor or vitality; slow, relaxed, or dreamy.");
        l1.add("Lucid: ", "Clear, easy to understand; mentally sound and rational.");
        l1.add("Levity: ", "Lightness of manner or speech, frivolity, lack of seriousness.");
        l1.add("Lapidary: ", "Relating to the cutting, engraving, or polishing of stones, often for jewelry.");
        l1.add("Luddite: ", "A person opposed to new technology, especially ");
        l1.add("Melancholy:", " A feeling of deep sadness or sorrow; a pensive and gloomy state of mind.");
        l1.add("Magnanimous: ", "Generous and noble in spirit;");
        l1.add("Metamorphosis: ", "A dramatic transformation or change in form, appearance, ");
        l1.add("Myriad: ", "A countless or extremely large number;");
        l1.add("Meticulous:", " Showing great attention to detail;");
        l1.add("Maverick: ", "An independent-minded person who refuses to conform to the norms or rules.");
        l1.add("Mirth: ", "A feeling of joy, amusement, or happiness, often expressed through laughter.");
        l1.add("Munificent:", " Extremely generous in giving, often with a sense of abundance or lavishness.");
        l1.add("Morose: ", "Characterized by a sullen and gloomy disposition; ");
        l1.add("Modicum: ", "A small or moderate amount of something");
        l1.add("Mellifluous:", " Flowing smoothly and melodiously,");
        l1.add("Malinger: ", "To pretend to be ill or exaggerate symptoms in order to avoid work or duties.");
        l1.add("Mercurial: ", "Characterized by unpredictable changes in mood or behavior; volatile and erratic.");
        l1.add("Magnate: ", "A person of great influence, power, or wealth in a particular field or industry.");
        l1.add("Malleable: ", "Capable of being easily shaped, molded,");
        l1.add("Nebula: ", "A cloud of gas and dust in space, often where new stars are born.");
        l1.add("Nefarious: ", "Wicked or criminal in nature, typically involving evil actions or intentions.");
        l1.add("Nostalgia:", " A sentimental longing or affection for the past");
        l1.add("Nascent: ", "In the early stages of development or existence; ");
        l1.add("Nomenclature:", " A system of naming or classifying things, especially in a particular field of study.");
        l1.add("Nonchalant: ", "Coolly unconcerned or indifferent;");
        l1.add("Nocturnal: ", "Active or occurring during the night; ");
        l1.add("Novice: ", "A beginner or someone who is new to a particular skill, activity");
        l1.add("Nuance: ", "A subtle difference or shade of meaning, often conveying a slight variation.");
        l1.add("Nomad: ", "A person who moves from place to place, usually without a permanent home");
        l1.add("Nurturing:", " Providing care, support, and nourishment for growth and development");
        l1.add("Nefertiti: ", "An Egyptian queen, known for her beauty");
        l1.add("Notorious: ", "Infamous or well-known for negative reasons; having a bad reputation");
        l1.add("Nautical: ", "Relating to ships, sailors, navigation, or the sea.");
        l1.add("Nexus: ", "A connection or link between things, often used to describe a\u00A0central\u00A0point.");
    }

    static void search() {
        System.out.print("Enter the word you want to search: ");
        String word = sc.next();
        LL.Node temp = l1.first;
        boolean flag = false;
        while (temp != null) {
            if (temp.word.name.startsWith(word)) {
                flag = true;
                System.out.println(temp.word.name + ":  " + temp.word.definition);
            }
            temp = temp.next;
        }
        if (!flag) {
            System.out.println("There is no word related to '" + word + "'");
            System.out.println("Would you like to add it in dictionary?(Y/N)");
            char input = sc.next().charAt(0);
            sc.nextLine();
            switch (input) {
                case 'y':
                case 'Y':
                    add_Word();
                    break;
                case 'n':
                case 'N':
                    System.out.println("Okayy");
                    break;
            }
        }
    }

    static void add_Word() {
        System.out.println("Enter the word you want to add");
        String word = sc.nextLine();
        System.out.println("Enter definition");
        String definition = sc.nextLine();
        l1.add(word, definition);
        System.out.println("Successfully added " + word + " in dictionary");
    }

    static void edit() {
        System.out.println("Enter The word whose definition you want to edit");
        String word = sc.nextLine();
        boolean flag = false;
        LL.Node temp = l1.first;
        while (temp != null) {
            if (temp.word.name.equals(word)) {
                System.out.println("The definition of " + word + " is: " + temp.word.definition);
                System.out.println("Do you want to edit?(y/n)");
                char input = sc.next().charAt(0);
                sc.nextLine();
                switch (input) {
                    case 'y':
                    case 'Y':
                        System.out.println("Enter the new definition");
                        String def = sc.nextLine();
                        temp.word.definition = def;
                        System.out.println("definition of " + word + " changed to " + def);
                        flag = true;
                        break;
                    default:
                        break;
                }
            }
            temp = temp.next;
        }
        if (!flag) {
            System.out.println("No such word found");
        }
    }

    static void delete() throws Exception {
        System.out.println("Enter the word you want to delete");
        String word = sc.nextLine();
        boolean flag = false;
        LL.Node temp = l1.first;
        if (temp.word.name.equals(word)) {
            //l1.first=null;
            l1.first = temp.next;
        } else {
            while (temp.next != null) {
                if (temp.next.word.name.equals(word)) {
                    System.out.println("Word found");
                    LL.Node del = temp.next;
                    temp.next = temp.next.next;
                    del = null;
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (!flag) {
                System.out.println("No such word found");
            }
        }

    }

    static void add_Favourites() {
        System.out.print("Enter word you want to add to favourites: ");
        String favr = sc.next();
        LL.Node temp1 = l1.first;
        boolean flag = false;
        while (temp1 != null) {
            if (temp1.word.name.equalsIgnoreCase(favr)) {
                fav.add(favr, temp1.word.definition);
                flag = true;
                break;
            }
            temp1 = temp1.next;
        }
        if (!flag) {
            System.out.println("There is no word related to '" + favr + "'");
        } else {
            System.out.println("|> Word added to Favourites.");
        }
    }

    static void display(LL obj) {
        LL.Node temp = obj.first;
        while (temp != null) {
            System.out.println(temp.word.name + ": " + temp.word.definition);
            temp = temp.next;
        }
    }

    static void display_fav() {
        if (fav.first == null) {
            System.out.println("No words added to favourites");
        } else {
            System.out.println("Favourites: ");
            display(fav);
        }
    }

    static void display_homonyms() {
        LL.Node temp = l1.first;
        while (temp.next != null) {
            if (temp.word.name.equals(temp.next.word.name)) {
                System.out.println(temp.word.name + ": " + temp.word.definition);
                System.out.println(temp.word.name + ": " + temp.next.word.definition);
            }
            temp = temp.next;
        }
    }
    static class LL {
        class Node {
            Words word;
            Node next;

            Node(Words word) {
                this.word = word;
                this.next = null;
            }
        }

        Node first = null;

        void add(String name, String definition) {
            name = name.toLowerCase();
            Words word = new Words(name, definition);
            Node n = new Node(word);
            if (first == null) {
                first = n;
            } else if (word.name.compareTo(first.word.name) <= 0) {
                n.next = first;
                first = n;
            } else {
                Node temp = first;
                boolean flag = false;
                while (temp.next != null) {
                    if (word.name.compareToIgnoreCase(temp.next.word.name) <= 0) {
                        n.next = temp.next;
                        temp.next = n;
                        flag = true;
                        break;
                    }
                    temp = temp.next;
                }
                if (!flag) {
                    addLast(n);
                }
            }
        }

        void addLast(Node n) {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }

        void display() {
            Node temp = first;
            int count = 0;
            while (temp != null) {
                System.out.println(++count + ") " + temp.word.name + ":   " + temp.word.definition);
                temp = temp.next;
            }
        }
    }
}