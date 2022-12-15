# Repository Tree Structure\n
.
├── .devcontainer
│   └── devcontainer.json
├── .github
│   └── workflows
│       └── file-structure.yml
├── .vscode
│   └── settings.json
├── README.md
└── notes
    ├── InsuranceSuite 10.0 Developer Fundamentals
    │   ├── Essentials Lessons
    │   │   ├── Creating New Entities.csv
    │   │   ├── Editable List Views.csv
    │   │   ├── Entity Names.csv
    │   │   ├── Input Sets.csv
    │   │   ├── List Views.csv
    │   │   ├── Modes.csv
    │   │   ├── Partial Page Update.csv
    │   │   ├── Popups.csv
    │   │   ├── Subtypes.csv
    │   │   ├── Typelists.csv
    │   │   └── Validation.csv
    │   └── Kickstart Lessons
    │       ├── Atomic Widgets.csv
    │       ├── Code Generation and Debugging.csv
    │       ├── Detail Views.csv
    │       ├── Enhancements.csv
    │       ├── Extending the Data Model.csv
    │       ├── Gosu Rules.csv
    │       ├── Introduction to Gosu.csv
    │       ├── Introduction to Guidewire Configuration.csv
    │       ├── Introduction to the Data Model.csv
    │       ├── Introductions to Locations.csv
    │       └── The User Interface Architecture.csv
    ├── PolicyCenter 10.0 Configuration
    │   ├── Essentials Lessons
    │   │   ├── Assigning Activities.csv
    │   │   ├── Concepts of Revisioning Contacts and locations.csv
    │   │   ├── Creating Activities.csv
    │   │   ├── Introduction to Permission Configuration.csv
    │   │   └── The Job Lifecycle.csv
    │   └── Kickstart Lessons
    │       ├── Approving Underwriting Issues.csv
    │       ├── Concepts of Revisioning.csv
    │       ├── Configuring Job Wizards.csv
    │       ├── Configuring Location Groups and Pages.csv
    │       ├── Contacts and Locations.csv
    │       ├── PolicyCenter Data Model.csv
    │       ├── Raising Underwriting Issues.csv
    │       └── Validation Classes.csv
    ├── PolicyCenter Introduction
    │   ├── Essentials Lessons
    │   │   ├── Activities.csv
    │   │   ├── Concepts of Revisioning.csv
    │   │   ├── Contingencies.csv
    │   │   ├── Coverage Terms.csv
    │   │   ├── Coverages.csv
    │   │   ├── Documents.csv
    │   │   ├── Modifiers.csv
    │   │   ├── Notes.csv
    │   │   ├── Policy Holds and Underwriting Referral Reasons.csv
    │   │   ├── PolicyCenter Data Model.csv
    │   │   ├── Premium Audits.csv
    │   │   ├── Product Model Availability.csv
    │   │   ├── Products and Policy Lines.csv
    │   │   ├── Question Sets and Offerings.csv
    │   │   ├── Rating Basics.csv
    │   │   ├── Roles and Permissions.csv
    │   │   └── Validation.csv
    │   └── Kickstart Lessons
    │       ├── Accounts.csv
    │       ├── Cancellation, Reinstatement, and Rewrite.csv
    │       ├── Forms.csv
    │       ├── Full Application Submission.csv
    │       ├── Introduction to Underwriting Authority.csv
    │       ├── Managing Underwriting Authority.csv
    │       ├── Organizations and Producer Codes.csv
    │       ├── Out of Sequence Transactions.csv
    │       ├── Policy Changes and Preemptions.csv
    │       ├── Policy File.csv
    │       ├── Policy Tools.csv
    │       ├── Policy Transactions.csv
    │       ├── Product Model Introduction.csv
    │       ├── Renewals.csv
    │       └── Users and Groups.csv
    ├── json-to-csv.py
    └── notes.json

