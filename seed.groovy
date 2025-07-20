folder("dev") {
    multibranchPipelineJob('cms') {
        branchSources {
            git {
                id('cms')
                remote('https://gitlab.com/greensight/ensi/cms/cms.git')
            }
        }
        properties {
            folderConfigFiles {
                configs {
                    customConfig {
                        id("env")
                        name("env")
                        comment("")
                        content("""
    BANANA=ananas
    """)
                    }
                }
            }
        }
    }
}