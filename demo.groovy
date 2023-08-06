Job('DSL_Groovy'){
	description("${name Date()}, Hi")
	scm{
	   git('https://github.com/kiran1036999/G1.git','master')
	}
	
	trigger{
	   scm('* * * * *')
	}
	
	steps{
	   maven('clean package','pom.xml')
	}
	
	publishers{
		archiveArtifacts '**/*jar'
	}
}