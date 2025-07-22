import { ScrollArea } from '@/components/ui/scroll-area';
import { Tabs, TabsContent, TabsList, TabsTrigger } from '@/components/ui/tabs';
import React from 'react'
import CreateCommentForm from './CreateCommentForm';

const IssueDetails = () => {
    const {projectId, issueId} = useParams();
  return (
    <div className='px-20 py-8 text-gray-400'>
        <div className='flex justify-between border p-10 rounded-lg'>

            <ScrollArea className="h-[80vh] w-[60%]">
                <div>
                    <h1 className='text-lg font-semibold text-gray-400'>
                        create navbar
                    </h1>
                    <div className='py-5'>
                        <h2 className='font-semibold
                         text-gray-400'>Description</h2>
                         <p>Lorem ipsum dolor sit amet consectetur adipisticing elit.</p>
                    </div>
                    <div className='mt-5'>
                        <h1 className='pb-3'>Activity</h1>
                        <Tabs defaultValue='comments' className='w-[400px]'>
                            <TabsList className='mb-5'>
                                <TabsTrigger value="all">
                                    All
                                </TabsTrigger>
                                <TabsTrigger value="comments">
                                    Comments
                                </TabsTrigger>
                                <TabsTrigger value="history">
                                    History
                                </TabsTrigger>
                            </TabsList>
                            <TabsContent value="all">
                                all make changes to your account here
                            </TabsContent>
                            <TabsContent value="comments">
                                <CreateCommentForm issueId={issueId}/>
                            </TabsContent>
                            <TabsContent value="history">
                                History change your password here
                            </TabsContent>
                        </Tabs>
                    </div>
                </div>

            </ScrollArea>
        </div>
    </div>
  )
}

export default IssueDetails