14 directories, 73 files
.
├── .devcontainer
│   └── devcontainer.json
├── .git
│   ├── FETCH_HEAD
│   ├── HEAD
│   ├── branches
│   ├── config
│   ├── description
│   ├── hooks
│   │   ├── applypatch-msg.sample
│   │   ├── commit-msg.sample
│   │   ├── fsmonitor-watchman.sample
│   │   ├── post-update.sample
│   │   ├── pre-applypatch.sample
│   │   ├── pre-commit.sample
│   │   ├── pre-merge-commit.sample
│   │   ├── pre-push.sample
│   │   ├── pre-rebase.sample
│   │   ├── pre-receive.sample
│   │   ├── prepare-commit-msg.sample
│   │   ├── push-to-checkout.sample
│   │   └── update.sample
│   ├── index
│   ├── info
│   │   └── exclude
│   ├── logs
│   │   ├── HEAD
│   │   └── refs
│   │       ├── heads
│   │       │   └── main
│   │       └── remotes
│   │           └── origin
│   │               └── main
│   ├── objects
│   │   ├── 00
│   │   │   └── 941a6f406ea43230025ee75536952437083d0a
│   │   ├── 04
│   │   │   └── 03f268afaeb58c57abcb0607e749f26777ac46
│   │   ├── 07
│   │   │   ├── 863534e32d34849c69f0c048519edad5be5da3
│   │   │   └── c45509bd11846ee104b47e72624bcf06fa4cc5
│   │   ├── 11
│   │   │   └── 3013ad5fda7037e077ac09e3ee589bb215e33c
│   │   ├── 12
│   │   │   └── a31dc41800360a8139aea6fa5557e7d02ce217
│   │   ├── 13
│   │   │   └── 6768fb0ab61305b1939a8f4ecbad4498a78a87
│   │   ├── 16
│   │   │   └── cdb3763378c406e4788e9378986e69af70f367
│   │   ├── 18
│   │   │   └── cb40830e7e6ade441b00a21961be7364b5442e
│   │   ├── 19
│   │   │   └── 0511750ffb87fcbfff44ce96fb75be3c7ec974
│   │   ├── 20
│   │   │   └── 601520ed159b81e5ee93fd288932a3e0251de4
│   │   ├── 23
│   │   │   └── 9a1218fd5f93a9a72b143206e20f6c1fc72ec7
│   │   ├── 25
│   │   │   └── ce1a76b39de31249433b515b78725853c34334
│   │   ├── 2e
│   │   │   └── 8e1679e6656a1dff43673cd99c555a453ed3e3
│   │   ├── 35
│   │   │   ├── 2a064edbc12d3178a7dfa5e2225732a772bd9e
│   │   │   └── f8f36f7daebce48a4d176e83855ec7e496d18f
│   │   ├── 36
│   │   │   └── 2deec912aed7d6020cedbd42976d7bf541ed30
│   │   ├── 38
│   │   │   └── 641d8aeef39c83c092725c15d32dfae1403b19
│   │   ├── 39
│   │   │   └── 901a3e8af57f89189cb3f2ed5e190da5344b6a
│   │   ├── 3a
│   │   │   └── f488bedaec456672d4af9b521e4678e86621bb
│   │   ├── 3d
│   │   │   ├── 4931862b49bcfbd4dd1e1f1889598b23aec943
│   │   │   └── bbe10f88fdfb53e3d4c40e0f2ca36ed4187c23
│   │   ├── 41
│   │   │   └── 5107ae4995b7a3849df6fd9a2a1f3c9965eefe
│   │   ├── 43
│   │   │   └── 33beb5e8fc594798274eaaa37ada28316b4da2
│   │   ├── 46
│   │   │   └── 20b0fd4024a9239e84e69695833901be53d394
│   │   ├── 49
│   │   │   └── bc60e92e9b708158ff83b8d421b15bf4458a43
│   │   ├── 4a
│   │   │   └── 272094d993f58b9759249a9e91774851472bcc
│   │   ├── 4c
│   │   │   └── 3c9ea17c8bae9662d6c1be13f245c26de77ebb
│   │   ├── 55
│   │   │   ├── 4bc4e21d667d47241106ec1c549e468ba8e305
│   │   │   └── 93efe54470007fe1bbbd925c3802b40281c6ec
│   │   ├── 5a
│   │   │   ├── 2fd9cf2cade88861c0900f6c48bda49f2d445b
│   │   │   ├── 67ef558fa5bb8f9fc7b3c7a867e9b79f707c51
│   │   │   └── aee96d1372fba11a2e5c4cebb0d33d788214a2
│   │   ├── 5d
│   │   │   └── bab9f5bd87406a211d1de47af7b681bf89a2bd
│   │   ├── 5f
│   │   │   └── 5e9cda4896fa0220d6c2ed0a28455e4a86f48b
│   │   ├── 65
│   │   │   └── 21adc0412b9e456dad5b215bf65dd43be31cc5
│   │   ├── 66
│   │   │   ├── f3099a4911d8edac01f61844d66ba3b78cdb64
│   │   │   └── fa0a93e93a0b8cb3feb4eef1701f3a758ec495
│   │   ├── 6a
│   │   │   └── dbcc06f50e0aeb7ab72fe90f9009df754bf3ab
│   │   ├── 6b
│   │   │   ├── 46ee2f52e3a84edf6cb9a8b30a3252f0850180
│   │   │   └── 88e075e91da20d03a29c12132e4a9112fafa48
│   │   ├── 6f
│   │   │   └── 0d313574129cd90329e88f1e5cb77c79f9f2dc
│   │   ├── 70
│   │   │   └── 446a24529dd521bbcb19bf70933b22cbe4d78a
│   │   ├── 7b
│   │   │   └── b27c0059fa524ad3ce0156618acfeea7fd257b
│   │   ├── 7d
│   │   │   ├── 6e16a01498d0f02d044d30e3fe3720298877ee
│   │   │   └── 8866e7d00422cf3154e6edf8ca8a91a6937fd6
│   │   ├── 7f
│   │   │   └── 99120bc56b15ef7a04ca9d76941fd6e08a5bcf
│   │   ├── 86
│   │   │   └── 317d7a22353eaa2c6fa9df062a627a0329e8b5
│   │   ├── 88
│   │   │   └── 8dc5cf7b1a007c4084bc8f15062bab46011aca
│   │   ├── 8e
│   │   │   └── 1dd8e5a3d66ce6bdc805f368bbfde7ffbc6679
│   │   ├── 8f
│   │   │   └── 36f6c99aef5b7902c09689146114e25ed60bc3
│   │   ├── 95
│   │   │   └── 8925a50019a35fddffd267cdbb668095daa203
│   │   ├── 9d
│   │   │   └── 56b5eb0386f5b7ac78fbd7963bd6589e5a87e1
│   │   ├── a8
│   │   │   └── c7265184e635a554fcb5089e52ce85792db344
│   │   ├── a9
│   │   │   └── 8aff393fc23a11c7a2924a5433d87d09d8bbfb
│   │   ├── af
│   │   │   └── 65f5ee74e47019d2cd60b98325125e65ebb37e
│   │   ├── b1
│   │   │   └── 5e630801ef02070b7ead18499293054734dfa0
│   │   ├── b3
│   │   │   └── 0979e2e4a177d262630af2b663ab65c477260f
│   │   ├── b5
│   │   │   └── be088f4319f684957407a6ee8945f648ee5347
│   │   ├── b6
│   │   │   └── 730622d6f747324be6eff4f0d3803b251cbdaa
│   │   ├── ba
│   │   │   └── fb0177b5afd478f4b604315b8d08d290e1e2f8
│   │   ├── bd
│   │   │   └── 459638656f56c36c57ee8336c24e7b29527943
│   │   ├── bf
│   │   │   ├── e8bf853147f4ba71f60e21a75b7ebafc80efff
│   │   │   └── f0422da18557171273e4596a1b9aba8eedad9d
│   │   ├── c1
│   │   │   └── 4f6f673313306e03e770817a04de613374884d
│   │   ├── c7
│   │   │   └── 72ebeaf4e19171a7235800117561c5ae3c7d47
│   │   ├── c8
│   │   │   └── ef38bf7076124c68b19f44214a2bf4ec18922f
│   │   ├── c9
│   │   │   └── bc0492b101d68d450ae2f79e450b0a7a377477
│   │   ├── ca
│   │   │   └── 5d2f97bb12597304bc74fcf499afbf557b7236
│   │   ├── d6
│   │   │   ├── 64c9c566f41f40c427e98a802d9c703a460f5a
│   │   │   └── 7d6a3d3db02e28a32931dd6d42f792751dbb66
│   │   ├── d7
│   │   │   ├── 605c594ca913eb91350d9e41716c4526bd1e28
│   │   │   └── c66cd5eee45cc4020191566a067430b469deba
│   │   ├── db
│   │   │   └── 6d71d3a7f89d943219cf25f39487aa5b7c4cb0
│   │   ├── dc
│   │   │   └── 7201ede0c6acdd87e8cd93afdb02e2699a6901
│   │   ├── dd
│   │   │   └── 2c187d8118465886d15b87b4f44ce00130eb3c
│   │   ├── e0
│   │   │   └── c2105feddd8f7d676f5ff9892ca8e809a372d0
│   │   ├── e7
│   │   │   ├── 025f30de4a8c8526ad8843ecd6559c96d29cb5
│   │   │   └── b394b6e692179aef7d5d4dd203bf9ae05c095e
│   │   ├── e8
│   │   │   └── 2b2bba5ef01785aa935f9557ce1d63a8c0b333
│   │   ├── eb
│   │   │   └── a27d753ace44e261ef45603bf485b61c90ccb1
│   │   ├── f7
│   │   │   └── fbc9db5b095bc2f699ddc926e48e68f85c19dd
│   │   ├── f8
│   │   │   └── e5ca8c178c1c67dbbe6dad211859ff29ade4f6
│   │   ├── f9
│   │   │   └── 205c92bd994c65edb5a90893db990c628762c8
│   │   ├── fc
│   │   │   └── a20e680102ae500849afe9df448bd53a5c462f
│   │   ├── fe
│   │   │   └── fe17e00c89c6d0aeacb80959a35e18489b2d06
│   │   ├── ff
│   │   │   └── 872a66635856215825403cbad111a87a726bbd
│   │   ├── info
│   │   └── pack
│   ├── refs
│   │   ├── heads
│   │   │   └── main
│   │   ├── remotes
│   │   │   └── origin
│   │   │       └── main
│   │   └── tags
│   └── shallow
├── .github
│   └── workflows
│       └── file-structure.yml
├── .vscode
│   └── settings.json
├── README.md
└── notes
    ├── InsuranceSuite 10.0 Developer Fundamentals
    │   ├── Essentials Lessons
    │   │   ├── Creating New Entities.csv
    │   │   ├── Editable List Views.csv
    │   │   ├── Entity Names.csv
    │   │   ├── Input Sets.csv
    │   │   ├── List Views.csv
    │   │   ├── Modes.csv
    │   │   ├── Partial Page Update.csv
    │   │   ├── Popups.csv
    │   │   ├── Subtypes.csv
    │   │   ├── Typelists.csv
    │   │   └── Validation.csv
    │   └── Kickstart Lessons
    │       ├── Atomic Widgets.csv
    │       ├── Code Generation and Debugging.csv
    │       ├── Detail Views.csv
    │       ├── Enhancements.csv
    │       ├── Extending the Data Model.csv
    │       ├── Gosu Rules.csv
    │       ├── Introduction to Gosu.csv
    │       ├── Introduction to Guidewire Configuration.csv
    │       ├── Introduction to the Data Model.csv
    │       ├── Introductions to Locations.csv
    │       └── The User Interface Architecture.csv
    ├── PolicyCenter 10.0 Configuration
    │   ├── Essentials Lessons
    │   │   ├── Assigning Activities.csv
    │   │   ├── Concepts of Revisioning Contacts and locations.csv
    │   │   ├── Creating Activities.csv
    │   │   ├── Introduction to Permission Configuration.csv
    │   │   └── The Job Lifecycle.csv
    │   └── Kickstart Lessons
    │       ├── Approving Underwriting Issues.csv
    │       ├── Concepts of Revisioning.csv
    │       ├── Configuring Job Wizards.csv
    │       ├── Configuring Location Groups and Pages.csv
    │       ├── Contacts and Locations.csv
    │       ├── PolicyCenter Data Model.csv
    │       ├── Raising Underwriting Issues.csv
    │       └── Validation Classes.csv
    ├── PolicyCenter Introduction
    │   ├── Essentials Lessons
    │   │   ├── Activities.csv
    │   │   ├── Concepts of Revisioning.csv
    │   │   ├── Contingencies.csv
    │   │   ├── Coverage Terms.csv
    │   │   ├── Coverages.csv
    │   │   ├── Documents.csv
    │   │   ├── Modifiers.csv
    │   │   ├── Notes.csv
    │   │   ├── Policy Holds and Underwriting Referral Reasons.csv
    │   │   ├── PolicyCenter Data Model.csv
    │   │   ├── Premium Audits.csv
    │   │   ├── Product Model Availability.csv
    │   │   ├── Products and Policy Lines.csv
    │   │   ├── Question Sets and Offerings.csv
    │   │   ├── Rating Basics.csv
    │   │   ├── Roles and Permissions.csv
    │   │   └── Validation.csv
    │   └── Kickstart Lessons
    │       ├── Accounts.csv
    │       ├── Cancellation, Reinstatement, and Rewrite.csv
    │       ├── Forms.csv
    │       ├── Full Application Submission.csv
    │       ├── Introduction to Underwriting Authority.csv
    │       ├── Managing Underwriting Authority.csv
    │       ├── Organizations and Producer Codes.csv
    │       ├── Out of Sequence Transactions.csv
    │       ├── Policy Changes and Preemptions.csv
    │       ├── Policy File.csv
    │       ├── Policy Tools.csv
    │       ├── Policy Transactions.csv
    │       ├── Product Model Introduction.csv
    │       ├── Renewals.csv
    │       └── Users and Groups.csv
    ├── json-to-csv.py
    └── notes.json

105 directories, 185 files
